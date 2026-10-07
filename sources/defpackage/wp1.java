package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wp1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ wp1(rbb rbbVar, int i) {
        this.a = i;
        this.b = rbbVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        rbb rbbVar = this.b;
        switch (i) {
            case 0:
                cs1 cs1Var = cs1.b;
                un1 un1Var = (un1) rbbVar;
                String str = un1Var.b;
                boolean z = un1Var.c;
                boolean z2 = un1Var.d;
                boolean z3 = un1Var.e;
                boolean z4 = un1Var.f;
                o65 o65VarB = cs1Var.b();
                n65 n65Var = new n65();
                n65Var.a = ":call-join-link";
                n65Var.d(str, "link");
                n65Var.d(Boolean.valueOf(z), "is_video_call");
                n65Var.d(Boolean.valueOf(z2), "video_enabled");
                n65Var.d(Boolean.valueOf(z3), "microphone_enabled");
                n65Var.d(Boolean.valueOf(z4), "front_camera_enabled");
                n65Var.d(Boolean.FALSE, "is_new");
                n65Var.d(Boolean.TRUE, "replace_top");
                n65Var.d("CALL_BY_LINK", "start_source");
                o65.e(o65VarB, n65Var.a(), null, null, 4);
                break;
            case 1:
                o65.c(trd.b.b(), c0a.o(":call-join-link?link=", ((gsd) rbbVar).e, "&start_source=PROFILE"), null, null, 6);
                break;
            default:
                trd trdVar = trd.b;
                gsd gsdVar = (gsd) rbbVar;
                long j = gsdVar.b;
                boolean z5 = gsdVar.d;
                o65 o65VarB2 = trdVar.b();
                StringBuilder sbU = qt4.u(j, ":call-chat?chat_id=", "&video_enabled=", z5);
                sbU.append("&start_source=PROFILE");
                o65.c(o65VarB2, sbU.toString(), null, null, 6);
                break;
        }
        return sbiVar;
    }
}
