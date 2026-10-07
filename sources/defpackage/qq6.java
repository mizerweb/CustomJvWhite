package defpackage;

import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class qq6 extends aq implements qih, btc {
    public final long f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;

    public qq6(long j, long j2, String str, long j3, long j4, String str2) {
        super(j);
        this.f = j2;
        this.g = str;
        this.h = j3;
        this.i = j4;
        this.j = str2;
        this.k = qq6.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        sq6 sq6Var = (sq6) kihVar;
        String str = this.k;
        gm0.m(str, "onSuccess %s", sq6Var);
        t51 t51VarO = o();
        String str2 = sq6Var.c;
        t51VarO.c(new uq6(null, this.a));
        sfa sfaVarL = r().l(this.i);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            return;
        }
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        String strB = ixl.b(str2, (Map) ((e5d) bqVar.d.getValue()).g().i());
        String str3 = this.j;
        if (str3 == null) {
            str3 = "";
        }
        pjh pjhVar = new pjh(this.i, str3, 0L, 0L, 0L, 0L, str2, true, false, this.f, this.g, 0, false, false, ns5.CHAT, strB);
        gm0.m(str, "fileAttachDownloader.downloadAttach(%s)", pjhVar);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        ((wp6) bqVar2.N.getValue()).b(pjhVar);
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.g;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onFail " + yhhVar, null);
            }
        }
        sfa sfaVarL = r().l(this.i);
        String str2 = this.j;
        if (sfaVarL == null || sfaVarL.j == wja.DELETED || str2 == null) {
            d();
            o().c(new yq0(this.a, yhhVar));
            return;
        }
        boolean zEquals = "file.not.found".equals(yhhVar.b);
        r().n(sfaVarL.a, str2, new hw2(zEquals, 3));
        o().c(new kfi(sfaVarL.h, this.i, false));
        if (zEquals) {
            d();
            o().c(new yq0(this.a, yhhVar));
        }
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.f;
        fileDownloadCmd.fileName = this.g;
        fileDownloadCmd.messageId = this.i;
        fileDownloadCmd.chatId = this.h;
        String str = this.j;
        if (str != null && str.length() != 0) {
            fileDownloadCmd.attachLocalId = str;
        }
        return sia.toByteArray(fileDownloadCmd);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_FILE_DOWNLOAD_CMD;
    }

    @Override // defpackage.btc
    public final atc j() {
        rt2 rt2VarN;
        sfa sfaVarL = r().l(this.i);
        return (sfaVarL == null || sfaVarL.j == wja.DELETED || (rt2VarN = p().N(this.h)) == null || (rt2VarN.A() == 0 && !rt2VarN.y0()) || rt2VarN.b.c != kx2.a) ? atc.c : atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        rt2 rt2VarN = p().N(this.h);
        sfa sfaVarL = r().l(this.i);
        if (rt2VarN == null) {
            ore.p("Required value was null.");
            return null;
        }
        long jA = rt2VarN.A();
        if (sfaVarL != null) {
            return new wy2(this.f, jA, sfaVarL.b);
        }
        ore.p("Required value was null.");
        return null;
    }
}
