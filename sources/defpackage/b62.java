package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.profileedit.ProfileEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class b62 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b62(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        lve lveVar;
        br4 br4Var;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                c62 c62Var = (c62) this.b;
                lxi videoLayoutUpdatesController = c62Var.getVideoLayoutUpdatesController();
                if (videoLayoutUpdatesController != null) {
                    videoLayoutUpdatesController.a((View) ((wfe) this.c).a, c62Var.l);
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ChatScreen chatScreen = (ChatScreen) this.b;
                ou7 ou7Var = ChatScreen.L1;
                if (((Boolean) chatScreen.N1().p.getValue()).booleanValue()) {
                    br4 parentController = (ChatScreen) this.b;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarW1 = rootController != null ? rootController.w1() : null;
                    View view2 = (hveVarW1 == null || (lveVar = (lve) ww3.t1(hveVarW1.e())) == null || (br4Var = lveVar.a) == null) ? null : br4Var.getView();
                    ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup != null) {
                        lve lveVarA = ((ChatScreen) this.b).getRouter().a.a();
                        gr4 gr4VarB = lveVarA != null ? lveVarA.b() : null;
                        pgd pgdVar = gr4VarB instanceof pgd ? (pgd) gr4VarB : null;
                        if (pgdVar != null) {
                            pgdVar.k((View) this.c, viewGroup);
                            break;
                        } else {
                            String name = ChatScreen.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    lve lveVarA2 = ((ChatScreen) this.b).getRouter().a.a();
                                    a4cVar.c(je9Var, name, "Expected PreviewChangeHandler to restore preview state, actual: " + (lveVarA2 != null ? lveVarA2.b() : null), null);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                t58.q((t58) this.b, (g58) this.c, 30);
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                tha thaVar = (tha) this.b;
                int measuredHeight = thaVar.f.getMeasuredHeight();
                ImageView imageView = thaVar.b;
                int measuredHeight2 = imageView.getMeasuredHeight();
                ny8 ny8Var = thaVar.h;
                boolean z = measuredHeight > Math.min(measuredHeight2, n7j.j(ny8Var));
                int iC = z ? (int) (((double) vl5.c(q9i.A.h().k((bx5) this.c), thaVar.getContext())) * 0.2d) : 0;
                thaVar.a = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, iC);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = thaVar.a;
                    imageView.setLayoutParams(marginLayoutParams);
                    if (ny8Var.d()) {
                        ImageView imageView2 = (ImageView) ny8Var.getValue();
                        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.bottomMargin = thaVar.a;
                            imageView2.setLayoutParams(marginLayoutParams2);
                        }
                    }
                    ImageView imageView3 = thaVar.k;
                    ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                    if (layoutParams3 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.bottomMargin = z ? iC : 0;
                        imageView3.setLayoutParams(marginLayoutParams3);
                        ny8 ny8Var2 = thaVar.l;
                        if (ny8Var2.d()) {
                            ImageView imageView4 = (ImageView) ny8Var2.getValue();
                            ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
                            if (layoutParams4 == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                marginLayoutParams4.bottomMargin = iC;
                                imageView4.setLayoutParams(marginLayoutParams4);
                            }
                        }
                        ny8 ny8Var3 = thaVar.m;
                        if (ny8Var3.d()) {
                            ImageView imageView5 = (ImageView) ny8Var3.getValue();
                            ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
                            if (layoutParams5 == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                marginLayoutParams5.bottomMargin = iC;
                                imageView5.setLayoutParams(marginLayoutParams5);
                            }
                        }
                        ny8 ny8Var4 = thaVar.i;
                        if (ny8Var4.d()) {
                            gig gigVar = (gig) ny8Var4.getValue();
                            ViewGroup.LayoutParams layoutParams6 = gigVar.getLayoutParams();
                            if (layoutParams6 == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                marginLayoutParams6.bottomMargin = iC;
                                gigVar.setLayoutParams(marginLayoutParams6);
                            }
                        }
                        tha.g(thaVar);
                    }
                }
                break;
            case 4:
                view.removeOnLayoutChangeListener(this);
                RecyclerView recyclerView = (RecyclerView) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), frameLayout.getPaddingBottom() + frameLayout.getMeasuredHeight());
                break;
            case 5:
                view.removeOnLayoutChangeListener(this);
                ProfileEditScreen.p1((ProfileEditScreen) this.b, pq3.j.h((FrameLayout) this.c));
                break;
            case 6:
                String str = ((VideoMessageWidget) this.b).h;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, "updating blur for video message screen", null);
                    }
                }
                ((View) this.c).getBackground().invalidateSelf();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                zv8[] zv8VarArr = VideoMessageWidget.B;
                int iP1 = VideoMessageWidget.p1(videoMessageWidget, (View) videoMessageWidget.s1().getParent());
                zzi zziVar = (zzi) this.c;
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(iP1, iP1);
                layoutParams7.gravity = 17;
                zziVar.setLayoutParams(layoutParams7);
                break;
        }
    }
}
