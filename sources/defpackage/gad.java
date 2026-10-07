package defpackage;

import one.me.polls.screens.create.PollCreateScreen;
import one.me.stories.publish.PublishStoryBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gad implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ha9 d;

    public /* synthetic */ gad(long j, int i, ha9 ha9Var, int i2) {
        this.a = i2;
        this.b = j;
        this.c = i;
        this.d = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.d;
        int i2 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                return new PollCreateScreen(j, i2, ha9Var);
            default:
                return new PublishStoryBottomSheet(j, i2, ha9Var);
        }
    }
}
