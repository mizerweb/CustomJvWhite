package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class smf extends kih {
    public String c;
    public int d;
    public b50 e;
    public String f;
    public Long g;
    public final int h;
    public boolean i;

    public smf(fka fkaVar, int i) {
        super(fkaVar);
        this.h = i;
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "callsSeed":
                this.g = Long.valueOf(ch3.T(fkaVar, 0L));
                break;
            case "isVpn":
                this.i = ch3.L(fkaVar);
                break;
            case "reg-country-code":
                this.e = b50.f(fkaVar);
                break;
            case "app-update-type":
                this.d = ch3.R(fkaVar, 0);
                break;
            case "location":
                this.c = ch3.W(fkaVar);
                break;
            case "recovery-url":
                this.f = ch3.W(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        int i = this.d;
        String strValueOf = String.valueOf(this.e);
        String str2 = this.f;
        Long l = this.g;
        boolean z = this.i;
        StringBuilder sbR = c0a.r(i, "{locationCountryCode='", str, "', appUpdateType=", ", regCountryCode=");
        nbh.G(sbR, strValueOf, ", recoveryUrl='", str2, "', callsSeed=");
        sbR.append(l);
        sbR.append(", isVpn=");
        sbR.append(z);
        sbR.append("}");
        return sbR.toString();
    }
}
