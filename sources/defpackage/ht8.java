package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ht8 extends lvb {
    public final vyh f;
    public final khb g;

    public ht8(vyh vyhVar, qs8 qs8Var) {
        super(4);
        this.f = vyhVar;
        this.g = qs8Var.b;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final byte D() {
        s9i s9iVar;
        vyh vyhVar = this.f;
        String strM = vyhVar.m();
        try {
            x9i x9iVarA = h0m.a(strM);
            if (x9iVarA != null) {
                int i = x9iVarA.a;
                s9iVar = Integer.compareUnsigned(i, 255) > 0 ? null : new s9i((byte) i);
            }
            if (s9iVar != null) {
                return s9iVar.a;
            }
            y5h.A0(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.v74
    public final khb b() {
        return this.g;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final int i() {
        vyh vyhVar = this.f;
        String strM = vyhVar.m();
        try {
            x9i x9iVarA = h0m.a(strM);
            if (x9iVarA != null) {
                return x9iVarA.a;
            }
            y5h.A0(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.lvb, defpackage.r55
    public final long m() {
        vyh vyhVar = this.f;
        String strM = vyhVar.m();
        try {
            cai caiVarB = h0m.b(strM);
            if (caiVarB != null) {
                return caiVarB.a;
            }
            y5h.A0(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.lvb, defpackage.r55
    public final short o() {
        iai iaiVar;
        vyh vyhVar = this.f;
        String strM = vyhVar.m();
        try {
            x9i x9iVarA = h0m.a(strM);
            if (x9iVarA != null) {
                int i = x9iVarA.a;
                iaiVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new iai((short) i);
            }
            if (iaiVar != null) {
                return iaiVar.a;
            }
            y5h.A0(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.v74
    public final int v(fif fifVar) {
        throw new IllegalStateException("unsupported");
    }
}
