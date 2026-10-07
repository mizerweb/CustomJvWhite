package defpackage;

import one.me.stories.viewer.viewer.StoriesViewerScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cvg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoriesViewerScreen b;

    public /* synthetic */ cvg(StoriesViewerScreen storiesViewerScreen, int i) {
        this.a = i;
        this.b = storiesViewerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StoriesViewerScreen storiesViewerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = StoriesViewerScreen.t;
                vv vvVar = storiesViewerScreen.g;
                zv8 zv8Var = StoriesViewerScreen.t[0];
                t3f t3fVar = (t3f) vvVar.a(storiesViewerScreen);
                if (t3fVar == null) {
                    return (jvg) storiesViewerScreen.createViewModelLazy(jvg.class, new t2g(10, new cvg(storiesViewerScreen, 1))).getValue();
                }
                jvg jvgVar = (jvg) storiesViewerScreen.getSharedViewModel(t3fVar, jvg.class, null).getValue();
                jvgVar.E(((tug) storiesViewerScreen.h.getValue()).x());
                return jvgVar;
            default:
                kvg kvgVar = (kvg) storiesViewerScreen.i.getAccessor().c(951);
                return new jvg(kvgVar.a, kvgVar.b, kvgVar.c, kvgVar.d, kvgVar.e, (tug) storiesViewerScreen.h.getValue());
        }
    }
}
