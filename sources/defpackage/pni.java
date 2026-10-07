package defpackage;

import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.me.webapp.settings.WebAppsSettingScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pni implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pni(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        qpj qpjVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hqi hqiVar = (hqi) obj2;
                h8c h8cVar = (h8c) obj;
                zv8[] zv8VarArr = UserStoriesScreen.x1;
                h8cVar.m(hqiVar.a);
                ynh ynhVar = hqiVar.b;
                if (ynhVar != ynh.b) {
                    h8cVar.a(ynhVar);
                }
                Integer num = hqiVar.c;
                if (num != null) {
                    h8cVar.h(new w8c(num.intValue()));
                }
                break;
            case 1:
                zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                ((fqi) obj2).b.invoke((j8c) obj);
                break;
            case 2:
                g1j g1jVar = (g1j) obj2;
                byte[] bArr = (byte[]) obj;
                String str = g1jVar.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "VideoMessage Recording. Capture first frame to have a preview", null);
                    }
                }
                yab.i0(g1jVar.i, ((n0c) g1jVar.u()).a(), 0, new j8g(g1jVar, bArr, (lq4) null, 28), 2);
                break;
            case 3:
                h3j h3jVar = (h3j) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "VideoPreloadController", zo5.s("PreloadDiskCacheManager initialized = ", zBooleanValue), null);
                    }
                }
                h3jVar.e.Q(bool);
                h3jVar.d.set(false);
                break;
            case 4:
                zv8[] zv8VarArr3 = VideoWebViewScreen.A;
                a8j.x(((VideoWebViewScreen) obj2).J1().o, rt3.b);
                break;
            case 5:
                ioj iojVar = (ioj) obj2;
                if (((Throwable) obj) != null && (qpjVar = iojVar.M1) != null) {
                    qpjVar.b(new za9());
                }
                break;
            default:
                zv8[] zv8VarArr4 = WebAppsSettingScreen.f;
                ((WebAppsSettingScreen) obj2).getRouter().D();
                break;
        }
        return sbi.a;
    }
}
