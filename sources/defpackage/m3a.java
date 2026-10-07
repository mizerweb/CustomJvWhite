package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class m3a implements h2a {
    public String a;
    public long b;
    public Object c;
    public Comparable d;
    public final Object e;

    public m3a(o3a o3aVar) {
        this.e = o3aVar;
        this.c = b0a.K;
        this.a = "";
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.h2a
    public void a(int i, PendingIntent pendingIntent) {
        ((q2a) ((o3a) this.e).m.b).a.setSessionActivity(pendingIntent);
    }

    @Override // defpackage.h2a
    public void d(int i, emf emfVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean zIsEmpty = bundle.isEmpty();
        Bundle bundle2 = emfVar.c;
        if (zIsEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        v2a v2aVar = ((o3a) this.e).m;
        String str = emfVar.b;
        v2aVar.getClass();
        if (TextUtils.isEmpty(str)) {
            ore.p("event cannot be null or empty");
        } else {
            ((q2a) v2aVar.b).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // defpackage.h2a
    public void f(int i, umf umfVar, boolean z, boolean z2, int i2) {
        o3a o3aVar = (o3a) this.e;
        o3aVar.M(o3aVar.g.t);
    }

    @Override // defpackage.h2a
    public void g(int i, h3d h3dVar) {
        o3a o3aVar = (o3a) this.e;
        j4d j4dVar = o3aVar.g.t;
        int i2 = j4dVar.c(20) ? 4 : 0;
        if (o3aVar.t != i2) {
            o3aVar.t = i2;
            ((q2a) o3aVar.m.b).a.setFlags(i2 | 3);
        }
        o3aVar.M(j4dVar);
    }

    public void j() {
        int i;
        k3a k3aVar;
        o3a o3aVar = (o3a) this.e;
        j4d j4dVar = o3aVar.g.t;
        if (j4dVar.X().a == 0) {
            k3aVar = null;
        } else {
            h3d h3dVarR = j4dVar.R();
            if (h3dVarR.a.a(26, 34)) {
                i = h3dVarR.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            int i2 = i;
            Handler handler = new Handler(j4dVar.b.u);
            if (j4dVar.c(23)) {
                j4dVar.Y();
            }
            ok5 ok5VarX = j4dVar.X();
            k3aVar = new k3a(i2, ok5VarX.c, 0, ok5VarX.d, handler, j4dVar);
        }
        o3aVar.p = k3aVar;
        v2a v2aVar = o3aVar.m;
        if (k3aVar == null) {
            ((q2a) v2aVar.b).a.setPlaybackToLocal((j4dVar.c(21) ? j4dVar.Q() : p70.i).c());
        } else {
            ((q2a) v2aVar.b).a.setPlaybackToRemote(k3aVar.a());
        }
    }

    public void k(ry9 ry9Var) {
        q();
        o3a o3aVar = (o3a) this.e;
        v2a v2aVar = o3aVar.m;
        if (ry9Var == null) {
            ((q2a) v2aVar.b).a.setRatingType(0);
        } else {
            ((q2a) v2aVar.b).a.setRatingType(mz8.t(ry9Var.d.i));
        }
        o3aVar.M(o3aVar.g.t);
    }

    public void l(int i, j4d j4dVar) {
        o3a o3aVar = (o3a) this.e;
        p(j4dVar.W());
        m(j4dVar.c(18) ? j4dVar.b0() : b0a.K);
        j4dVar.Z();
        q();
        o(j4dVar.H());
        n(j4dVar.getRepeatMode());
        j4dVar.X();
        j();
        int i2 = j4dVar.c(20) ? 4 : 0;
        if (o3aVar.t != i2) {
            o3aVar.t = i2;
            ((q2a) o3aVar.m.b).a.setFlags(i2 | 3);
        }
        k(j4dVar.V());
    }

    public void m(b0a b0aVar) {
        o3a o3aVar = (o3a) this.e;
        v2a v2aVar = o3aVar.m;
        CharSequence queueTitle = ((mu9) ((qg7) v2aVar.c).b).a.getQueueTitle();
        CharSequence charSequence = b0aVar.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        j4d j4dVar = o3aVar.g.t;
        if (!o3aVar.y.a(17) || !j4dVar.R().a(17)) {
            charSequence = null;
        }
        ((q2a) v2aVar.b).a.setQueueTitle(charSequence);
    }

    public void n(int i) {
        v2a v2aVar = ((o3a) this.e).m;
        int iM = mz8.m(i);
        q2a q2aVar = (q2a) v2aVar.b;
        if (q2aVar.j != iM) {
            q2aVar.j = iM;
            synchronized (q2aVar.d) {
                int iBeginBroadcast = q2aVar.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = q2aVar.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((a38) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(iM);
                        } catch (RemoteException | SecurityException e) {
                            lvb.l0("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public void o(boolean z) {
        v2a v2aVar = ((o3a) this.e).m;
        u98 u98Var = mz8.a;
        q2a q2aVar = (q2a) v2aVar.b;
        if (q2aVar.k != z) {
            q2aVar.k = z ? 1 : 0;
            synchronized (q2aVar.d) {
                int iBeginBroadcast = q2aVar.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = q2aVar.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            ((a38) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            lvb.l0("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // defpackage.h2a
    public void onDisconnected() {
    }

    public void p(ush ushVar) {
        r(ushVar);
        q();
    }

    public void q() {
        long j;
        Uri uri;
        b0a b0aVar;
        Uri uri2;
        o3a o3aVar = (o3a) this.e;
        d3a d3aVar = o3aVar.g;
        j4d j4dVar = d3aVar.t;
        ry9 ry9VarV = j4dVar.V();
        b0a b0aVarZ = j4dVar.Z();
        long duration = -9223372036854775807L;
        if ((!j4dVar.c(16) || !j4dVar.e0()) && j4dVar.c(16)) {
            duration = j4dVar.getDuration();
        }
        String str = ry9VarV != null ? ry9VarV.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (ry9VarV == null || (uri2 = ry9VarV.f.a) == null) ? null : uri2;
        if (Objects.equals((b0a) this.c, b0aVarZ) && Objects.equals(this.a, str) && Objects.equals((Uri) this.d, uri3) && this.b == duration) {
            return;
        }
        this.a = str;
        this.d = uri3;
        this.c = b0aVarZ;
        this.b = duration;
        e89 e89VarO = d3aVar.m.o(b0aVarZ);
        if (e89VarO != null) {
            o3aVar.s = null;
            if (e89VarO.isDone()) {
                try {
                    bitmap = (Bitmap) rx8.F(e89VarO);
                } catch (CancellationException | ExecutionException e) {
                    lvb.G0("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
                j = duration;
                uri = uri3;
                b0aVar = b0aVarZ;
            } else {
                j = duration;
                uri = uri3;
                b0aVar = b0aVarZ;
                uj6 uj6Var = new uj6(this, b0aVar, str, uri, j);
                str = str;
                o3aVar.s = uj6Var;
                Handler handler = d3aVar.l;
                Objects.requireNonNull(handler);
                e89VarO.b(new ng7(e89VarO, 0, uj6Var), new cc5(0, handler));
            }
        } else {
            j = duration;
            uri = uri3;
            b0aVar = b0aVarZ;
        }
        v2a v2aVar = o3aVar.m;
        d0a d0aVarK = mz8.k(b0aVar, str, uri, j, bitmap);
        q2a q2aVar = (q2a) v2aVar.b;
        q2aVar.i = d0aVarK;
        q2aVar.a.setMetadata(d0aVarK.e());
    }

    public void r(ush ushVar) {
        o3a o3aVar = (o3a) this.e;
        d3a d3aVar = o3aVar.g;
        j4d j4dVar = d3aVar.t;
        if (!o3aVar.y.a(17) || !j4dVar.R().a(17) || ushVar.p()) {
            o3a.C(o3aVar.m, null);
            return;
        }
        u98 u98Var = mz8.a;
        ArrayList arrayList = new ArrayList();
        tsh tshVar = new tsh();
        for (int i = 0; i < ushVar.o(); i++) {
            arrayList.add(ushVar.m(i, tshVar, 0L).b);
        }
        ArrayList arrayList2 = new ArrayList();
        w77 w77Var = new w77(this, new AtomicInteger(0), arrayList, arrayList2, 2);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((ry9) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                w77Var.run();
            } else {
                e89 e89VarP = d3aVar.m.p(bArr);
                arrayList2.add(e89VarP);
                Handler handler = d3aVar.l;
                Objects.requireNonNull(handler);
                e89VarP.b(w77Var, new cc5(0, handler));
            }
        }
    }

    public m3a(long j, String str, String str2, String str3, String str4) {
        this.a = str;
        this.c = str2;
        this.b = j;
        this.d = str3;
        this.e = str4;
    }
}
