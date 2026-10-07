package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.List;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x3h extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StoryViewsBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3h(lq4 lq4Var, StoryViewsBottomSheet storyViewsBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = storyViewsBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StoryViewsBottomSheet storyViewsBottomSheet = this.g;
        switch (i) {
            case 0:
                x3h x3hVar = new x3h(lq4Var, storyViewsBottomSheet, 0);
                x3hVar.f = obj;
                return x3hVar;
            case 1:
                x3h x3hVar2 = new x3h(lq4Var, storyViewsBottomSheet, 1);
                x3hVar2.f = obj;
                return x3hVar2;
            case 2:
                x3h x3hVar3 = new x3h(lq4Var, storyViewsBottomSheet, 2);
                x3hVar3.f = obj;
                return x3hVar3;
            case 3:
                x3h x3hVar4 = new x3h(lq4Var, storyViewsBottomSheet, 3);
                x3hVar4.f = obj;
                return x3hVar4;
            default:
                x3h x3hVar5 = new x3h(lq4Var, storyViewsBottomSheet, 4);
                x3hVar5.f = obj;
                return x3hVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((x3h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((x3h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((x3h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((x3h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((x3h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        int i2 = 8;
        int i3 = 0;
        sbi sbiVar = sbi.a;
        StoryViewsBottomSheet storyViewsBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof vug) {
                    storyViewsBottomSheet.v1(true);
                    a8j.x(((gpi) storyViewsBottomSheet.F.getValue()).s1, new vug(((vug) rbbVar).b));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                d21 d21Var = (d21) obj2;
                r6c r6cVar = (r6c) storyViewsBottomSheet.D.m(storyViewsBottomSheet, StoryViewsBottomSheet.H[3]);
                if ((d21Var instanceof c21) || ((d21Var instanceof a21) && ((a21) d21Var).a == null)) {
                    i2 = 0;
                }
                r6cVar.setVisibility(i2);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                storyViewsBottomSheet.v.H((List) obj2);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                k7e k7eVar = (k7e) obj2;
                List list = k7eVar.a;
                int i4 = k7eVar.b;
                storyViewsBottomSheet.w.H(list);
                storyViewsBottomSheet.x.r = i4;
                boolean z = k7eVar.c;
                j8e j8eVar = storyViewsBottomSheet.B;
                zv8[] zv8VarArr = StoryViewsBottomSheet.H;
                ((aac) j8eVar.m(storyViewsBottomSheet, zv8VarArr[1])).setVisibility(z ? 0 : 8);
                ((TextView) storyViewsBottomSheet.A.m(storyViewsBottomSheet, zv8VarArr[0])).setText(z ? R.string.oneme_stories_views_reactions_bottom_sheet_title : R.string.oneme_stories_views_bottom_sheet_title);
                if (z && storyViewsBottomSheet.y == null) {
                    aac aacVar = (aac) storyViewsBottomSheet.B.m(storyViewsBottomSheet, zv8VarArr[1]);
                    y8j y8jVarG1 = storyViewsBottomSheet.G1();
                    fwg fwgVar = storyViewsBottomSheet.y;
                    if (fwgVar != null) {
                        fwgVar.d();
                    }
                    fwg fwgVar2 = new fwg(aacVar, y8jVarG1, new c5f(aacVar, 4, storyViewsBottomSheet));
                    fwgVar2.c();
                    storyViewsBottomSheet.y = fwgVar2;
                    y8j y8jVarG2 = storyViewsBottomSheet.G1();
                    w11 w11VarF1 = storyViewsBottomSheet.F1();
                    boolean z2 = storyViewsBottomSheet.G;
                    w11VarF1.getClass();
                    y8jVarG2.h(!z2 ? 1 : 0, false);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                for (Object obj3 : (List) obj2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    owb owbVar = (owb) obj3;
                    ugh ughVarH = ((aac) storyViewsBottomSheet.B.m(storyViewsBottomSheet, StoryViewsBottomSheet.H[1])).h(i3);
                    if (ughVarH != null) {
                        xgh xghVar = ughVarH.c;
                        if (xghVar == null) {
                            ore.p("Tab not attached to a TabLayout");
                            return null;
                        }
                        int selectedTabPosition = xghVar.getSelectedTabPosition();
                        int i6 = (selectedTabPosition == -1 || selectedTabPosition != ughVarH.a) ? 2 : 1;
                        View view = ughVarH.b;
                        z9c z9cVar = view instanceof z9c ? (z9c) view : null;
                        if (z9cVar != null) {
                            z9cVar.setTabItem(owb.a(owbVar, null, i6, null, null, null, 123));
                        }
                    }
                    i3 = i5;
                }
                return sbiVar;
        }
    }
}
