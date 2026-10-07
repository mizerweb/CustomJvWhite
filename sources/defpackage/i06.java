package defpackage;

import one.me.stories.edit.EditStoryScreen;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i06 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditStoryScreen b;

    public /* synthetic */ i06(EditStoryScreen editStoryScreen, int i) {
        this.a = i;
        this.b = editStoryScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        EditStoryScreen editStoryScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = EditStoryScreen.A1;
                return pq3.j.k(editStoryScreen.getContext()).b;
            case 1:
                q26 q26Var = (q26) editStoryScreen.f.getAccessor().c(957);
                vv vvVar = editStoryScreen.b;
                zv8[] zv8VarArr2 = EditStoryScreen.A1;
                zv8 zv8Var = zv8VarArr2[0];
                Long l = (Long) vvVar.a(editStoryScreen);
                vv vvVar2 = editStoryScreen.c;
                zv8 zv8Var2 = zv8VarArr2[1];
                int iIntValue = ((Number) vvVar2.a(editStoryScreen)).intValue();
                t3f t3fVar = editStoryScreen.e;
                vv vvVar3 = editStoryScreen.d;
                zv8 zv8Var3 = zv8VarArr2[2];
                String str = (String) vvVar3.a(editStoryScreen);
                q26Var.getClass();
                return new p26(l, iIntValue, t3fVar, str, q26Var.a, q26Var.b, q26Var.c, q26Var.d, q26Var.e, q26Var.f, q26Var.g, q26Var.h, q26Var.i, q26Var.j, q26Var.k, q26Var.l, q26Var.m);
            case 2:
                return new xph(editStoryScreen, editStoryScreen.K, ((a2c) editStoryScreen.f.getAccessor().c(27)).a());
            case 3:
                a6a a6aVar = editStoryScreen.x1;
                if (a6aVar != null) {
                    p26 p26VarC1 = editStoryScreen.C1();
                    a6aVar.t();
                    float f = a6aVar.j;
                    a6aVar.t();
                    o6a o6aVar = new o6a(f, a6aVar.k, a6aVar.l, a6aVar.m, a6aVar.b(), a6aVar.c());
                    mjg mjgVar = p26VarC1.t;
                    mjgVar.getClass();
                    mjgVar.j(null, o6aVar);
                }
                return sbi.a;
            default:
                zv8[] zv8VarArr3 = EditStoryScreen.A1;
                VideoTrimSliderWidget videoTrimSliderWidget = new VideoTrimSliderWidget(editStoryScreen.e.b(), null, 0L, 6, null);
                c5j c5jVar = new c5j(editStoryScreen.Y, editStoryScreen.Z, v6a.c);
                videoTrimSliderWidget.e.B(videoTrimSliderWidget, VideoTrimSliderWidget.f[0], c5jVar);
                return videoTrimSliderWidget;
        }
    }
}
