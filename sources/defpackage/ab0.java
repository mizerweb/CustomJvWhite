package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class ab0 extends afe {
    public final u4a a;
    public final long b;
    public final qpa c;
    public final ny8 e;
    public final ny8 f;
    public final String d = ab0.class.getName();
    public final LinkedHashSet g = new LinkedHashSet();

    public ab0(ny8 ny8Var, ny8 ny8Var2, u4a u4aVar, long j, qpa qpaVar) {
        this.a = u4aVar;
        this.b = j;
        this.c = qpaVar;
        this.e = ny8Var;
        this.f = ny8Var2;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        u40 u40Var;
        je9 je9Var = je9.d;
        if (((Boolean) ((f5d) ((wo6) this.f.getValue())).a.S3.a(e5d.S6[254]).i()).booleanValue()) {
            u4a u4aVar = this.a;
            if (u4aVar.a(u4aVar.b().c.d.getInt("app.media.load.audio_messages", 0))) {
                LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
                int iX0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.X0() : -1;
                int iZ0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.Z0() : -1;
                if (iX0 == -1 || iZ0 == -1) {
                    String str = this.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, nbh.u("Audio prefetch. Can't start fetch because invalid positions, first:", iX0, ", last:", iZ0, "."), null);
                        return;
                    }
                    return;
                }
                if (iX0 <= iZ0) {
                    int i3 = iX0;
                    while (true) {
                        lfe lfeVarK = recyclerView.K(i3);
                        if (lfeVarK == null) {
                            String str2 = this.d;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                StringBuilder sbP = qv1.p("Audio prefetch. Can't find viewHolder for fetch, pos:", i3, ", firstPos:", iX0, "|lastPos:");
                                sbP.append(iZ0);
                                a4cVar2.c(je9Var, str2, sbP.toString(), null);
                            }
                        } else if (lfeVarK instanceof tea) {
                            tea teaVar = (tea) lfeVarK;
                            if (teaVar.y instanceof ha0) {
                                MessageModel messageModelH = this.c.h(teaVar.A);
                                t50 t50Var = (messageModelH == null || (u40Var = messageModelH.j) == null) ? null : u40Var.b;
                                y90 y90Var = t50Var instanceof y90 ? (y90) t50Var : null;
                                if (y90Var != null) {
                                    this.g.add(new ylc(Long.valueOf(y90Var.c), y90Var.f));
                                }
                            }
                        }
                        if (i3 == iZ0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (this.g.isEmpty()) {
                    return;
                }
                ((m80) this.e.getValue()).c(this.b, ww3.T1(this.g));
                this.g.clear();
            }
        }
    }
}
