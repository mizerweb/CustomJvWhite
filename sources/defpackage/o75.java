package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.HttpStatus;
import org.webrtc.EglThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o75 implements r89, inh, vwa, mf7, k74, qbf, w71, tyh, dv5, sah, EglThread.ReleaseMonitor, kq4 {
    public final /* synthetic */ int a;

    public /* synthetic */ o75(tw5 tw5Var) {
        this.a = 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void g(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        switch (this.a) {
            case 10:
                Set setK = ((g85) h74Var).k(x0e.a(wh0.class));
                vn7 vn7Var = vn7.c;
                if (vn7Var == null) {
                    synchronized (vn7.class) {
                        try {
                            vn7Var = vn7.c;
                            if (vn7Var == null) {
                                vn7Var = new vn7(0);
                                vn7.c = vn7Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new xe5(setK, vn7Var);
            case 21:
                return ExecutorsRegistrar.lambda$getComponents$4((g85) h74Var);
            case 22:
                return ExecutorsRegistrar.lambda$getComponents$5((g85) h74Var);
            case 23:
                return ExecutorsRegistrar.lambda$getComponents$6((g85) h74Var);
            default:
                return ExecutorsRegistrar.lambda$getComponents$7((g85) h74Var);
        }
    }

    @Override // defpackage.tyh
    public void a() {
        pe5 pe5Var = gs5.p;
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 8:
                iyh iyhVar = (iyh) obj;
                iyhVar.getClass();
                Bundle bundle = new Bundle();
                String str = iyh.e;
                ghe gheVar = iyhVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(gheVar.d);
                a98 a98VarListIterator = gheVar.listIterator(0);
                while (a98VarListIterator.hasNext()) {
                    arrayList.add(((hyh) a98VarListIterator.next()).d());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            default:
                qt4.A(obj);
                throw null;
        }
    }

    @Override // defpackage.w71
    public String c(a35 a35Var) {
        return a35Var.a.toString();
    }

    public boolean d(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.qbf
    public int e(int i) {
        zv8[] zv8VarArr = DialogNotificationsSettingsScreen.g;
        return 4;
    }

    @Override // defpackage.sah
    public Object get() {
        return Boolean.FALSE;
    }

    @Override // defpackage.kq4
    public Object h(Task task) {
        int i;
        switch (this.a) {
            case 27:
                i = HttpStatus.SC_FORBIDDEN;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((xf) obj).getClass();
                break;
            case 1:
                ((xf) obj).getClass();
                break;
            case 2:
                ((xf) obj).getClass();
                break;
            case 3:
                ((xf) obj).getClass();
                break;
            case 25:
                ((j3d) obj).T(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                break;
            default:
                ((j3d) obj).g();
                break;
        }
    }

    @Override // defpackage.vwa
    public void j(lwa lwaVar) {
    }

    @Override // defpackage.inh
    public void k(zy4 zy4Var) {
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // defpackage.dv5
    public void release() {
    }

    public /* synthetic */ o75(wf wfVar, long j) {
        this.a = 0;
    }

    public /* synthetic */ o75(wf wfVar, t99 t99Var, uz9 uz9Var) {
        this.a = 1;
    }

    public /* synthetic */ o75(wf wfVar, Object obj, int i) {
        this.a = i;
    }

    public /* synthetic */ o75(int i) {
        this.a = i;
    }
}
