package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s79 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w79 b;

    public /* synthetic */ s79(w79 w79Var, int i) {
        this.a = i;
        this.b = w79Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w79 w79Var = this.b;
        switch (i) {
            case 0:
                kv5 kv5Var = w79Var.c;
                if (kv5Var != null) {
                    kv5Var.setListSelectionHidden(true);
                    kv5Var.requestLayout();
                }
                break;
            default:
                kv5 kv5Var2 = w79Var.c;
                if (kv5Var2 != null && kv5Var2.isAttachedToWindow() && w79Var.c.getCount() > w79Var.c.getChildCount() && w79Var.c.getChildCount() <= w79Var.m) {
                    w79Var.z.setInputMethodMode(2);
                    w79Var.m();
                    break;
                }
                break;
        }
    }
}
