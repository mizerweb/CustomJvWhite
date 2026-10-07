package defpackage;

import android.net.Uri;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ug5 implements fi6 {
    public final Object a;
    public final Object b;
    public volatile Object c;
    public Object d;
    public final Object e;

    public ug5(CidLogger cidLogger) {
        this.a = cidLogger;
        this.b = new CopyOnWriteArrayList();
        this.d = new aq9(1, new bq9(0.0d, 0.0d), null, true);
        this.e = new tg5(this);
    }

    public void a(zp9 zp9Var) {
        zp9Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        if (copyOnWriteArrayList.contains(zp9Var)) {
            return;
        }
        copyOnWriteArrayList.add(zp9Var);
        zp9Var.f((aq9) this.d);
    }

    public void b(zp9 zp9Var) {
        zp9Var.getClass();
        ((CopyOnWriteArrayList) this.b).remove(zp9Var);
    }

    public void c(t6f t6fVar) {
        this.c = t6fVar;
        o64 o64VarC = new k64(1, new vs4(this, 4, new dx4(this, 7, t6fVar))).c(i3f.b());
        j66 j66Var = new j66(0);
        o64VarC.a(j66Var);
        ((w74) this.d).a(j66Var);
    }

    @Override // defpackage.fi6
    public t6f h() {
        t6f t6fVarC = (t6f) this.c;
        if (t6fVarC == null) {
            xp sessionInfo = ((yp) this.a).getSessionInfo();
            t6f t6fVar = t6f.c;
            ((mo) this.b).getClass();
            t6f t6fVarB = t6fVar.b("CGPGAGLGDIHBABABA");
            if ((sessionInfo != null ? sessionInfo.b : null) != null) {
                t6fVarB = t6fVarB.d(Uri.parse(sessionInfo.b));
            }
            t6fVarC = (sessionInfo != null ? sessionInfo.a : null) != null ? t6fVarB.c(sessionInfo.a) : t6fVarB;
        }
        this.c = t6fVarC;
        return t6fVarC;
    }

    public ug5(yp ypVar, mo moVar) {
        this.a = ypVar;
        this.b = moVar;
        this.d = new w74();
        this.e = new ReentrantLock();
    }
}
