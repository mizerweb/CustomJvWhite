package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en4 implements cf7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ en4(long j, String str, String str2, String str3, String str4, String str5) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        vxe vxeVarO0 = ((qxe) obj).O0("INSERT OR REPLACE INTO contact_title (docid, link, allNormalizedTitles, allOriginalTitles, allNormalizedTitlesWithoutEmoji, allOriginalTitlesWithoutEmoji) VALUES(?, ?, ?, ?, ?, ?)");
        try {
            vxeVarO0.c(1, j);
            vxeVarO0.B(2, str);
            vxeVarO0.B(3, str2);
            vxeVarO0.B(4, str3);
            String str4 = this.e;
            if (str4 == null) {
                vxeVarO0.e(5);
            } else {
                vxeVarO0.B(5, str4);
            }
            String str5 = this.f;
            if (str5 == null) {
                vxeVarO0.e(6);
            } else {
                vxeVarO0.B(6, str5);
            }
            vxeVarO0.M0();
            return sbi.a;
        } finally {
            vxeVarO0.close();
        }
    }
}
