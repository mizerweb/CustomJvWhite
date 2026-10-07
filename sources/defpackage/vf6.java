package defpackage;

import android.text.Spannable;
import android.text.TextUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import one.me.chats.picker.stories.PickStoryPresetScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vf6 implements r89, n3a, qg4, t65, tg4, hfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vf6(m0a m0aVar, int i, k2a k2aVar) {
        this.a = 1;
        this.c = m0aVar;
        this.b = i;
        this.d = k2aVar;
    }

    @Override // defpackage.hfh
    public Object a() {
        z18 z18Var = (z18) this.c;
        ((kr6) z18Var.d).N((ij0) this.d, this.b + 1, false);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    @Override // defpackage.qg4
    public void accept(Object obj) {
        wmf wmfVar;
        int i;
        int i2 = this.a;
        int i3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 3:
                d3a d3aVar = (d3a) obj3;
                i2a i2aVar = (i2a) obj2;
                try {
                    wmfVar = (wmf) ((e89) obj).get();
                    lvb.W(wmfVar, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    lvb.H0("MediaSessionStub", "Session operation failed", e);
                    if (e.getCause() instanceof UnsupportedOperationException) {
                        i = -6;
                    } else {
                        i = -1;
                    }
                    wmfVar = new wmf(i);
                } catch (CancellationException e2) {
                    lvb.H0("MediaSessionStub", "Session operation cancelled", e2);
                    wmfVar = new wmf(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    lvb.H0("MediaSessionStub", "Session operation failed", e);
                    if (e.getCause() instanceof UnsupportedOperationException) {
                        i = -6;
                    } else {
                        i = -1;
                    }
                    wmfVar = new wmf(i);
                }
                t4a.q0(d3aVar, i2aVar, i3, wmfVar);
                break;
            default:
                Spannable spannable = (Spannable) obj3;
                voh vohVar = (voh) obj;
                int iOrdinal = ((t59) obj2).ordinal();
                if (iOrdinal == 1) {
                    spannable.setSpan(new au7(vohVar.c, i3), vohVar.a, vohVar.b, 33);
                    break;
                } else if (iOrdinal == 2) {
                    spannable.setSpan(new e01(vohVar.c, i3), vohVar.a, vohVar.b, 33);
                    break;
                } else if (iOrdinal == 3) {
                    spannable.setSpan(new rud(vohVar.c, i3), vohVar.a, vohVar.b, 33);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n3a
    public void b(i2a i2aVar) {
        o3a o3aVar = (o3a) this.c;
        uv9 uv9Var = (uv9) this.d;
        if (TextUtils.isEmpty(uv9Var.a)) {
            lvb.G0("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        e89 e89VarL = o3aVar.g.l(i2aVar, c98.r(mz8.g(uv9Var)));
        e89VarL.b(new ng7(e89VarL, 0, new ed7(o3aVar, i2aVar, this.b)), im5.a);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        k3d k3dVar = (k3d) this.c;
        k3d k3dVar2 = (k3d) this.d;
        j3d j3dVar = (j3d) obj;
        int i = this.b;
        j3dVar.Y(i);
        j3dVar.Z(k3dVar, k3dVar2, i);
    }

    @Override // defpackage.t65
    public Object t() {
        return new PickStoryPresetScreen(this.b, (long[]) this.c, (ha9) this.d);
    }

    public /* synthetic */ vf6(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ vf6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
