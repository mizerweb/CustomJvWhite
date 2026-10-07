package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mii extends qrc {
    public mii(erc ercVar) {
        super(ercVar);
    }

    public final void B(String str, long j, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("upload_size", Long.valueOf(j));
        b9bVar.k("quality", Integer.valueOf(i));
        if (z) {
            b9bVar.k("warm_convert", 1);
        }
        if (i3 > 0) {
            b9bVar.k("init_h", Integer.valueOf(i3));
        }
        if (i2 > 0) {
            b9bVar.k("init_w", Integer.valueOf(i2));
        }
        if (i4 > 0) {
            b9bVar.k("init_b", Integer.valueOf(i4));
        }
        if (z2) {
            b9bVar.k("orig_quality", 1);
        }
        qrc.k(this, "converted", 0, str, false, null, b9bVar, 88);
    }

    public final void C(String str, int i, long j, int i2, Long l, String str2) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("attach_type", Integer.valueOf(i));
        b9bVar.k("size", Long.valueOf(j));
        b9bVar.k("cid", l);
        if (i2 > 0) {
            b9bVar.k("run_attempt", Integer.valueOf(i2));
        }
        if (str2 != null) {
            b9bVar.k("ext", str2);
        }
        qrc.x(this, str, b9bVar, null, null, 12);
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        return p90.N("class", Byte.valueOf(this.a.c().a()), "connection_type", Integer.valueOf(this.a.c().b()));
    }

    public final void z(lii liiVar, int i, int i2, Long l) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("attach_type", Integer.valueOf(i));
        if (l != null) {
            b9bVar.k("cid", Long.valueOf(l.longValue()));
        }
        if (i2 > 0) {
            b9bVar.k("run_attempt", Integer.valueOf(i2));
        }
        qrc.p(this, liiVar, b9bVar);
    }
}
