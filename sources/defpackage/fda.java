package defpackage;

import java.nio.ByteBuffer;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes.dex */
public class fda implements kw7 {
    public static final /* synthetic */ int i = 0;
    public final sfa a;
    public final vg4 b;
    public final eia c;
    public final fda d;
    public final c e;
    public final uia f;
    public final zja g;
    public final e13 h;

    public fda(sfa sfaVar, vg4 vg4Var, eia eiaVar, fda fdaVar, c cVar, uia uiaVar, zja zjaVar, e13 e13Var) {
        this.a = sfaVar;
        this.b = vg4Var;
        this.c = eiaVar;
        this.d = fdaVar;
        this.e = cVar;
        this.f = uiaVar;
        this.g = zjaVar;
        this.h = e13Var;
    }

    public static Long a(String str) {
        try {
            ByteBuffer byteBufferPut = ByteBuffer.allocate(8).put(wdl.a(str));
            byteBufferPut.flip();
            return Long.valueOf(byteBufferPut.getLong());
        } catch (Throwable th) {
            gm0.s("fda", "decodeServerId error: %s", th.getMessage(), th);
            return null;
        }
    }

    public final fda b() {
        eia eiaVar = this.c;
        if (eiaVar == null || eiaVar.a != 2) {
            return null;
        }
        return eiaVar.c;
    }

    public final CharSequence c(rt2 rt2Var) {
        c cVar = this.e;
        cVar.a(rt2Var);
        cVar.f = rt2Var;
        p4c p4cVar = cVar.a;
        cVar.n(rt2Var, p4cVar.h(), p4cVar.f());
        cVar.k(rt2Var);
        return cVar.g;
    }

    public final boolean d() {
        return !this.b.f;
    }

    public final boolean e() {
        sfa sfaVar = this.a;
        e60 e60VarO = sfaVar.o();
        return e60VarO == null || ((e60VarO == null || e60VarO.h()) && e60VarO.b().size() == 1 && sfaVar.e == ((Long) e60VarO.b().get(0)).longValue());
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: getId */
    public final long getA() {
        return this.a.a;
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: i */
    public final long getC() {
        sfa sfaVar = this.a;
        ng5 ng5Var = sfaVar.G;
        return ng5Var != null ? ng5Var.b() : sfaVar.c;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }
}
