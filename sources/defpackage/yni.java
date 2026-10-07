package defpackage;

import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class yni implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserStoriesScreen b;

    public /* synthetic */ yni(UserStoriesScreen userStoriesScreen, int i) {
        this.a = i;
        this.b = userStoriesScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UserStoriesScreen userStoriesScreen = this.b;
        switch (i) {
            case 0:
                UserStoriesScreen.r1(userStoriesScreen).setVisibility(0);
                break;
            default:
                UserStoriesScreen.r1(userStoriesScreen).setVisibility(8);
                break;
        }
    }
}
