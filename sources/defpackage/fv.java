package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fv implements cg7 {
    public final /* synthetic */ lv a;

    public fv(lv lvVar) {
        this.a = lvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fv) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(1, 0, lv.class, this.a, "selectTheme", "selectTheme(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
