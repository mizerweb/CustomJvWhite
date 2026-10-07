package defpackage;

import android.animation.ValueAnimator;
import java.util.List;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.stories.viewer.viewer.StoriesViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class e53 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SwipeWidget c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e53(SwipeWidget swipeWidget, int i, Object obj, int i2) {
        this.a = i2;
        this.c = swipeWidget;
        this.b = i;
        this.d = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                if (((ChatMediaViewerScreen) this.c).getViewLifecycleOwner().f().d.a(n09.d)) {
                    String name = ChatMediaViewerScreen.class.getName();
                    ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.c;
                    m53 m53Var = (m53) this.d;
                    int i = this.b;
                    a4c a4cVar = gm0.f;
                    lq4 lq4Var = null;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            n09 n09Var = chatMediaViewerScreen.getViewLifecycleOwner().f().d;
                            int i2 = m53Var.b;
                            int iL = chatMediaViewerScreen.x.l();
                            int size = m53Var.a.size();
                            StringBuilder sb = new StringBuilder("Media viewer. Pager, after submitList lifecycle=");
                            sb.append(n09Var);
                            sb.append(" initPos:");
                            sb.append(i2);
                            sb.append(", prevItemsA:");
                            qt4.x(i, iL, ", itemsA:", ", items:", sb);
                            sb.append(size);
                            a4cVar.c(je9Var, name, sb.toString(), null);
                        }
                    }
                    if (this.b == 0 && !((m53) this.d).a.isEmpty() && ((m53) this.d).b >= 0) {
                        yab.i0(((ChatMediaViewerScreen) this.c).getViewLifecycleScope(), null, 0, new in1((ChatMediaViewerScreen) this.c, (m53) this.d, lq4Var, 20), 3);
                    }
                }
                break;
            default:
                StoriesViewerScreen storiesViewerScreen = (StoriesViewerScreen) this.c;
                int i3 = this.b;
                List list = (List) this.d;
                if (storiesViewerScreen.getView() != null) {
                    ValueAnimator valueAnimator = storiesViewerScreen.o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (StoriesViewerScreen.D1(storiesViewerScreen).getCurrentItem() == i3) {
                        if (list.size() > 1) {
                            StoriesViewerScreen.D1(storiesViewerScreen).h(i3 != 0 ? i3 - 1 : 1, false);
                        }
                    }
                    StoriesViewerScreen.D1(storiesViewerScreen).h(i3, false);
                }
                break;
        }
        return sbi.a;
    }
}
