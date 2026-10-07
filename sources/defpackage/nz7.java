package defpackage;

import android.net.TrafficStats;
import java.net.URL;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nz7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ nz7(UserStoriesScreen userStoriesScreen, String str) {
        this.a = 5;
        this.b = str;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                TrafficStats.setThreadStatsTag(str.hashCode());
                try {
                    return new URL(str).openStream();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            case 1:
                return qv1.k("Falling back to base layer codec: ", str);
            case 2:
                return qv1.k("Selected codec mime type: ", str);
            case 3:
                zv8[] zv8VarArr = ShareDataPickerScreen.C;
                return new lmc(null, 2, null, null, null, str != null ? ouk.a(new ylc("link_source", str)) : null, 93);
            case 4:
                return str;
            default:
                zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                uug uugVar = uug.b;
                uugVar.getClass();
                n65 n65Var = new n65();
                n65Var.a = ":call-join-preview";
                n65Var.c("link", str);
                o65.c(uugVar.b(), n65Var.b(), null, null, 6);
                return sbi.a;
        }
    }

    public /* synthetic */ nz7(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
