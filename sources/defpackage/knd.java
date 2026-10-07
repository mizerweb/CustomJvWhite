package defpackage;

import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.pinbars.pinnedmessage.b;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class knd implements t65, i8c {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ knd(long j, long j2, String str, ha9 ha9Var) {
        this.b = j;
        this.d = j2;
        this.c = str;
        this.e = ha9Var;
    }

    @Override // defpackage.t65
    public Object t() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                ha9 ha9Var = (ha9) obj;
                y1 y1Var = new y1(0, zmd.e);
                while (y1Var.hasNext()) {
                    zmd zmdVar = (zmd) y1Var.next();
                    if (zmdVar.a.equals(str)) {
                        return new ProfileEditAdminPermissionsWidget(this.b, this.d, zmdVar, ha9Var);
                    }
                }
                ore.f("Collection contains no element matching the predicate.");
                return null;
            default:
                return new VideoWebViewScreen(this.b, (String) obj2, this.d, (ha9) obj);
        }
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        b bVar = (b) this.c;
        rt2 rt2Var = (rt2) this.e;
        if (j8cVar == j8c.e) {
            yab.i0(bVar.d, ((n0c) bVar.b).b(), 0, new n0d(bVar, rt2Var, this.b, this.d, null), 2);
        }
    }

    public /* synthetic */ knd(long j, String str, long j2, ha9 ha9Var) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = ha9Var;
    }

    public /* synthetic */ knd(b bVar, rt2 rt2Var, long j, long j2) {
        this.c = bVar;
        this.e = rt2Var;
        this.b = j;
        this.d = j2;
    }
}
