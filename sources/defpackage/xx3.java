package defpackage;

import android.util.Size;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xx3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xx3(a5f a5fVar, yt1 yt1Var, Size size, long j) {
        this.a = 2;
        this.b = a5fVar;
        this.c = yt1Var;
        this.e = size;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((cle) this.b).Y((jme) this.c, this.d, (eme) this.e);
                return;
            case 1:
                ((cle) this.b).A((jme) this.c, this.d, (xg) this.e);
                return;
            default:
                a5f a5fVar = (a5f) this.b;
                yt1 yt1Var = (yt1) this.c;
                Size size = (Size) this.e;
                long j = this.d;
                synchronized (a5fVar) {
                    if (a5fVar.d.contains(yt1Var)) {
                        return;
                    }
                    Long l = (Long) a5fVar.c.get(yt1Var);
                    if (l != null) {
                        th.a().b(new xc2(a5fVar, j - l.longValue(), wm9.Q0(new ylc("width", EventItemValueKt.toEventItemValue(size.getWidth())), new ylc("height", EventItemValueKt.toEventItemValue(size.getHeight())))));
                        a5fVar.c.remove(yt1Var);
                        a5fVar.d.add(yt1Var);
                        break;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ xx3(cle cleVar, jme jmeVar, long j, ndi ndiVar, int i) {
        this.a = i;
        this.b = cleVar;
        this.c = jmeVar;
        this.d = j;
        this.e = ndiVar;
    }
}
