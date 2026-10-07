package defpackage;

import one.me.stories.viewer.viewer.widgets.publish.StoryPublishProgressWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0h implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryPublishProgressWidget b;

    public /* synthetic */ r0h(StoryPublishProgressWidget storyPublishProgressWidget, int i) {
        this.a = i;
        this.b = storyPublishProgressWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StoryPublishProgressWidget storyPublishProgressWidget = this.b;
        switch (i) {
            case 0:
                q0h q0hVar = (q0h) storyPublishProgressWidget.a.getAccessor().c(964);
                return new p0h(q0hVar.a, q0hVar.b, q0hVar.c, storyPublishProgressWidget.getD().b());
            default:
                zv8[] zv8VarArr = StoryPublishProgressWidget.h;
                return new c0h(storyPublishProgressWidget.getContext());
        }
    }
}
