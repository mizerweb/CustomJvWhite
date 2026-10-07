package defpackage;

import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class os5 extends qrc {
    public os5(erc ercVar) {
        super(ercVar);
    }

    public static /* synthetic */ String E(os5 os5Var, int i, ns5 ns5Var, String str, int i2, Long l, int i3) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            l = null;
        }
        return os5Var.D(i, ns5Var, str, i4, l);
    }

    public final void A(long j, long j2, String str) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("size", Long.valueOf(j));
        Long lValueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            b9bVar.k("local_range", Long.valueOf(j2));
        }
        h(b9bVar, str);
    }

    public final void B(String str) {
        qrc.k(this, "copy", 3, str, true, null, null, 112);
    }

    public final void C(String str) {
        qrc.k(this, "read_headers", 1, str, false, null, null, 120);
    }

    public final String D(int i, ns5 ns5Var, String str, int i2, Long l) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k("attach_type", Integer.valueOf(i));
        b9bVar.k("place", Integer.valueOf(ns5Var.a));
        if (str != null && str.length() != 0) {
            b9bVar.k(CandidateTypeHintConfig.TYPE_HOST, str);
        }
        if (i2 > 0) {
            b9bVar.k("run_attempt", Integer.valueOf(i2));
        }
        if (l != null) {
            b9bVar.k("media_id", l);
        }
        return qrc.x(this, null, b9bVar, null, null, 13);
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        return p90.O(Integer.valueOf(this.a.c().b()), "connection_type");
    }

    public final void z(String str, String str2) {
        i(str, new ylc("protocol", str2));
    }
}
