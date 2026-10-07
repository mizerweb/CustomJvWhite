package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik4 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ ik4(int i) {
        this.a = i;
    }

    private final Object a(Object obj) throws Exception {
        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM profile");
        try {
            int iE = qyj.E(vxeVarO0, "id");
            int iE2 = qyj.E(vxeVarO0, "server_id");
            int iE3 = qyj.E(vxeVarO0, "profile");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                arrayList.add(new cpd(vxeVarO0.getLong(iE), vxeVarO0.getLong(iE2), sb8.d0(vxeVarO0.getBlob(iE3))));
            }
            vxeVarO0.close();
            return arrayList;
        } catch (Throwable th) {
            vxeVarO0.close();
            throw th;
        }
    }

    private final Object c(Object obj) throws Exception {
        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM reactions_section WHERE id = ?");
        try {
            vxeVarO0.B(1, "POPULAR");
            int iE = qyj.E(vxeVarO0, "id");
            int iE2 = qyj.E(vxeVarO0, "update_time");
            int iE3 = qyj.E(vxeVarO0, "reactions");
            i7e i7eVar = null;
            String strB0 = null;
            if (vxeVarO0.M0()) {
                String strB1 = vxeVarO0.B0(iE);
                long j = vxeVarO0.getLong(iE2);
                if (!vxeVarO0.isNull(iE3)) {
                    strB0 = vxeVarO0.B0(iE3);
                }
                i7eVar = new i7e(j, strB1, e9i.L0(strB0));
            }
            return i7eVar;
        } finally {
            vxeVarO0.close();
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        a70 a70Var;
        String strD;
        bo6 bo6Var;
        List listA;
        Set setE;
        List list;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                return ((ktc) obj).a();
            case 1:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM contacts");
                try {
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "server_id");
                    int iE3 = qyj.E(vxeVarO0, "data");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new xi4(vxeVarO0.getLong(iE), vxeVarO0.getLong(iE2), vd7.m(vxeVarO0.getBlob(iE3))));
                    }
                    vxeVarO0.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 2:
                ((Boolean) obj).getClass();
                return sbi.a;
            case 3:
                tt4 tt4Var = (tt4) obj;
                if (tt4Var instanceof xt4) {
                    return (xt4) tt4Var;
                }
                return null;
            case 4:
                return obj;
            case 5:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO1.getLong(0)));
                    }
                    vxeVarO1.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    vxeVarO1.close();
                    throw th2;
                }
            case 6:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT id FROM favorite_stickers ORDER BY `index` ASC");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO2.getLong(0)));
                    }
                    vxeVarO2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    vxeVarO2.close();
                    throw th3;
                }
            case 7:
                return Boolean.valueOf(((kw7) obj) instanceof jw7);
            case 8:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT * FROM informer_banner ORDER BY priority DESC");
                try {
                    int iE4 = qyj.E(vxeVarO3, "id");
                    int iE5 = qyj.E(vxeVarO3, "title");
                    int iE6 = qyj.E(vxeVarO3, "settings");
                    int iE7 = qyj.E(vxeVarO3, "description");
                    int iE8 = qyj.E(vxeVarO3, LogFactory.PRIORITY_KEY);
                    int iE9 = qyj.E(vxeVarO3, "repeat");
                    int iE10 = qyj.E(vxeVarO3, "rerun");
                    int iE11 = qyj.E(vxeVarO3, "animoji_id");
                    int iE12 = qyj.E(vxeVarO3, MLFeatureConfigProviderBase.URL_KEY);
                    int iE13 = qyj.E(vxeVarO3, "type");
                    int iE14 = qyj.E(vxeVarO3, "click_time");
                    int iE15 = qyj.E(vxeVarO3, "show_time");
                    int iE16 = qyj.E(vxeVarO3, "close_time");
                    int iE17 = qyj.E(vxeVarO3, "show_count");
                    int iE18 = qyj.E(vxeVarO3, "button_text");
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        String strB0 = vxeVarO3.B0(iE4);
                        String strB1 = vxeVarO3.B0(iE5);
                        int i3 = iE17;
                        ArrayList arrayList5 = arrayList4;
                        int i4 = (int) vxeVarO3.getLong(iE6);
                        int i5 = iE18;
                        arrayList5.add(new ge8(strB0, strB1, i4, vxeVarO3.isNull(iE7) ? null : vxeVarO3.B0(iE7), (byte) vxeVarO3.getLong(iE8), (byte) vxeVarO3.getLong(iE9), vxeVarO3.getLong(iE10), vxeVarO3.isNull(iE11) ? null : Long.valueOf(vxeVarO3.getLong(iE11)), vxeVarO3.isNull(iE12) ? null : vxeVarO3.B0(iE12), y3m.i((int) vxeVarO3.getLong(iE13)), vxeVarO3.getLong(iE14), vxeVarO3.getLong(iE15), vxeVarO3.getLong(iE16), (int) vxeVarO3.getLong(i3), vxeVarO3.isNull(i5) ? null : vxeVarO3.B0(i5)));
                        iE18 = i5;
                        iE6 = iE6;
                        iE12 = iE12;
                        arrayList4 = arrayList5;
                        iE17 = i3;
                        iE5 = iE5;
                        iE7 = iE7;
                        break;
                    }
                    return arrayList4;
                } finally {
                    vxeVarO3.close();
                }
            case 9:
                return tok.a(((TamErrorException) obj).a);
            case 10:
                return sbi.a;
            case 11:
                return obj.toString();
            case 12:
                return new EnhancedAnimatedVectorDrawable((Context) obj, R.drawable.chats);
            case 13:
                return new EnhancedAnimatedVectorDrawable((Context) obj, R.drawable.settings_avd);
            case 14:
                vxe vxeVarO4 = ((qxe) obj).O0("SELECT * FROM message_uploads");
                try {
                    int iE19 = qyj.E(vxeVarO4, ClientCookie.PATH_ATTR);
                    int iE20 = qyj.E(vxeVarO4, "last_modified");
                    int iE21 = qyj.E(vxeVarO4, "upload_type");
                    int iE22 = qyj.E(vxeVarO4, "message_id");
                    int iE23 = qyj.E(vxeVarO4, "chat_id");
                    int iE24 = qyj.E(vxeVarO4, "attach_id");
                    int iE25 = qyj.E(vxeVarO4, "video_quality");
                    int iE26 = qyj.E(vxeVarO4, "video_start_trim_position");
                    int iE27 = qyj.E(vxeVarO4, "video_end_trim_position");
                    int iE28 = qyj.E(vxeVarO4, "video_fragments_paths");
                    int iE29 = qyj.E(vxeVarO4, "mute");
                    ArrayList arrayList6 = new ArrayList();
                    while (vxeVarO4.M0()) {
                        u75 u75Var = new u75();
                        u75Var.a = vxeVarO4.getLong(iE22);
                        u75Var.b = vxeVarO4.getLong(iE23);
                        u75Var.c = vxeVarO4.B0(iE24);
                        if (vxeVarO4.isNull(iE25) && vxeVarO4.isNull(iE26) && vxeVarO4.isNull(iE27) && vxeVarO4.isNull(iE28) && vxeVarO4.isNull(iE29)) {
                            arrayList6 = arrayList6;
                            u75Var = u75Var;
                            a70Var = null;
                        } else {
                            a70Var = new a70(2);
                            a70Var.a = k1m.e(vxeVarO4.isNull(iE25) ? null : Integer.valueOf((int) vxeVarO4.getLong(iE25)));
                            a70Var.b = (float) vxeVarO4.getDouble(iE26);
                            a70Var.c = (float) vxeVarO4.getDouble(iE27);
                            String strB2 = vxeVarO4.isNull(iE28) ? null : vxeVarO4.B0(iE28);
                            if (strB2 == null) {
                                a70Var.d = null;
                            } else {
                                a70Var.d = lhb.o(strB2);
                            }
                            a70Var.e = ((int) vxeVarO4.getLong(iE29)) != 0;
                        }
                        jka jkaVar = new jka();
                        if (vxeVarO4.isNull(iE19)) {
                            jkaVar.b = null;
                        } else {
                            jkaVar.b = vxeVarO4.B0(iE19);
                        }
                        a70 a70Var2 = a70Var;
                        jkaVar.c = vxeVarO4.getLong(iE20);
                        jkaVar.d = k1m.d(vxeVarO4.isNull(iE21) ? null : Integer.valueOf((int) vxeVarO4.getLong(iE21)));
                        jkaVar.a = u75Var;
                        jkaVar.e = a70Var2;
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add(jkaVar);
                        arrayList6 = arrayList7;
                        break;
                    }
                    return arrayList6;
                } finally {
                    vxeVarO4.close();
                }
            case 15:
                tia tiaVar = (tia) obj;
                return new apb(new ilb(tiaVar.c), tiaVar.e, tiaVar.i, qv5.MESSAGES_LIMIT);
            case 16:
                return ((tia) obj).m;
            case 17:
                mmb mmbVar = (mmb) obj;
                return Boolean.valueOf((!mmbVar.a() || (strD = mmbVar.d()) == null || strD.length() == 0) ? false : true);
            case 18:
                rta rtaVar = (rta) obj;
                String name = hua.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "skip element " + rtaVar, null);
                    }
                }
                return sbi.a;
            case 19:
                return Boolean.valueOf(((d83) obj).f.isEmpty());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT * FROM fcm_notifications WHERE post_id = 0 ORDER BY time ASC");
                try {
                    int iE30 = qyj.E(vxeVarO5, "message_id");
                    int iE31 = qyj.E(vxeVarO5, "type");
                    int iE32 = qyj.E(vxeVarO5, "chat_title");
                    int iE33 = qyj.E(vxeVarO5, "sender_user_name");
                    int iE34 = qyj.E(vxeVarO5, "sender_user_id");
                    int iE35 = qyj.E(vxeVarO5, "time");
                    int iE36 = qyj.E(vxeVarO5, "text");
                    int iE37 = qyj.E(vxeVarO5, "push_id");
                    int iE38 = qyj.E(vxeVarO5, "event_key");
                    int iE39 = qyj.E(vxeVarO5, "large_image_url");
                    int iE40 = qyj.E(vxeVarO5, "fire_m");
                    int iE41 = qyj.E(vxeVarO5, "has_any_error");
                    int iE42 = qyj.E(vxeVarO5, MLFeatureConfigProviderBase.URL_KEY);
                    int iE43 = qyj.E(vxeVarO5, "bmd");
                    int iE44 = qyj.E(vxeVarO5, "source");
                    int iE45 = qyj.E(vxeVarO5, "chat_id");
                    int iE46 = qyj.E(vxeVarO5, "post_id");
                    ArrayList arrayList8 = new ArrayList();
                    while (vxeVarO5.M0()) {
                        long j = vxeVarO5.getLong(iE30);
                        String strB3 = vxeVarO5.isNull(iE31) ? null : vxeVarO5.B0(iE31);
                        int i6 = iE31;
                        bo6[] bo6VarArr = bo6.b;
                        ArrayList arrayList9 = arrayList8;
                        int length = bo6VarArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                int i8 = length;
                                bo6Var = bo6VarArr[i7];
                                int i9 = i7;
                                if (!bo6Var.a.equals(strB3)) {
                                    i7 = i9 + 1;
                                    length = i8;
                                }
                            } else {
                                bo6Var = null;
                            }
                        }
                        if (bo6Var == null) {
                            bo6Var = bo6.UNKNOWN;
                        }
                        bo6 bo6Var2 = bo6Var;
                        String strB4 = vxeVarO5.isNull(iE32) ? null : vxeVarO5.B0(iE32);
                        String strB5 = vxeVarO5.isNull(iE33) ? null : vxeVarO5.B0(iE33);
                        long j2 = vxeVarO5.getLong(iE34);
                        long j3 = vxeVarO5.getLong(iE35);
                        String strB6 = vxeVarO5.B0(iE36);
                        long j4 = vxeVarO5.getLong(iE37);
                        String strB7 = vxeVarO5.isNull(iE38) ? null : vxeVarO5.B0(iE38);
                        String strB8 = vxeVarO5.isNull(iE39) ? null : vxeVarO5.B0(iE39);
                        boolean z = ((int) vxeVarO5.getLong(iE40)) != 0;
                        boolean z2 = ((int) vxeVarO5.getLong(iE41)) != 0;
                        String strB9 = vxeVarO5.isNull(iE42) ? null : vxeVarO5.B0(iE42);
                        int i10 = iE43;
                        String strB10 = vxeVarO5.isNull(i10) ? null : vxeVarO5.B0(i10);
                        syd sydVarB = lml.b((int) vxeVarO5.getLong(iE44));
                        int i11 = iE45;
                        int i12 = iE42;
                        int i13 = iE44;
                        int i14 = iE46;
                        arrayList8 = arrayList9;
                        arrayList8.add(new xn6(new ilb(vxeVarO5.getLong(i11), vxeVarO5.getLong(i14)), j, bo6Var2, strB4, strB5, j2, j3, strB6, j4, strB7, strB8, z, z2, strB9, strB10, sydVarB));
                        iE42 = i12;
                        iE44 = i13;
                        iE45 = i11;
                        iE31 = i6;
                        iE30 = iE30;
                        iE43 = i10;
                        iE46 = i14;
                        break;
                    }
                    return arrayList8;
                } finally {
                    vxeVarO5.close();
                }
            case 21:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() == 0) {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        return new sw(4, viewGroup);
                    }
                }
                return null;
            case 22:
                qte qteVar = qte.a;
                View view2 = (View) obj;
                if (view2 instanceof ViewGroup) {
                    ((ViewGroup) view2).setOnHierarchyChangeListener(qteVar);
                }
                return Boolean.TRUE;
            case 23:
                zv8[] zv8VarArr = a2c.t;
                return sbi.a;
            case 24:
                rrc rrcVar = ((erc) obj).j;
                if (rrcVar != null) {
                    return new uf(rrcVar);
                }
                ore.p("Required value was null.");
                return null;
            case 25:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT * FROM phones WHERE type = ?");
                try {
                    vxeVarO6.c(1, qt4.D(1));
                    int iE47 = qyj.E(vxeVarO6, "id");
                    int iE48 = qyj.E(vxeVarO6, "phonebook_id");
                    int iE49 = qyj.E(vxeVarO6, "contact_id");
                    int iE50 = qyj.E(vxeVarO6, "phone");
                    int iE51 = qyj.E(vxeVarO6, "phone_key");
                    int iE52 = qyj.E(vxeVarO6, "server_phone");
                    int iE53 = qyj.E(vxeVarO6, "email");
                    int iE54 = qyj.E(vxeVarO6, "first_name");
                    int iE55 = qyj.E(vxeVarO6, "last_name");
                    int iE56 = qyj.E(vxeVarO6, "avatar_path");
                    int iE57 = qyj.E(vxeVarO6, "type");
                    ArrayList arrayList10 = new ArrayList();
                    while (vxeVarO6.M0()) {
                        arrayList10.add(new stc(vxeVarO6.getLong(iE47), vxeVarO6.getLong(iE48), (int) vxeVarO6.getLong(iE49), vxeVarO6.B0(iE50), vxeVarO6.B0(iE51), vxeVarO6.getLong(iE52), vxeVarO6.isNull(iE53) ? null : vxeVarO6.B0(iE53), vxeVarO6.B0(iE54), vxeVarO6.isNull(iE55) ? null : vxeVarO6.B0(iE55), vxeVarO6.isNull(iE56) ? null : vxeVarO6.B0(iE56), iic.h((int) vxeVarO6.getLong(iE57))));
                        break;
                    }
                    return arrayList10;
                } finally {
                    vxeVarO6.close();
                }
            case 26:
                return a(obj);
            case 27:
                return c(obj);
            case 28:
                return String.valueOf(obj);
            default:
                vxe vxeVarO7 = ((qxe) obj).O0("SELECT * FROM chat_folder LEFT JOIN folder_and_chats ON chat_folder.id = folder_and_chats.folderId ORDER BY `order`");
                try {
                    int iE58 = qyj.E(vxeVarO7, "id");
                    int iE59 = qyj.E(vxeVarO7, "title");
                    int iE60 = qyj.E(vxeVarO7, "order");
                    int iE61 = qyj.E(vxeVarO7, "emoji");
                    int iE62 = qyj.E(vxeVarO7, "filters");
                    int iE63 = qyj.E(vxeVarO7, "isHiddenForAllFolder");
                    int iE64 = qyj.E(vxeVarO7, "elements");
                    int iE65 = qyj.E(vxeVarO7, "filterSubjects");
                    int iE66 = qyj.E(vxeVarO7, "widgets");
                    int iE67 = qyj.E(vxeVarO7, "options");
                    int iE68 = qyj.E(vxeVarO7, "updateTime");
                    int iE69 = qyj.E(vxeVarO7, "favorites");
                    int iE70 = qyj.E(vxeVarO7, "templateId");
                    int iE71 = qyj.E(vxeVarO7, "sourceId");
                    int iE72 = qyj.E(vxeVarO7, ApiProtocol.PARAM_CHAT_ID);
                    int iE73 = qyj.E(vxeVarO7, "folderId");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (vxeVarO7.M0()) {
                        String strB11 = vxeVarO7.B0(iE58);
                        String strB12 = vxeVarO7.B0(iE59);
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        int i15 = iE71;
                        int i16 = (int) vxeVarO7.getLong(iE60);
                        String strB13 = vxeVarO7.isNull(iE61) ? null : vxeVarO7.B0(iE61);
                        EnumSet enumSetK0 = e9i.K0(vxeVarO7.B0(iE62));
                        iE59 = iE59;
                        iE60 = iE60;
                        boolean z3 = ((int) vxeVarO7.getLong(iE63)) != 0;
                        byte[] blob = vxeVarO7.isNull(iE64) ? null : vxeVarO7.getBlob(iE64);
                        if (blob != null) {
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            sia.mergeFrom(messageElements, blob);
                            listA = dga.a(messageElements.elements);
                        } else {
                            listA = r66.a;
                        }
                        List list2 = listA;
                        Map mapV = e9i.V(vxeVarO7.isNull(iE65) ? null : vxeVarO7.getBlob(iE65));
                        List listW = e9i.W(vxeVarO7.isNull(iE66) ? null : vxeVarO7.getBlob(iE66));
                        byte[] blob2 = vxeVarO7.isNull(iE67) ? null : vxeVarO7.getBlob(iE67);
                        if (blob2 != null) {
                            f67 f67Var = new f67(1);
                            sia.mergeFrom(f67Var, blob2);
                            setE = yab.E(f67Var);
                        } else {
                            setE = c76.a;
                        }
                        rqe rqeVar = new rqe(strB11, strB12, i16, strB13, enumSetK0, z3, list2, mapV, listW, setE, vxeVarO7.getLong(iE68), e9i.n(vxeVarO7.isNull(iE69) ? null : vxeVarO7.getBlob(iE69)), vxeVarO7.isNull(iE70) ? null : Long.valueOf(vxeVarO7.getLong(iE70)), vxeVarO7.isNull(i15) ? null : Long.valueOf(vxeVarO7.getLong(i15)));
                        if (linkedHashMap2.containsKey(rqeVar)) {
                            list = (List) wm9.N0(linkedHashMap2, rqeVar);
                        } else {
                            ArrayList arrayList11 = new ArrayList();
                            linkedHashMap2.put(rqeVar, arrayList11);
                            list = arrayList11;
                        }
                        iE72 = iE72;
                        if (vxeVarO7.isNull(iE72)) {
                            i2 = iE73;
                            if (vxeVarO7.isNull(i2)) {
                                i = i15;
                                iE73 = i2;
                                iE71 = i;
                                linkedHashMap = linkedHashMap2;
                            } else {
                                i = i15;
                            }
                        } else {
                            i = i15;
                            i2 = iE73;
                        }
                        int i17 = iE61;
                        int i18 = iE62;
                        int i19 = i2;
                        list.add(new iu2(vxeVarO7.getLong(iE72), vxeVarO7.B0(i2)));
                        iE61 = i17;
                        iE62 = i18;
                        iE71 = i;
                        iE73 = i19;
                        linkedHashMap = linkedHashMap2;
                        break;
                    }
                    return linkedHashMap;
                } finally {
                    vxeVarO7.close();
                }
        }
    }

    public /* synthetic */ ik4(int i, Object obj) {
        this.a = i;
    }
}
