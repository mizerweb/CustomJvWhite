package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;
import one.me.devmenu.utils.FeatureValueInfoBottomSheet;
import one.me.devmenu.utils.JsonBottomSheet;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.informer.InformerBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.webview.FaqWebViewWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mp5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0346  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.af7
    public final Object invoke() {
        sya syaVar;
        String str;
        kam kamVarE;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((pp5) obj2).clear();
                return sbi.a;
            case 1:
                ((yp) ((ug5) obj2).a).setSessionInfo(null);
                return sbi.a;
            case 2:
                return null;
            case 3:
                return ((hk6) obj2).b().g();
            case 4:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                zv8[] zv8VarArr = FakeInAppReviewBottomSheet.E;
                return col.b(((fn8) pq3.j.e(fakeInAppReviewBottomSheet.getContext()).m().u().c.a).c, fakeInAppReviewBottomSheet.z, fakeInAppReviewBottomSheet.x);
            case 5:
                cl6 cl6Var = (cl6) ((FaqWebViewWidget) obj2).a.getAccessor().c(208);
                return new bl6(cl6Var.a, cl6Var.b);
            case 6:
                zv8[] zv8VarArr2 = FeatureValueInfoBottomSheet.C;
                ml9.b((FeatureValueInfoBottomSheet) obj2);
                return sbi.a;
            case 7:
                return (IOException) obj2;
            case 8:
                sya syaVar2 = sya.UNKNOWN;
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(((File) ((ljf) obj2).c).getPath()));
                if (mimeTypeFromExtension == null) {
                    return syaVar2;
                }
                for (Object obj3 : sya.m) {
                    if (((sya) obj3).a.equalsIgnoreCase(mimeTypeFromExtension)) {
                        obj = obj3;
                        syaVar = (sya) obj;
                        if (syaVar == null) {
                            return syaVar2;
                        }
                        return syaVar;
                    }
                }
                syaVar = (sya) obj;
                if (syaVar == null) {
                    return syaVar2;
                }
                return syaVar;
            case 9:
                zt6 zt6Var = (zt6) obj2;
                z18 z18Var = zt6Var.f;
                int iOrdinal = ((lt6) z18Var.c).b.ordinal();
                if (iOrdinal == 0) {
                    str = (String) ((ifh) z18Var.h).getValue();
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    str = (String) ((ifh) z18Var.i).getValue();
                }
                String str2 = zt6Var.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, qv1.k("Static headers:\n", str), null);
                    }
                }
                byte[] bytes = str.getBytes(pt2.a);
                ByteBuffer byteBufferPut = ((o31) zt6Var.h.getValue()).a(bytes.length).put(bytes);
                byteBufferPut.flip();
                return byteBufferPut;
            case 10:
                return new vx6((wx6) obj2);
            case 11:
                FolderEditScreen folderEditScreen = (FolderEditScreen) obj2;
                g37 g37Var = (g37) folderEditScreen.d.getAccessor().c(1025);
                vv vvVar = folderEditScreen.b;
                zv8[] zv8VarArr3 = FolderEditScreen.i;
                zv8 zv8Var = zv8VarArr3[0];
                String str3 = (String) vvVar.a(folderEditScreen);
                vv vvVar2 = folderEditScreen.c;
                zv8 zv8Var2 = zv8VarArr3[1];
                long[] jArr = (long[]) vvVar2.a(folderEditScreen);
                g37Var.getClass();
                return new f37(str3, jArr, g37Var.a, g37Var.b, g37Var.c, g37Var.d, g37Var.e, g37Var.f, g37Var.g, g37Var.h, g37Var.i);
            case 12:
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                zv8[] zv8VarArr4 = FolderMemberPickerScreen.q;
                int i2 = uw8.a;
                if (uw8.b(uw8.c)) {
                    ml9.b(folderMemberPickerScreen);
                }
                return sbi.a;
            case 13:
                l57 l57Var = (l57) ((FoldersListScreen) obj2).c.getAccessor().c(1026);
                l57Var.getClass();
                return new k57(l57Var.a, l57Var.b, l57Var.c, l57Var.d, l57Var.e, l57Var.f, l57Var.g);
            case 14:
                return new f78((d78) ((mc7) obj2).f.getValue()).f();
            case 15:
                return ((ph7) obj2).b ? jh7.a : ih7.a;
            case 16:
                return new ui7((ej7) obj2);
            case 17:
                return bk7.a((bk7) obj2);
            case 18:
                ((ImageView) obj2).performClick();
                return sbi.a;
            case 19:
                return new dp7((ep7) obj2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                y8j y8jVar = (y8j) obj2;
                return Integer.valueOf(y8jVar != null ? y8jVar.getCurrentItem() : 0);
            case 21:
                xy7 xy7Var = (xy7) obj2;
                return new az7(xy7Var.a, xy7Var.c, xy7Var.e);
            case 22:
                return Boolean.valueOf(((mz7) obj2).a.b(mz7.e, "api2.oneme.ru"));
            case 23:
                t58 t58Var = (t58) obj2;
                a8g a8gVar = pq3.j;
                a8gVar.h(t58Var);
                Drawable drawableMutate = t58Var.getContext().getDrawable(R.drawable.icon_cross).mutate();
                sb8.m0(-1, drawableMutate);
                v50 v50Var = new v50();
                v50Var.setCallback(t58Var);
                v50Var.a = drawableMutate;
                v50Var.invalidateSelf();
                v50Var.c = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                v50Var.b = true;
                v50Var.invalidateSelf();
                a8gVar.h(t58Var);
                v50Var.c(-1);
                v50Var.q = Integer.valueOf(a8gVar.h(t58Var).h().i);
                v50Var.invalidateSelf();
                v50Var.b();
                v50Var.r = 2;
                v50Var.invalidateSelf();
                v50Var.setLevel(0);
                return v50Var;
            case 24:
                ma8 ma8Var = (ma8) obj2;
                cmf cmfVar = ma8Var.b;
                if (cmfVar != null) {
                    MainActivity mainActivity = ma8Var.a;
                    if (mainActivity == null || mainActivity.isDestroyed() || mainActivity.isFinishing()) {
                        c7k c7kVar = ma8Var.d;
                        if (c7kVar != null) {
                            c7kVar.y();
                        }
                    } else {
                        wpe wpeVar = ma8Var.c;
                        if (wpeVar == null) {
                            c7k c7kVar2 = ma8Var.d;
                            if (c7kVar2 != null) {
                                c7kVar2.y();
                            }
                        } else {
                            Intent intent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE");
                            intent.setPackage("com.android.vending");
                            if (mainActivity.getPackageManager().queryIntentServices(intent, np0.m).isEmpty()) {
                                c7k c7kVar3 = ma8Var.d;
                                if (c7kVar3 != null) {
                                    c7kVar3.y();
                                }
                            } else {
                                hmk hmkVar = (hmk) wpeVar;
                                if (hmkVar.b) {
                                    kamVarE = gwl.e(null);
                                } else {
                                    Intent intent2 = new Intent(mainActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                                    intent2.putExtra("confirmation_intent", hmkVar.a);
                                    intent2.putExtra("window_flags", mainActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
                                    qjh qjhVar = new qjh();
                                    intent2.putExtra("result_receiver", new lu9((Handler) cmfVar.c, qjhVar));
                                    mainActivity.startActivity(intent2);
                                    kamVarE = qjhVar.a;
                                }
                                la8 la8Var = new la8(ma8Var, 1);
                                kamVarE.getClass();
                                c20 c20Var = vjh.a;
                                kamVarE.d(c20Var, la8Var);
                                kamVarE.a(c20Var, new la8(ma8Var, 2));
                                kamVarE.b(new la8(ma8Var, 3));
                            }
                        }
                    }
                }
                return sbi.a;
            case 25:
                InformerBottomSheet informerBottomSheet = (InformerBottomSheet) obj2;
                vv vvVar3 = informerBottomSheet.u;
                zv8 zv8Var3 = InformerBottomSheet.y[0];
                return new ff8((String) vvVar3.a(informerBottomSheet), (bf8) informerBottomSheet.v.getAccessor().c(310));
            case 26:
                ((InputPhoneScreen) obj2).s = null;
                return sbi.a;
            case 27:
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) obj2;
                nm8 nm8Var = (nm8) inviteFriendsToMaxBottomSheet.u.getAccessor().c(768);
                a0e a0eVarG1 = inviteFriendsToMaxBottomSheet.G1();
                int i3 = inviteFriendsToMaxBottomSheet.z;
                nm8Var.getClass();
                return new mm8(a0eVarG1, i3, nm8Var.a, nm8Var.b, nm8Var.c);
            case 28:
                JoinChatWidget joinChatWidget = (JoinChatWidget) obj2;
                wr8 wr8Var = (wr8) joinChatWidget.o.getAccessor().c(1092);
                vv vvVar4 = joinChatWidget.m;
                zv8[] zv8VarArr5 = JoinChatWidget.t;
                zv8 zv8Var4 = zv8VarArr5[0];
                long jLongValue = ((Number) vvVar4.a(joinChatWidget)).longValue();
                vv vvVar5 = joinChatWidget.n;
                zv8 zv8Var5 = zv8VarArr5[1];
                return new vr8(jLongValue, (String) vvVar5.a(joinChatWidget), wr8Var.a, wr8Var.b, wr8Var.c);
            default:
                zv8[] zv8VarArr6 = JsonBottomSheet.z;
                ml9.b((JsonBottomSheet) obj2);
                return sbi.a;
        }
    }
}
