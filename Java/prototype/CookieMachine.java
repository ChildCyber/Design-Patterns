public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() {
        try {
            return (Cookie) cookie.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) {
        Cookie tempCookie = null;
        Cookie prot = new CocountCookie();
        // 设置原型
        CookieMachine cm = new CookieMachine(prot);
        System.out.println("cm: " + System.identityHashCode(cm));
        // 通过复制原型返回多个cookie
        for (int i = 0; i < 10; i++) {
            tempCookie = cm.makeCookie();
            System.out.println("tempCookie: " + System.identityHashCode(tempCookie));
        }
    }
}