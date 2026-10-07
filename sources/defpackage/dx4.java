package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.muxer.MuxerException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Provider;
import kotlinx.serialization.json.internal.JsonException;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;
import one.me.folders.edit.FolderEditScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.mediapicker.crop.CropPhotoScreen;
import one.me.sdk.arch.Widget;
import one.me.stories.edit.EditStoryScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dx4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dx4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        ia8 ia8Var;
        String[] strArrNames;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) this.b;
                CropPhotoScreen cropPhotoScreen = (CropPhotoScreen) this.c;
                zv8[] zv8VarArr = CropPhotoScreen.p;
                jx4 jx4Var = (jx4) tre.g0(bundle, "mode", jx4.class);
                if (jx4Var == null) {
                    jx4Var = jx4.a;
                }
                jx4 jx4Var2 = jx4Var;
                String string = bundle.getString("uri");
                if (string == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                Uri uri = Uri.parse(string);
                sx4 sx4Var = (sx4) cropPhotoScreen.c.getAccessor().c(785);
                sx4Var.getClass();
                return new rx4(jx4Var2, uri, sx4Var.a, sx4Var.b, sx4Var.c, sx4Var.d);
            case 1:
                return DbUploader.multiUploadHelper_delegate$lambda$0((Provider) this.b, (DbUploader) this.c);
            case 2:
                ((q45) this.b).d.onClick((View) this.c);
                return sbi.a;
            case 3:
                tha thaVar = (tha) this.b;
                EditAndReplyScreen editAndReplyScreen = (EditAndReplyScreen) this.c;
                zv8[] zv8VarArr2 = EditAndReplyScreen.w;
                nha sendActionState = thaVar.getSendActionState();
                if (sendActionState instanceof jha) {
                    iz5 iz5VarT1 = editAndReplyScreen.t1();
                    CharSequence text = editAndReplyScreen.r1().getText();
                    zv8[] zv8VarArr3 = iz5.B;
                    iz5VarT1.K(text, null);
                } else if (sendActionState instanceof lha) {
                    iz5 iz5VarT2 = editAndReplyScreen.t1();
                    String str = iz5VarT2.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "onDoneClick", null);
                        }
                    }
                    a8j.t(iz5VarT2, null, new gz5(iz5VarT2, null, 1), 3);
                } else {
                    String name = tha.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, name, "Unexpected sendActionState on click: " + thaVar.getSendActionState(), null);
                        }
                    }
                    iz5 iz5VarT3 = editAndReplyScreen.t1();
                    CharSequence text2 = editAndReplyScreen.r1().getText();
                    zv8[] zv8VarArr4 = iz5.B;
                    iz5VarT3.K(text2, null);
                }
                return sbi.a;
            case 4:
                q3m.g(((File) this.b).getAbsolutePath(), (Bitmap) this.c, 100, Bitmap.CompressFormat.JPEG);
                return sbi.a;
            case 5:
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.b;
                View view = (View) this.c;
                zv8[] zv8VarArr5 = EditStoryScreen.A1;
                if (editStoryScreen.getView() != null) {
                    view.setBackground(null);
                }
                editStoryScreen.C1().X();
                return sbi.a;
            case 6:
                na6 na6Var = (na6) this.b;
                String str2 = (String) this.c;
                ka6 ka6Var = (ka6) na6Var.c;
                if (ka6Var == null) {
                    Enum[] enumArr = (Enum[]) na6Var.b;
                    ka6Var = new ka6(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        ka6Var.k(r0.name(), false);
                    }
                }
                return ka6Var;
            case 7:
                ug5 ug5Var = (ug5) this.b;
                t6f t6fVar = (t6f) this.c;
                Uri uriA = t6fVar.a();
                ((yp) ug5Var.a).setSessionInfo(new xp(t6fVar.a.c, uriA != null ? uriA.toString() : null));
                return sbi.a;
            case 8:
                Context context = (Context) this.b;
                ek6 ek6Var = (ek6) this.c;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.messages_list_fake_boss_show_mutual_chats_button);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView((View) ek6Var.q.getValue());
                linearLayout.addView((View) ek6Var.r.getValue());
                linearLayout.setOnClickListener(new t8(27, ek6Var));
                return linearLayout;
            case 9:
                ((n61) this.b).invoke(Long.valueOf(((lk6) this.c).a));
                return sbi.a;
            case 10:
                nk6 nk6Var = (nk6) this.b;
                lk6 lk6Var = (lk6) this.c;
                n61 n61Var = nk6Var.v;
                if (n61Var != null) {
                    n61Var.invoke(Long.valueOf(lk6Var.a));
                }
                return sbi.a;
            case 11:
                FrameLayout frameLayout = (FrameLayout) this.b;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) this.c;
                frameLayout.removeCallbacks(fakeInAppReviewBottomSheet.C);
                boolean z = fakeInAppReviewBottomSheet.D;
                String str3 = fakeInAppReviewBottomSheet.m;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str3, zo5.s("Closed by doOnDismiss, closedWithoutButtonsInteraction=", z), null);
                    }
                }
                if (z && (ia8Var = (ia8) fakeInAppReviewBottomSheet.u.getAccessor().f()) != null) {
                    ia8Var.b(3);
                }
                return sbi.a;
            case 12:
                FileDownloadWarningBottomSheet fileDownloadWarningBottomSheet = (FileDownloadWarningBottomSheet) this.c;
                Bundle bundle2 = (Bundle) this.b;
                br6 br6Var = (br6) fileDownloadWarningBottomSheet.a.getAccessor().c(293);
                long j = bundle2.getLong("chat_id");
                long j2 = bundle2.getLong("message_id");
                String string2 = bundle2.getString("attach_id");
                long j3 = bundle2.getLong("file_id");
                String string3 = bundle2.getString("file_name");
                if (string3 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                String string4 = bundle2.getString("file_url");
                if (string4 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                long j4 = bundle2.getLong("file_size");
                br6Var.getClass();
                return new ar6(j, j2, string2, j3, string3, string4, j4, br6Var.a, br6Var.b, br6Var.c, br6Var.d, br6Var.e, br6Var.f);
            case 13:
                return new ppe(((zt6) this.c).e.c, (ouh) ((puh) ((ny8) this.b).getValue()).a.getValue());
            case 14:
                g27 g27Var = (g27) this.b;
                long j5 = ((l37) this.c).a;
                f37 f37VarP1 = ((FolderEditScreen) g27Var).p1();
                f37VarP1.z.B(f37VarP1, f37.D[2], yab.h0(f37VarP1.b, ((n0c) f37VarP1.d).a(), 2, new i20(f37VarP1, j5, (lq4) null, 16)));
                return sbi.a;
            case 15:
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) this.b;
                View view2 = (View) this.c;
                zv8[] zv8VarArr6 = ForwardPickerScreen.z;
                ((u87) forwardPickerScreen.x1().d).u.a(yka.d);
                lvb.H(view2, ForwardPickerScreen.A, null);
                forwardPickerScreen.B1().setLeftIcon(R.drawable.icon_sticker);
                return sbi.a;
            case 16:
                ForwardPickerScreen forwardPickerScreen2 = (ForwardPickerScreen) this.b;
                tha thaVar2 = (tha) this.c;
                zv8[] zv8VarArr7 = ForwardPickerScreen.z;
                ((u87) forwardPickerScreen2.x1().d).h(thaVar2.getText(), (m8b) forwardPickerScreen2.x1().i.a.getValue(), forwardPickerScreen2.E1(), true);
                return sbi.a;
            case 17:
                ((u97) this.b).a((String) this.c);
                return sbi.a;
            case 18:
                ga7 ga7Var = (ga7) this.b;
                ldc ldcVar = (ldc) this.c;
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).o(ldcVar);
                }
                return sbi.a;
            case 19:
                return Boolean.valueOf(((mz7) this.b).a.b(mz7.e, (String) this.c));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((ks6) this.b).a = (c4h) this.c;
                return sbi.a;
            case 21:
                or0 or0Var = (or0) this.b;
                pl8 pl8Var = (pl8) ((pk6) this.c).g;
                if (or0Var instanceof ml8) {
                    pl8Var.F(((ml8) or0Var).a);
                } else {
                    if (!(or0Var instanceof hz4)) {
                        ore.o();
                        return null;
                    }
                    pl8Var.e0(((hz4) or0Var).a);
                }
                return sbi.a;
            case 22:
                oq8 oq8Var = (oq8) this.b;
                nq8 nq8Var = (nq8) this.c;
                v7g v7gVarJoinConversationByLink = oq8Var.i.joinConversationByLink(nq8Var.a, nq8Var.b, oq8Var.l.generatePeerId(), oq8Var.k);
                rj5 rj5Var = new rj5(17, oq8Var);
                v7gVarJoinConversationByLink.getClass();
                return new e8g(v7gVarJoinConversationByLink, rj5Var, 2).f(ou7.h);
            case 23:
                fif fifVar = (fif) this.b;
                qs8 qs8Var = (qs8) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                at8 at8Var = qs8Var.a;
                oc9.U(qs8Var, fifVar);
                int iE = fifVar.e();
                for (int i = 0; i < iE; i++) {
                    List listG = fifVar.g(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof yt8) {
                            arrayList.add(obj);
                        }
                    }
                    yt8 yt8Var = (yt8) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (yt8Var != null && (strArrNames = yt8Var.names()) != null) {
                        for (String str4 : strArrNames) {
                            String str5 = cqk.d(fifVar.d(), lif.f) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str4)) {
                                throw new JsonException("The suggested name '" + str4 + "' for " + str5 + ' ' + fifVar.f(i) + " is already one of the names for " + str5 + ' ' + fifVar.f(((Number) wm9.N0(linkedHashMap, str4)).intValue()) + " in " + fifVar);
                            }
                            linkedHashMap.put(str4, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? s66.a : linkedHashMap;
            case 24:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.c;
                Bundle bundle3 = (Bundle) this.b;
                h hVar = keyboardEmojiWidget.a;
                return new d66(hVar.getAccessor().d(312), (dm) hVar.getAccessor().c(360), (f66) hVar.getAccessor().c(254), new xva(17, (f66) hVar.getAccessor().c(254)), (xhh) hVar.getAccessor().c(23), (wae) hVar.getAccessor().d(356).getValue(), keyboardEmojiWidget.p1(), bundle3.getCharSequenceArrayList("arg_selected_emojis"));
            case 25:
                Bundle bundle4 = (Bundle) this.b;
                KeyboardStickersWidget keyboardStickersWidget = (KeyboardStickersWidget) this.c;
                zv8[] zv8VarArr8 = KeyboardStickersWidget.l;
                bundle4.getLong("arg_key_chat_id");
                h hVar2 = keyboardStickersWidget.a;
                xhh xhhVar = (xhh) hVar2.getAccessor().c(23);
                ifh ifhVarD = hVar2.getAccessor().d(355);
                ifh ifhVarD2 = hVar2.getAccessor().d(356);
                ifh ifhVarD3 = hVar2.getAccessor().d(357);
                ifh ifhVarD4 = hVar2.getAccessor().d(358);
                hVar2.getAccessor().getClass();
                return new tpg(xhhVar, ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, new ifh(new ww8(0, keyboardStickersWidget)), hVar2.getAccessor().d(54), hVar2.getAccessor().d(144));
            case 26:
                ((sc9) this.b).e.unregisterReceiver((rc9) this.c);
                return sbi.a;
            case 27:
                ((kf9) this.b).f((yhh) this.c);
                return sbi.a;
            case 28:
                return MLFeaturesManagerImpl.nsFeatureDelegate_delegate$lambda$0((MLFeaturesManagerImpl) this.b, (RemoteSettings) this.c);
            default:
                jrc jrcVar = (jrc) this.b;
                MediaFormat mediaFormat = (MediaFormat) this.c;
                lh6 lh6Var = (lh6) jrcVar.d;
                s2b s2bVar = (s2b) lh6Var.e;
                lvb.b0(!lh6Var.b);
                try {
                    float fD = trk.d(mediaFormat, "capture-rate", -3.4028235E38f);
                    if (fD != -3.4028235E38f) {
                        String str6 = vqi.a;
                        s2bVar.k(new qp9(k4m.i(Float.floatToIntBits(fD)), 0, 23, "com.android.capture.fps"));
                    }
                    return Integer.valueOf(s2bVar.b0(trk.a(mediaFormat)));
                } catch (MuxerException e) {
                    qr7.o(e);
                    return null;
                }
        }
    }

    public /* synthetic */ dx4(Widget widget, Bundle bundle, int i) {
        this.a = i;
        this.c = widget;
        this.b = bundle;
    }
}
