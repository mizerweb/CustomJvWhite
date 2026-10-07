package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadHelper$LiveContentUnsupportedException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fs5 implements y4a, t0a, Handler.Callback {
    public final ur0 a;
    public final gs5 b;
    public final y65 c = new y65();
    public final ArrayList d = new ArrayList();
    public final Handler e = vqi.q(new w84(2, this));
    public final HandlerThread f;
    public final Handler g;
    public ush h;
    public xbf i;
    public u0a[] j;
    public boolean k;

    public fs5(ur0 ur0Var, gs5 gs5Var) {
        this.a = ur0Var;
        this.b = gs5Var;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
        this.f = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.g = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(u0aVar);
        if (arrayList.isEmpty()) {
            this.g.removeMessages(2);
            this.e.sendEmptyMessage(1);
        }
    }

    @Override // defpackage.y4a
    public final void a(ur0 ur0Var, ush ushVar) {
        u0a[] u0aVarArr;
        if (this.h != null) {
            return;
        }
        if (ushVar.m(0, new tsh(), 0L).a()) {
            this.e.obtainMessage(2, new DownloadHelper$LiveContentUnsupportedException()).sendToTarget();
            return;
        }
        this.h = ushVar;
        this.j = new u0a[ushVar.h()];
        int i = 0;
        while (true) {
            u0aVarArr = this.j;
            if (i >= u0aVarArr.length) {
                break;
            }
            u0a u0aVarE = this.a.e(new x4a(ushVar.l(i)), this.c, 0L);
            this.j[i] = u0aVarE;
            this.d.add(u0aVarE);
            i++;
        }
        for (u0a u0aVar : u0aVarArr) {
            u0aVar.s(this, 0L);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Handler handler = this.g;
        ur0 ur0Var = this.a;
        if (i == 1) {
            if (ur0Var instanceof yvd) {
                ((yvd) ur0Var).u = this;
            }
            ur0Var.n(this, null, z3d.c);
            handler.sendEmptyMessage(2);
            return true;
        }
        ArrayList arrayList = this.d;
        int i2 = 0;
        if (i == 2) {
            try {
                if (this.j == null) {
                    ur0Var.m();
                } else {
                    while (i2 < arrayList.size()) {
                        ((u0a) arrayList.get(i2)).n();
                        i2++;
                    }
                }
                handler.sendEmptyMessageDelayed(2, 100L);
                return true;
            } catch (IOException e) {
                this.e.obtainMessage(2, e).sendToTarget();
                return true;
            }
        }
        if (i == 3) {
            u0a u0aVar = (u0a) message.obj;
            if (arrayList.contains(u0aVar)) {
                ea9 ea9Var = new ea9();
                ea9Var.a = 0L;
                u0aVar.u(new fa9(ea9Var));
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        u0a[] u0aVarArr = this.j;
        if (u0aVarArr != null) {
            int length = u0aVarArr.length;
            while (i2 < length) {
                ur0Var.q(u0aVarArr[i2]);
                i2++;
            }
        }
        if (ur0Var instanceof yvd) {
            ((yvd) ur0Var).u = null;
        }
        ur0Var.r(this);
        handler.removeCallbacksAndMessages(null);
        this.f.quit();
        return true;
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        u0a u0aVar = (u0a) vhfVar;
        if (this.d.contains(u0aVar)) {
            this.g.obtainMessage(3, u0aVar).sendToTarget();
        }
    }
}
