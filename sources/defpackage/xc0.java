package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.mediaeditor.MediaEditScreen;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class xc0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public xc0(z2e z2eVar, MessageWriteWidget messageWriteWidget) {
        this.a = 11;
        this.b = z2eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        lxi videoLayoutUpdatesController;
        int i9;
        Object value;
        RectF rectF = null;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                yc0 yc0Var = (yc0) this.b;
                Path path = yc0Var.l;
                if (!path.isEmpty()) {
                    path.reset();
                }
                yc0Var.a();
                yc0Var.postInvalidate();
                return;
            case 1:
                throw null;
            case 2:
                view.removeOnLayoutChangeListener(this);
                m22 m22Var = (m22) this.b;
                m22Var.x(m22Var.B);
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                s52 s52Var = (s52) this.b;
                s52Var.K(s52Var.w1);
                return;
            case 4:
                c62 c62Var = (c62) this.b;
                if (c62Var.d == null || (videoLayoutUpdatesController = c62Var.getVideoLayoutUpdatesController()) == null) {
                    return;
                }
                videoLayoutUpdatesController.a(c62Var, c62Var.l);
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                ChatScreen chatScreen = (ChatScreen) this.b;
                if (chatScreen.getView() != null) {
                    ou7 ou7Var = ChatScreen.L1;
                    if (soh.c(chatScreen.g2().getTitle())) {
                        String str = chatScreen.d.a;
                        if (cqk.d(str, "ScheduledChatScreen") || cqk.d(str, "PostCommentsChatScreen")) {
                            return;
                        }
                        ChatScreen.E1(chatScreen, chatScreen.g2(), true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.b;
                if (editStoryScreen.getView() != null) {
                    int[] iArr = editStoryScreen.q1;
                    if (editStoryScreen.v1().getVisibility() == 0) {
                        editStoryScreen.x1().getLocationOnScreen(iArr);
                        fy8 fy8VarV1 = editStoryScreen.v1();
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int i12 = fy8.q;
                        float f = yl5.d().getDisplayMetrics().density * 12.0f;
                        RectF rectF2 = fy8VarV1.m;
                        int[] iArr2 = fy8VarV1.l;
                        ImageView imageView = fy8VarV1.p;
                        if (imageView.getVisibility() == 0) {
                            imageView.getLocationOnScreen(iArr2);
                            int i13 = iArr2[0] - i10;
                            rectF2.set(i13, iArr2[1] - i11, imageView.getWidth() + i13, imageView.getHeight() + (iArr2[1] - i11));
                            float f2 = -f;
                            rectF2.inset(f2, f2);
                            rectF = rectF2;
                        }
                        if (rectF == null) {
                            return;
                        }
                        editStoryScreen.x1().setDeleteZoneRect(rectF);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                ((wre) this.b).invoke();
                return;
            case 8:
                je9 je9Var = je9.d;
                view.removeOnLayoutChangeListener(this);
                View view2 = ((MediaBarWidget) this.b).getView();
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                if (view2 == null) {
                    String str2 = mediaBarWidget.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "showMediaGallery(): view is null", null);
                        return;
                    }
                    return;
                }
                boolean zE = mediaBarWidget.C1().E();
                MediaBarWidget mediaBarWidget2 = (MediaBarWidget) this.b;
                if (zE) {
                    mediaBarWidget2.x1().k();
                    String str3 = ((MediaBarWidget) this.b).a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str3, "showMediaGallery(): popupLayoutChangeType=setFullScreen, scrollState=" + ((MediaBarWidget) this.b).x1().getScrollState(), null);
                        return;
                    }
                    return;
                }
                ccd scrollState = mediaBarWidget2.x1().getScrollState();
                scrollState.getClass();
                i9 = scrollState != ccd.a ? 1 : 0;
                boolean z = i9 ^ 1;
                String str4 = ((MediaBarWidget) this.b).a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str4, "showMediaGallery(): setHalfScreen?=" + z + ", scrollState=" + ((MediaBarWidget) this.b).x1().getScrollState(), null);
                }
                if (i9 == 0) {
                    ((MediaBarWidget) this.b).q1.i();
                    ((MediaBarWidget) this.b).x1().setHalfScreen(null);
                    return;
                }
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                MediaEditScreen mediaEditScreen = (MediaEditScreen) this.b;
                zv8[] zv8VarArr = MediaEditScreen.w1;
                y8j y8jVarG1 = mediaEditScreen.G1();
                ViewGroup.LayoutParams layoutParams = y8jVarG1.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = view.getMeasuredHeight();
                y8jVarG1.setLayoutParams(marginLayoutParams);
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                gia giaVar = (gia) this.b;
                ViewGroup viewGroup = (ViewGroup) giaVar.a;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                int iD = zo5.D(10.0f, yl5.d().getDisplayMetrics().density, viewGroup.getMeasuredWidth()) - giaVar.L();
                i9 = iD >= 0 ? iD : 0;
                ViewGroup viewGroup2 = (ViewGroup) giaVar.a;
                qyj.A(viewGroup2 != null ? viewGroup2 : null, giaVar.Q(), 0, 0, i9, 0, 22);
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                z2e z2eVar = (z2e) this.b;
                if (soh.c(z2eVar.getTitleView())) {
                    MessageWriteWidget.I1(z2eVar, true);
                    return;
                }
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                String str5 = ((hva) this.b).f;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar4.b(je9Var2)) {
                        a4cVar4.c(je9Var2, str5, zo5.j(((hva) this.b).b.d, "Scroll: Highlighted from args message with id="), null);
                    }
                }
                hva hvaVar = (hva) this.b;
                oqa oqaVar = hvaVar.e;
                ita itaVar = hvaVar.b;
                long j = itaVar.d;
                List list = itaVar.e;
                mjg mjgVar = oqaVar.e;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, new zv7(j, list)));
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                vzb vzbVar = (vzb) this.b;
                EditText editText = vzbVar.getEditText();
                Rect rect = vzbVar.l;
                editText.getHitRect(rect);
                rect.left = rect.right;
                rect.right = vzbVar.getRight();
                return;
            case 14:
                view.removeOnLayoutChangeListener(this);
                ((t7c) this.b).u.start();
                return;
            case 15:
                view.removeOnLayoutChangeListener(this);
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) this.b;
                RecyclerView recyclerViewO1 = ProfileEditScreen.o1(profileEditScreen);
                recyclerViewO1.setPadding(recyclerViewO1.getPaddingLeft(), recyclerViewO1.getPaddingTop(), recyclerViewO1.getPaddingRight(), bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, profileEditScreen.q1().getMeasuredHeight()));
                return;
            case 16:
                view.removeOnLayoutChangeListener(this);
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                ku8 ku8Var = ProfileScreen.B;
                if (soh.c(profileScreen.t1().getTitle())) {
                    ProfileScreen.p1(profileScreen, profileScreen.t1(), true);
                    return;
                }
                return;
            case 17:
                view.removeOnLayoutChangeListener(this);
                ((gb3) this.b).invoke();
                return;
            case 18:
                view.removeOnLayoutChangeListener(this);
                RegistrationNeuroAvatarsScreen.o1(view, pq3.j.h((LinearLayout) this.b));
                return;
            case 19:
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
                if (userStoriesScreen.getView() != null) {
                    zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                    userStoriesScreen.I1().l = (i4 - i2) - UserStoriesScreen.p1(userStoriesScreen).getMeasuredHeight();
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                view.removeOnLayoutChangeListener(this);
                ((ek2) this.b).resumeWith(sbi.a);
                return;
            case 21:
                view.removeOnLayoutChangeListener(this);
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                zv8[] zv8VarArr3 = VideoWebViewScreen.A;
                videoWebViewScreen.N1();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                zv8[] zv8VarArr4 = WebAppRootScreen.G;
                if (soh.c(webAppRootScreen.I1().getTitle())) {
                    WebAppRootScreen.N1(webAppRootScreen.I1(), true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ xc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
