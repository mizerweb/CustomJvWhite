package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class awb extends dwb {
    public static final awb a = new awb();
    public static final eve b;
    public static final eve c;

    static {
        eve eveVarA = eve.a();
        eveVarA.a = 2;
        b = eveVarA;
        eve eveVarA2 = eve.a();
        eveVarA2.a = 2;
        float f = yl5.d().getDisplayMetrics().density * 5.0f;
        oc9.j("the padding cannot be < 0", f >= 0.0f);
        eveVarA2.g = f;
        c = eveVarA2;
    }

    @Override // defpackage.dwb
    public final eve a(boolean z) {
        return z ? c : b;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof awb);
    }

    public final int hashCode() {
        return 565313608;
    }

    public final String toString() {
        return "Circle";
    }
}
