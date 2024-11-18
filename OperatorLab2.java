class PermissionManager{
    public static final int READ = 0; // 読み praivateで作成したがアクセス制限でエラーのためpublicに変更
    public static final int WRITE = 1; //書き
    public static final int EDIT = 2; // 修正
    public static final int DELETE = 3; // 削除

    private byte permissions = 0; // 初期権限と設定はすべて無効化

    // 権利設定メゾット
    void setPermission(int permission, boolean enable){
        if (enable){                          // enableがtrueの時、permissionsの位置にあるbitを１に設定
            permissions |= (1 << permission);
        } else {                              // enableがFalseの時、permissionsの位置にあるbitを0に設定
            permissions &= ~(1 << permission);
        }
    }

    // 権利確認メゾット
    boolean checkPermission(int permission){
        // 権利する範囲を設定 ０から３まで
        if (permission < 0 || permission >= 4) { // 3までの範囲なので>=4としてpermissionが４になった時にはじく
            return false;
        }

        // permissionの位置が０か１を確認
        return (permissions & (1 << permission)) != 1;
    }

    // 全ての権利を初期化するメソッド 全てのbitを０に設定する
    void removeAllPermissions(){
        permissions = 0;
    }
}

public class OperatorLab2{
    public static void main(String[] args){
        PermissionManager pm = new PermissionManager();

        // 権利の設定
        pm.setPermission(PermissionManager.READ, false);
        pm.setPermission(PermissionManager.WRITE, false);
        pm.setPermission(PermissionManager.DELETE, false);

        // 権利確認
        System.out.println("읽이 권한: " + pm.checkPermission(PermissionManager.READ));
        System.out.println("쓰기 권한: " + pm.checkPermission(PermissionManager.WRITE));
        System.out.println("수정 권한: " + pm.checkPermission(PermissionManager.EDIT));
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE));

        // 全ての権利の除去
        pm.removeAllPermissions();
        System.out.println("읽이 권한: " + pm.checkPermission(PermissionManager.READ));
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE));
    }
}
