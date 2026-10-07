package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class toa implements wna {
    public final rre a;
    public final ifh c;
    public final ifh d;
    public final soa f;
    public final soa g;
    public final soa h;
    public final nh3 b = new nh3(1, this);
    public final soa e = new soa(this, 0);

    public toa(rre rreVar) {
        this.c = new ifh(new mh3(rreVar, 1));
        this.d = new ifh(new mh3(rreVar, 2));
        this.a = rreVar;
        new soa(this, 1);
        this.f = new soa(this, 2);
        this.g = new soa(this, 3);
        this.h = new soa(this, 4);
    }

    public final vo3 d() {
        return (vo3) this.d.getValue();
    }

    public final dwa e() {
        return (dwa) this.c.getValue();
    }

    public final gga f(long j, long j2) {
        return (gga) ch3.G(this.a, true, false, new hn4(j, j2, this));
    }

    public final gga g(long j) {
        return (gga) ch3.G(this.a, true, false, new hoa(j, this, 2));
    }

    public final void h(final long j, final List list, final wja wjaVar, final boolean z) {
        final String strX = nbh.x(")", nbh.C("UPDATE messages SET status = ?, status_in_process = ? WHERE chat_id = ? AND id in ("), list);
        ch3.G(this.a, false, true, new cf7() { // from class: qoa
            @Override // defpackage.cf7
            public final Object invoke(Object obj) throws Exception {
                toa toaVar = this;
                wja wjaVar2 = wjaVar;
                boolean z2 = z;
                long j2 = j;
                List list2 = list;
                vxe vxeVarO0 = ((qxe) obj).O0(strX);
                try {
                    toaVar.e().getClass();
                    vxeVarO0.c(1, wjaVar2.a);
                    vxeVarO0.c(2, z2 ? 1L : 0L);
                    vxeVarO0.c(3, j2);
                    Iterator it = list2.iterator();
                    int i = 4;
                    while (it.hasNext()) {
                        vxeVarO0.c(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            }
        });
    }
}
