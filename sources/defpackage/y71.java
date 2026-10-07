package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y71 implements d15 {
    public final /* synthetic */ int a;
    public final j6g b;
    public final w71 c;
    public final s25 d;
    public final pgg e;

    public /* synthetic */ y71(j6g j6gVar, w71 w71Var, s25 s25Var, pgg pggVar, int i) {
        this.a = i;
        this.b = j6gVar;
        this.c = w71Var;
        this.d = s25Var;
        this.e = pggVar;
    }

    @Override // defpackage.d15
    public final e15 o(aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, long j, boolean z, ArrayList arrayList, w3d w3dVar, v1i v1iVar, z3d z3dVar) {
        int i3 = this.a;
        s25 s25Var = this.d;
        switch (i3) {
            case 0:
                u25 u25VarA = s25Var.a();
                if (v1iVar != null) {
                    u25VarA.w(v1iVar);
                }
                return new z71(this.b, this.c, aa9Var, k15Var, ljfVar, i, iArr, rg6Var, i2, u25VarA, j, this.e, z, arrayList, w3dVar, z3dVar, 0);
            default:
                u25 u25VarA2 = s25Var.a();
                if (v1iVar != null) {
                    u25VarA2.w(v1iVar);
                }
                return new z71(this.b, this.c, aa9Var, k15Var, ljfVar, i, iArr, rg6Var, i2, u25VarA2, j, this.e, z, arrayList, w3dVar, z3dVar, 1);
        }
    }
}
