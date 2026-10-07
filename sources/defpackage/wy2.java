package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class wy2 extends hih {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(ia4 ia4Var, boolean z, String str, List list, Long l) {
        super(kfc.r);
        this.c = 18;
        if (str != null && str.length() != 0) {
            h("pushToken", str);
        }
        if (list != null) {
            d("pushTokens", list);
        }
        if (l != null) {
            this.a.put("pushOptions", l);
        }
        if (ia4Var != null) {
            l8b l8bVar = ia4Var.c;
            mw mwVar = new mw(4);
            String str2 = ia4Var.a;
            if (str2 != null) {
                mwVar.put("hash", str2);
            }
            if (l8bVar != null && l8bVar.e != 0) {
                mwVar.put("chats", l8bVar);
            }
            lni lniVar = ia4Var.d;
            if (lniVar != null) {
                mw mwVar2 = new mw(0);
                Boolean bool = lniVar.a;
                if (bool != null) {
                    mwVar2.put("PUSH_NEW_CONTACTS", bool);
                }
                Long l2 = lniVar.b;
                if (l2 != null) {
                    mwVar2.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = lniVar.c;
                if (str3 != null) {
                    mwVar2.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = lniVar.d;
                if (str4 != null) {
                    mwVar2.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = lniVar.e;
                if (str5 != null) {
                    mwVar2.put("PUSH_SOUND", str5);
                }
                String str6 = lniVar.f;
                if (str6 != null) {
                    mwVar2.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = lniVar.g;
                if (str7 != null) {
                    mwVar2.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool2 = lniVar.h;
                if (bool2 != null) {
                    mwVar2.put("HIDDEN", bool2);
                }
                Integer num = lniVar.i;
                if (num != null) {
                    mwVar2.put("LED", num);
                }
                Integer num2 = lniVar.j;
                if (num2 != null) {
                    mwVar2.put("DIALOGS_LED", num2);
                }
                Integer num3 = lniVar.k;
                if (num3 != null) {
                    mwVar2.put("CHATS_LED", num3);
                }
                Boolean bool3 = lniVar.l;
                if (bool3 != null) {
                    mwVar2.put("VIBR", bool3);
                }
                Boolean bool4 = lniVar.m;
                if (bool4 != null) {
                    mwVar2.put("DIALOGS_VIBR", bool4);
                }
                Boolean bool5 = lniVar.n;
                if (bool5 != null) {
                    mwVar2.put("CHATS_VIBR", bool5);
                }
                int i = lniVar.p;
                if (i != 0) {
                    mwVar2.put("INCOMING_CALL", nbh.k(i));
                }
                int i2 = lniVar.o;
                if (i2 != 0) {
                    mwVar2.put("CHATS_INVITE", nbh.k(i2));
                }
                kni kniVar = lniVar.r;
                if (kniVar != null) {
                    mwVar2.put("INACTIVE_TTL", kniVar.a);
                }
                int i3 = lniVar.s;
                if (i3 != 0) {
                    mwVar2.put("M_CALL_PUSH_NOTIFICATION", nbh.j(i3));
                }
                int i4 = lniVar.t;
                if (i4 != 0) {
                    mwVar2.put("COMMENTS_PUSH_NOTIFICATION", nbh.i(i4));
                }
                int i5 = lniVar.u;
                if (i5 != 0) {
                    mwVar2.put("SUGGEST_STICKERS", nbh.l(i5));
                }
                Boolean bool6 = lniVar.v;
                if (bool6 != null) {
                    mwVar2.put("AUDIO_TRANSCRIPTION_ENABLED", bool6);
                }
                Boolean bool7 = lniVar.w;
                if (bool7 != null) {
                    mwVar2.put("SAFE_MODE", bool7);
                }
                Boolean bool8 = lniVar.x;
                if (bool8 != null) {
                    mwVar2.put("SAFE_MODE_NO_PIN", bool8);
                }
                int i6 = lniVar.y;
                if (i6 != 0) {
                    mwVar2.put("SEARCH_BY_PHONE", nbh.k(i6));
                }
                Boolean bool9 = lniVar.z;
                if (bool9 != null) {
                    mwVar2.put("UNSAFE_FILES", bool9);
                }
                Boolean bool10 = lniVar.A;
                if (bool10 != null) {
                    mwVar2.put("CONTENT_LEVEL_ACCESS", bool10);
                }
                jni jniVar = lniVar.D;
                if (jniVar != null) {
                    mwVar2.put("FAMILY_PROTECTION", jniVar);
                }
                Boolean bool11 = lniVar.B;
                if (bool11 != null) {
                    mwVar2.put("DOUBLE_TAP_REACTION_DISABLED", bool11);
                }
                String str8 = lniVar.C;
                if (str8 != null) {
                    mwVar2.put("DOUBLE_TAP_REACTION_VALUE", str8);
                }
                int i7 = lniVar.q;
                if (i7 != 0) {
                    mwVar2.put("PHONE_NUMBER_PRIVACY", nbh.k(i7));
                }
                mwVar.put("user", mwVar2);
            }
            g("settings", mwVar);
        }
        if (z) {
            a("reset", true);
        }
    }

    @Override // defpackage.hih
    public boolean j() {
        switch (this.c) {
            case 0:
                return true;
            case 2:
                return true;
            case 14:
                return true;
            case 16:
                return true;
            default:
                return super.j();
        }
    }

    @Override // defpackage.hih
    public short k() {
        switch (this.c) {
            case 1:
                return kfc.r3.a;
            case 4:
                lhb lhbVar = kfc.c;
                return (short) 58;
            case 9:
                lhb lhbVar2 = kfc.c;
                return (short) 77;
            case 11:
                lhb lhbVar3 = kfc.c;
                return (short) 86;
            case 12:
                lhb lhbVar4 = kfc.c;
                return (short) 68;
            case 13:
                return kfc.s3.a;
            case 15:
                lhb lhbVar5 = kfc.c;
                return (short) 55;
            case 16:
                lhb lhbVar6 = kfc.c;
                return (short) 53;
            case 21:
                lhb lhbVar7 = kfc.c;
                return (short) 36;
            case 22:
                lhb lhbVar8 = kfc.c;
                return (short) 39;
            case 23:
                lhb lhbVar9 = kfc.c;
                return (short) 34;
            case 26:
                lhb lhbVar10 = kfc.c;
                return (short) 87;
            case 29:
                lhb lhbVar11 = kfc.c;
                return (short) 124;
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy2(ia4 ia4Var, int i) {
        this(ia4Var, false, (String) null, (List) null, (Long) null);
        this.c = 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy2(kfc kfcVar, int i) {
        super(kfcVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(int i, int i2, long j, long j2, long j3, p63 p63Var, e73 e73Var, List list, boolean z) {
        super(null);
        this.c = 9;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        h("operation", e73Var.a);
        d("userIds", list);
        h("type", p63Var.a);
        if (e73Var == e73.ADD) {
            a("showHistory", z);
        }
        if (i != 0) {
            c(i, "cleanMsgPeriod");
        }
        if (i2 != 0) {
            c(i2, "permissions");
        }
        if (j2 != 0) {
            f(j2, "postId");
        }
        if (j3 != 0) {
            f(j3, "messageId");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j) {
        super(null);
        this.c = 4;
        f(j, ApiProtocol.PARAM_CHAT_ID);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j, int i, String str, boolean z, String str2, Map map, String str3, String str4, r60 r60Var, Long l, boolean z2, long j2) {
        String str5;
        super(null);
        this.c = 15;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else {
                if (i != 3) {
                    throw null;
                }
                str5 = "PRIVATE";
            }
            h("access", str5);
        }
        if (!ch3.r(str)) {
            h("link", str);
        }
        if (z) {
            a("revokePrivateLink", true);
        }
        if (str2 != null) {
            h("description", str2);
        }
        if (map != null && map.size() > 0) {
            g("options", map);
        }
        if (str3 != null) {
            h("theme", str3);
        }
        if (str4 != null) {
            h("photoToken", str4);
        }
        if (r60Var != null) {
            g("crop", r60Var.e());
        }
        if (l != null) {
            this.a.put("pinMessageId", l);
            if (z2) {
                a("notifyPin", true);
            }
        }
        if (j2 != 0) {
            f(j2, "changeOwnerId");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long[] jArr, Long l, int i) {
        super(null);
        this.c = 13;
        int i2 = (i & 2) != 0 ? 50 : 3;
        l = (i & 4) != 0 ? null : l;
        e("userIds", jArr);
        c(i2, "count");
        if (l != null) {
            this.a.put("marker", l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(q54 q54Var, byte b, long[] jArr, Long l, String str, Long l2) {
        super(kfc.y3);
        this.c = 17;
        b(q54Var.a, "typeId");
        b(b, "reasonId");
        e("ids", jArr);
        if (l != null) {
            this.a.put("parentId", l);
            if (l2 != null) {
                this.a.put("postId", l2);
            }
        }
        if (str == null || str.length() == 0) {
            return;
        }
        h("details", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j, long j2, long j3) {
        super(kfc.D2);
        this.c = 25;
        f(j, "fileId");
        f(j2, ApiProtocol.PARAM_CHAT_ID);
        f(j3, "messageId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j, String str, long j2, int i, String str2) {
        super(kfc.H1);
        this.c = 8;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (str.length() != 0) {
            h("type", str);
        }
        if (j2 != 0) {
            f(j2, "marker");
        }
        if (i > 0) {
            c(i, "count");
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        h("query", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long[] jArr, Long l) {
        super(kfc.Y);
        this.c = 20;
        e("contactIds", jArr);
        if (l != null) {
            this.a.put("chat_id", l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(String str) {
        super(kfc.E2);
        this.c = 28;
        h("link", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j, Long l, Set set, Integer num, Integer num2) {
        super(kfc.z1);
        this.c = 7;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        this.a.put("messageId", l);
        if (set != null && !set.isEmpty()) {
            w50 w50Var = w50.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((w50) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case 12:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case 14:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                    case 15:
                        arrayList.add("VIDEO_MSG");
                        break;
                    case 17:
                        arrayList.add("POLL");
                        break;
                }
            }
            d("attachTypes", arrayList);
        }
        if (num != null) {
            this.a.put("forward", num);
        }
        if (num2 != null) {
            this.a.put("backward", num2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy2(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, mg5 mg5Var, String str, Long l, int i3) {
        this(j, j2, i, j3, i2, j4, z, z2, mg5Var, (i3 & 1024) != 0 ? null : str, (i3 & np0.q) != 0 ? null : l);
        this.c = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wy2(long j, e73 e73Var, List list, p63 p63Var, int i) {
        this(0, i, j, 0L, 0L, p63Var, e73Var, list, true);
        this.c = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy2(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, mg5 mg5Var, String str, Long l) {
        super(kfc.x1);
        this.c = 2;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (l != null) {
            this.a.put("postId", l);
        }
        f(j2, "from");
        c(i, "forward");
        f(j3, "forwardTime");
        c(i2, "backward");
        f(j4, "backwardTime");
        a("getChat", false);
        a("getMessages", z);
        if (str != null && str.length() != 0) {
            h("chatAccessToken", str);
        }
        h("itemType", mg5Var.name());
        a("interactive", z2);
    }
}
