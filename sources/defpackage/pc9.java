package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pc9 {
    public final ny8 a;

    public pc9(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, String str) {
        String str2;
        ae9 ae9Var = (ae9) this.a.getValue();
        ylc ylcVar = new ylc("settingsType", "Design");
        ylc ylcVar2 = new ylc("paramValue", str);
        if (i == 1) {
            str2 = "automatically";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "toggle";
        }
        ae9.k(ae9Var, "SETTINGS", "LANGUAGE", ouk.a(ylcVar, ylcVar2, new ylc("paramAdditionally", ouk.a(new ylc("typeOfChange", str2)))), 8);
    }
}
