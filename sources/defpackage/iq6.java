package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iq6 {
    public final rs6 a;
    public final e5d b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public File j;
    public File k;
    public File l;
    public File m;
    public File n;
    public List o;

    public iq6(rs6 rs6Var, e5d e5dVar) {
        this.a = rs6Var;
        this.b = e5dVar;
    }

    public final File a(b81 b81Var) {
        int iOrdinal = b81Var.ordinal();
        rs6 rs6Var = this.a;
        switch (iOrdinal) {
            case 0:
                if (this.c == null) {
                    this.c = new File(((ju6) rs6Var).b());
                }
                return this.c;
            case 1:
                if (this.d == null) {
                    ju6 ju6Var = (ju6) rs6Var;
                    ju6Var.getClass();
                    this.d = ju6.j(ju6Var.c(), "mediaCache");
                }
                return this.d;
            case 2:
                if (this.f == null) {
                    this.f = ((ju6) rs6Var).n();
                }
                return this.f;
            case 3:
                if (((Boolean) this.b.R3.a(e5d.S6[253]).i()).booleanValue()) {
                    if (this.h == null) {
                        this.h = ((ju6) rs6Var).e(true);
                    }
                    return this.h;
                }
                if (this.g == null) {
                    this.g = ((ju6) rs6Var).e(false);
                }
                return this.g;
            case 4:
                if (this.j == null) {
                    ju6 ju6Var2 = (ju6) rs6Var;
                    ju6Var2.getClass();
                    this.j = ju6.j(ju6Var2.b(), "gifCache");
                }
                return this.j;
            case 5:
                if (this.i == null) {
                    ju6 ju6Var3 = (ju6) rs6Var;
                    ju6Var3.getClass();
                    this.i = ju6.j(ju6Var3.b(), "stickerCache");
                }
                return this.i;
            case 6:
                if (this.e == null) {
                    this.e = ((ju6) rs6Var).o();
                }
                return this.e;
            case 7:
                if (this.k == null) {
                    ju6 ju6Var4 = (ju6) rs6Var;
                    ju6Var4.getClass();
                    this.k = ju6.j(ju6Var4.b(), "exo_files_cache");
                }
                return this.k;
            case 8:
                if (this.l == null) {
                    ju6 ju6Var5 = (ju6) rs6Var;
                    ju6Var5.getClass();
                    this.l = ju6.j(ju6Var5.b(), "videoCache");
                }
                return this.l;
            case 9:
                if (this.m == null) {
                    ju6 ju6Var6 = (ju6) rs6Var;
                    ju6Var6.getClass();
                    this.m = ju6.j(ju6Var6.b(), "ringtones");
                }
                return this.m;
            case 10:
                if (this.n == null) {
                    ju6 ju6Var7 = (ju6) rs6Var;
                    ju6Var7.getClass();
                    this.n = ju6.j(ju6Var7.c(), "ringtones");
                }
                return this.n;
            default:
                return null;
        }
    }
}
