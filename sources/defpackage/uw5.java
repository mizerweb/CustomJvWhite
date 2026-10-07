package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class uw5 implements r36 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public uw5(List list) {
        this.a = 0;
        this.f = list;
        this.g = new kyh[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (nmcVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (nmcVar.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (nmcVar.a() == 0) {
                            z = false;
                        } else {
                            if (nmcVar.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = nmcVar.b;
                    int iA = nmcVar.a();
                    for (kyh kyhVar : (kyh[]) this.g) {
                        nmcVar.N(i);
                        kyhVar.f(iA, nmcVar);
                    }
                    this.e += iA;
                }
                break;
            default:
                nmc nmcVar2 = (nmc) this.f;
                ((kyh) this.g).getClass();
                if (this.b) {
                    int iA2 = nmcVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(nmcVar.a, nmcVar.b, nmcVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            nmcVar2.N(0);
                            if (73 == nmcVar2.A() && 68 == nmcVar2.A() && 51 == nmcVar2.A()) {
                                nmcVar2.O(3);
                                this.d = nmcVar2.z() + 10;
                            } else {
                                lvb.G0("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((kyh) this.g).f(iMin2, nmcVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.r36
    public final void f() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    lvb.b0(this.c != -9223372036854775807L);
                    for (kyh kyhVar : (kyh[]) this.g) {
                        kyhVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((kyh) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    lvb.b0(this.c != -9223372036854775807L);
                    ((kyh) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        switch (this.a) {
            case 0:
                kyh[] kyhVarArr = (kyh[]) this.g;
                for (int i = 0; i < kyhVarArr.length; i++) {
                    l5i l5iVar = (l5i) ((List) this.f).get(i);
                    m5iVar.a();
                    m5iVar.b();
                    kyh kyhVarG = lj6Var.G(m5iVar.d, 3);
                    a87 a87Var = new a87();
                    m5iVar.b();
                    a87Var.a = m5iVar.e;
                    a87Var.l = uya.n("video/mp2t");
                    a87Var.m = uya.n("application/dvbsubs");
                    a87Var.p = Collections.singletonList(l5iVar.b);
                    a87Var.d = l5iVar.a;
                    ewi.n(a87Var, kyhVarG);
                    kyhVarArr[i] = kyhVarG;
                }
                break;
            default:
                m5iVar.a();
                m5iVar.b();
                kyh kyhVarG2 = lj6Var.G(m5iVar.d, 5);
                this.g = kyhVarG2;
                a87 a87Var2 = new a87();
                m5iVar.b();
                a87Var2.a = m5iVar.e;
                a87Var2.l = uya.n("video/mp2t");
                a87Var2.m = uya.n("application/id3");
                ewi.n(a87Var2, kyhVarG2);
                break;
        }
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public uw5() {
        this.a = 1;
        this.f = new nmc(10);
        this.c = -9223372036854775807L;
    }
}
