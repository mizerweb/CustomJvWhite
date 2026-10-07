package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cm3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbb b;
    public final /* synthetic */ String c;

    public /* synthetic */ cm3(rbb rbbVar, String str, int i) {
        this.a = i;
        this.b = rbbVar;
        this.c = str;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.c;
        rbb rbbVar = this.b;
        switch (i) {
            case 0:
                bhg bhgVar = (bhg) rbbVar;
                wn4.b.j(bhgVar.b, str.toString(), bhgVar.c);
                break;
            default:
                trd trdVar = trd.b;
                gsd gsdVar = (gsd) rbbVar;
                long j = gsdVar.b;
                o65.c(trdVar.b(), qt4.q(qt4.u(j, ":call-user?opponent_id=", "&video_enabled=", gsdVar.d), "&conversation_id=", str.toString(), "&start_source=PROFILE"), null, null, 6);
                break;
        }
        return sbiVar;
    }
}
