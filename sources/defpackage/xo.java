package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface xo {
    static uvc q(uo uoVar) {
        return new uvc(new b1k(27, uoVar));
    }

    uo h();

    void s(uo uoVar);

    default uo v(wo woVar) {
        uo uoVarD = woVar.d(h());
        s(uoVarD);
        return uoVarD;
    }
}
