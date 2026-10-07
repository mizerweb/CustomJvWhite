package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class gih {
    public final wxb a;
    public final boolean b;
    public final String c;
    public final ifh d;
    public final ifh e;
    public final ifh f;
    public final ifh g;
    public final AtomicReference h = new AtomicReference();

    public gih(umi umiVar, wxb wxbVar, gjf gjfVar, ifh ifhVar, ifh ifhVar2, ifh ifhVar3, ifh ifhVar4, ny8 ny8Var) {
        this.a = wxbVar;
        this.b = a55.a(((Number) ((g5d) gjfVar).a.d().i()).intValue()) != a55.DISABLED;
        this.d = ifhVar2;
        this.e = ifhVar3;
        this.f = ifhVar4;
        this.g = ifhVar;
        tmi tmiVarA = umiVar.a();
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(tmiVarA.b);
        sb.append(" (");
        sb.append(tmiVarA.d);
        sb.append("; ");
        sb.append(tmiVarA.h);
        sb.append("; ");
        String strW = zo5.w(sb, tmiVarA.i, ")");
        try {
            this.c = URLEncoder.encode(strW, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.c = strW;
        }
    }

    public final qsb a() {
        return (qsb) this.h.updateAndGet(new cz(7, this));
    }
}
