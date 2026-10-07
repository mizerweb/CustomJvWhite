package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class nh3 extends ha6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e4 A[LOOP:1: B:100:0x02e2->B:101:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0315  */
    /* JADX WARN: Code duplicated, block: B:109:0x0325  */
    /* JADX WARN: Code duplicated, block: B:111:0x0331  */
    /* JADX WARN: Code duplicated, block: B:113:0x0336  */
    /* JADX WARN: Code duplicated, block: B:116:0x033c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0341  */
    /* JADX WARN: Code duplicated, block: B:118:0x0348  */
    /* JADX WARN: Code duplicated, block: B:121:0x0364  */
    /* JADX WARN: Code duplicated, block: B:124:0x036b  */
    /* JADX WARN: Code duplicated, block: B:126:0x038e  */
    /* JADX WARN: Code duplicated, block: B:127:0x039b  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:164:0x0408  */
    /* JADX WARN: Code duplicated, block: B:167:0x041a  */
    /* JADX WARN: Code duplicated, block: B:170:0x042a  */
    /* JADX WARN: Code duplicated, block: B:172:0x043d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0459  */
    /* JADX WARN: Code duplicated, block: B:178:0x0473  */
    /* JADX WARN: Code duplicated, block: B:181:0x0483  */
    /* JADX WARN: Code duplicated, block: B:183:0x048f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0492  */
    /* JADX WARN: Code duplicated, block: B:187:0x0495  */
    /* JADX WARN: Code duplicated, block: B:190:0x0499  */
    /* JADX WARN: Code duplicated, block: B:191:0x049e  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:213:0x050b  */
    /* JADX WARN: Code duplicated, block: B:215:0x052c  */
    /* JADX WARN: Code duplicated, block: B:219:0x053b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0589  */
    /* JADX WARN: Code duplicated, block: B:225:0x0590  */
    /* JADX WARN: Code duplicated, block: B:226:0x0593  */
    /* JADX WARN: Code duplicated, block: B:229:0x059a  */
    /* JADX WARN: Code duplicated, block: B:231:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:239:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:241:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:243:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:244:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:245:0x0601  */
    /* JADX WARN: Code duplicated, block: B:246:0x0604  */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0627  */
    /* JADX WARN: Code duplicated, block: B:253:0x0634  */
    /* JADX WARN: Code duplicated, block: B:256:0x063f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0648  */
    /* JADX WARN: Code duplicated, block: B:262:0x0655 A[LOOP:6: B:260:0x064f->B:262:0x0655, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:266:0x0672  */
    /* JADX WARN: Code duplicated, block: B:268:0x0675  */
    /* JADX WARN: Code duplicated, block: B:270:0x0678  */
    /* JADX WARN: Code duplicated, block: B:271:0x067a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0681  */
    /* JADX WARN: Code duplicated, block: B:274:0x0683  */
    /* JADX WARN: Code duplicated, block: B:277:0x0690  */
    /* JADX WARN: Code duplicated, block: B:279:0x0693  */
    /* JADX WARN: Code duplicated, block: B:281:0x0696  */
    /* JADX WARN: Code duplicated, block: B:282:0x0699  */
    /* JADX WARN: Code duplicated, block: B:284:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:285:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:287:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:290:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:293:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:295:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:303:0x0709  */
    /* JADX WARN: Code duplicated, block: B:304:0x070e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0715  */
    /* JADX WARN: Code duplicated, block: B:310:0x0722  */
    /* JADX WARN: Code duplicated, block: B:313:0x0732  */
    /* JADX WARN: Code duplicated, block: B:316:0x0757  */
    /* JADX WARN: Code duplicated, block: B:317:0x0759  */
    /* JADX WARN: Code duplicated, block: B:320:0x075e  */
    /* JADX WARN: Code duplicated, block: B:323:0x078f  */
    /* JADX WARN: Code duplicated, block: B:325:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:326:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:336:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0259  */
    /* JADX WARN: Code duplicated, block: B:76:0x025c  */
    /* JADX WARN: Code duplicated, block: B:77:0x025e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0260  */
    /* JADX WARN: Code duplicated, block: B:79:0x0262  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:81:0x0266  */
    /* JADX WARN: Code duplicated, block: B:82:0x0268  */
    /* JADX WARN: Code duplicated, block: B:85:0x027d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0284  */
    /* JADX WARN: Code duplicated, block: B:91:0x028b  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02be A[LOOP:0: B:95:0x02bc->B:96:0x02be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x02dc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        ArrayList arrayListE;
        int size;
        ArrayList arrayListE2;
        int size2;
        cx2 cx2VarA;
        i1c i1cVar;
        ax2 ax2Var;
        ww2 ww2Var;
        ww2 ww2Var2;
        ww2 ww2Var3;
        ww2 ww2Var4;
        ww2 ww2Var5;
        ww2 ww2Var6;
        ww2 ww2Var7;
        ww2 ww2Var8;
        dx2 dx2Var;
        int iD;
        String str4;
        mw mwVar;
        HashMap map;
        Iterator it;
        zc8 zc8Var;
        String str5;
        ix2 ix2Var;
        int i4;
        gx2 gx2Var;
        int i5;
        mx2 mx2Var;
        Protos.Attaches.Attach attach;
        h1c h1cVar;
        d11 d11Var;
        String str6;
        String str7;
        e70 e70Var;
        Protos.Attaches.Attach attachD;
        byte[] byteArray;
        uwd uwdVar;
        wx8 wx8Var;
        Long l;
        long jLongValue;
        List listA;
        List list;
        List list2;
        String str8;
        String str9;
        int iD2;
        int i6;
        int iD3;
        String str10;
        long[] jArr;
        int i7;
        Protos.Chat.GroupChatInfo groupChatInfo;
        String strK;
        String strB;
        int iD4;
        String str11;
        int i8;
        int iOrdinal;
        int i9;
        String str12;
        List listC;
        String[] strArr;
        boolean z;
        List list3;
        Protos.Chat.ChatSettings chatSettings;
        int i10;
        int iOrdinal2;
        i1c i1cVar2;
        int i11;
        int i12;
        int i13 = this.a;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                jy2 jy2Var = (jy2) obj;
                vxeVar.c(1, jy2Var.a);
                vxeVar.c(2, jy2Var.b);
                vo3 vo3VarC = ((ph3) obj2).c();
                nx2 nx2Var = jy2Var.c;
                i1c i1cVar3 = vo3VarC.a;
                byte[] bArr = a.a;
                Protos.Chat chat = new Protos.Chat();
                long j = nx2Var.a;
                gj2 gj2Var = nx2Var.u0;
                hx2 hx2Var = nx2Var.m0;
                zw2 zw2Var = nx2Var.I;
                fx2 fx2Var = nx2Var.n;
                List list4 = nx2Var.z;
                List list5 = nx2Var.C;
                chat.serverId = j;
                int iOrdinal3 = nx2Var.b.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        i = 0;
                        i2 = 1;
                    } else if (iOrdinal3 == 2) {
                        i = 0;
                        i2 = 2;
                    } else if (iOrdinal3 != 3) {
                        i = 0;
                        if (iOrdinal3 == 4) {
                            i2 = 4;
                        }
                    } else {
                        i = 0;
                        i2 = 3;
                    }
                    chat.type = i2;
                    switch (nx2Var.c.ordinal()) {
                        case 1:
                            i3 = 1;
                            break;
                        case 2:
                            i3 = 2;
                            break;
                        case 3:
                            i3 = 3;
                            break;
                        case 4:
                            i3 = 4;
                            break;
                        case 5:
                            i3 = 5;
                            break;
                        case 6:
                            i3 = 7;
                            break;
                        case 7:
                            i3 = 6;
                            break;
                        default:
                            i3 = i;
                            break;
                    }
                    chat.status = i3;
                    chat.owner = nx2Var.d;
                    chat.participants = nx2Var.e;
                    chat.created = nx2Var.f;
                    str = nx2Var.g;
                    if (str == null) {
                        str = "";
                    }
                    chat.title = str;
                    str2 = nx2Var.h;
                    if (str2 == null) {
                        str2 = "";
                    }
                    chat.baseIconUrl = str2;
                    str3 = nx2Var.i;
                    if (str3 == null) {
                        str3 = "";
                    }
                    chat.baseRawIconUrl = str3;
                    chat.lastMessageId = nx2Var.j;
                    chat.lastEventTime = nx2Var.k;
                    chat.joinTime = nx2Var.Q;
                    chat.joinRequestTime = nx2Var.R;
                    chat.cid = nx2Var.l;
                    chat.newMessages = nx2Var.m;
                    chat.markedAsUnread = nx2Var.i0;
                    arrayListE = fx2Var.e(mg5.REGULAR);
                    size = arrayListE.size();
                    if (size > 0) {
                        chat.chunk = new Protos.Chat.Chunk[size];
                        for (i12 = i; i12 < size; i12++) {
                            chat.chunk[i12] = a.j((ex2) arrayListE.get(i12));
                        }
                    }
                    arrayListE2 = fx2Var.e(mg5.DELAYED);
                    size2 = arrayListE2.size();
                    if (size2 > 0) {
                        chat.delayedChunk = new Protos.Chat.Chunk[size2];
                        for (i11 = i; i11 < size2; i11++) {
                            chat.delayedChunk[i11] = a.j((ex2) arrayListE2.get(i11));
                        }
                    }
                    cx2VarA = nx2Var.a();
                    if (cx2VarA != null) {
                        list3 = cx2VarA.b;
                        chatSettings = new Protos.Chat.ChatSettings();
                        chatSettings.lastNotifMark = cx2VarA.c;
                        chatSettings.lastNotifMessageId = cx2VarA.d;
                        chatSettings.dontDisturbUntil = cx2VarA.a;
                        if (list3.size() > 0) {
                            chatSettings.options = new int[list3.size()];
                            i10 = i;
                            while (i10 < list3.size()) {
                                iOrdinal2 = ((xw2) list3.get(i10)).ordinal();
                                if (iOrdinal2 != 0) {
                                    i1cVar2 = i1cVar3;
                                    if (iOrdinal2 != 1) {
                                        chatSettings.options[i10] = 1;
                                    } else if (iOrdinal2 != 2) {
                                        chatSettings.options[i10] = 2;
                                    }
                                } else {
                                    i1cVar2 = i1cVar3;
                                    chatSettings.options[i10] = i;
                                }
                                i10++;
                                i1cVar3 = i1cVar2;
                            }
                        }
                        i1cVar = i1cVar3;
                        chatSettings.favoriteIndex = cx2VarA.e;
                        chatSettings.hideMyLiveLocationPanelBeforeTime = cx2VarA.f;
                        chatSettings.hideLiveLocationPanelBeforeTime = cx2VarA.g;
                        chat.chatSettings = chatSettings;
                    } else {
                        i1cVar = i1cVar3;
                    }
                    ax2Var = nx2Var.p;
                    if (ax2Var != null) {
                        Protos.Chat.ChatReactionsSettings chatReactionsSettings = new Protos.Chat.ChatReactionsSettings();
                        chatReactionsSettings.isActive = ax2Var.e();
                        chatReactionsSettings.count = ax2Var.b();
                        chatReactionsSettings.updateTime = ax2Var.d();
                        chatReactionsSettings.included = ax2Var.f();
                        listC = ax2Var.c();
                        if (listC != null) {
                            strArr = (String[]) listC.toArray(new String[listC.size()]);
                        } else {
                            strArr = null;
                        }
                        chatReactionsSettings.reactionIds = strArr;
                        if (listC != null) {
                            z = 1;
                        } else {
                            z = i;
                        }
                        chatReactionsSettings.isFull = z;
                        chat.chatReactionsSettings = chatReactionsSettings;
                    }
                    ww2Var = nx2Var.q;
                    if (ww2Var == null) {
                        ww2Var = ww2.g;
                    }
                    chat.mediaAll = a.h(ww2Var);
                    ww2Var2 = nx2Var.r;
                    if (ww2Var2 == null) {
                        ww2Var2 = ww2.g;
                    }
                    chat.mediaPhotoVideo = a.h(ww2Var2);
                    ww2Var3 = nx2Var.t;
                    if (ww2Var3 == null) {
                        ww2Var3 = ww2.g;
                    }
                    chat.mediaMusic = a.h(ww2Var3);
                    ww2Var4 = nx2Var.u;
                    if (ww2Var4 == null) {
                        ww2Var4 = ww2.g;
                    }
                    chat.mediaAudio = a.h(ww2Var4);
                    ww2Var5 = nx2Var.v;
                    if (ww2Var5 == null) {
                        ww2Var5 = ww2.g;
                    }
                    chat.mediaAudioVideoMsg = a.h(ww2Var5);
                    ww2Var6 = nx2Var.w;
                    if (ww2Var6 == null) {
                        ww2Var6 = ww2.g;
                    }
                    chat.mediaFiles = a.h(ww2Var6);
                    ww2Var7 = nx2Var.x;
                    if (ww2Var7 == null) {
                        ww2Var7 = ww2.g;
                    }
                    chat.mediaLocations = a.h(ww2Var7);
                    ww2Var8 = nx2Var.s;
                    if (ww2Var8 == null) {
                        ww2Var8 = ww2.g;
                    }
                    chat.mediaShare = a.h(ww2Var8);
                    chat.firstMessageId = nx2Var.y;
                    if (list4.size() > 0) {
                        chat.sections = new Protos.Chat.Section[list4.size()];
                        for (i9 = i; i9 < list4.size(); i9++) {
                            jx2 jx2Var = (jx2) list4.get(i9);
                            Protos.Chat.Section section = new Protos.Chat.Section();
                            section.id = jx2Var.a;
                            str12 = jx2Var.b;
                            if (str12 == null) {
                                str12 = "";
                            }
                            section.title = str12;
                            section.stickers = p90.i(jx2Var.c);
                            section.marker = jx2Var.d;
                            section.collapsed = jx2Var.e;
                            chat.sections[i9] = section;
                        }
                    }
                    if (list5 != null) {
                        List list6 = nx2Var.A;
                        chat.stickersOrder = (String[]) list6.toArray(new String[list6.size()]);
                    }
                    chat.stickersSyncTime = nx2Var.B;
                    if (list5.size() > 0) {
                        chat.localChanges = new int[list5.size()];
                        for (i8 = i; i8 < list5.size(); i8++) {
                            iOrdinal = ((uw2) list5.get(i8)).ordinal();
                            if (iOrdinal != 0) {
                                chat.localChanges[i8] = i;
                            } else if (iOrdinal != 1) {
                                chat.localChanges[i8] = 1;
                            } else if (iOrdinal != 2) {
                                chat.localChanges[i8] = 2;
                            } else if (iOrdinal != 3) {
                                chat.localChanges[i8] = 3;
                            }
                        }
                    }
                    dx2Var = nx2Var.D;
                    if (dx2Var != null && dx2Var.a().length > 0) {
                        Protos.Chat.ChatSubject chatSubject = new Protos.Chat.ChatSubject();
                        chatSubject.organizationIds = dx2Var.a();
                        chat.chatSubject = chatSubject;
                    }
                    iD = qt4.D(nx2Var.w0);
                    if (iD != 0) {
                        chat.accessType = i;
                    } else if (iD == 1) {
                        chat.accessType = 1;
                    }
                    chat.participantsCount = nx2Var.b();
                    str4 = nx2Var.F;
                    if (str4 == null) {
                        str4 = r14;
                    }
                    chat.description = str4;
                    chat.admins = p90.i(nx2Var.G);
                    mwVar = nx2Var.T;
                    map = new HashMap(mwVar.c);
                    it = ((iw) mwVar.keySet()).iterator();
                    while (true) {
                        zc8Var = (zc8) it;
                        if (zc8Var.hasNext()) {
                            chat.adminParticipants = map;
                            chat.blockedParticipantsCount = nx2Var.H;
                            if (zw2Var != null) {
                                Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                                chat.chatOptions = chatOptions;
                                chatOptions.signAdmin = zw2Var.a;
                                chatOptions.onlyOwnerCanChangeIconTitle = zw2Var.b;
                                chatOptions.official = zw2Var.c;
                                chatOptions.allCanPinMessage = zw2Var.e;
                                chatOptions.onlyAdminCanAddMember = zw2Var.d;
                                chatOptions.onlyAdminCanCall = zw2Var.f;
                                chatOptions.sentByPhone = zw2Var.g;
                                chatOptions.serviceChat = zw2Var.h;
                                chatOptions.membersCanSeePrivateLink = zw2Var.i;
                                chatOptions.contentLevelChat = zw2Var.j;
                                chatOptions.aPlusChannel = zw2Var.k;
                                chatOptions.joinRequest = zw2Var.l;
                                chatOptions.comments = zw2Var.m;
                                chatOptions.commentsDisabled = zw2Var.n;
                                chatOptions.confirmBeforeSend = zw2Var.o;
                                chatOptions.disableForward = zw2Var.p;
                            }
                            chat.channelInfo = null;
                            str5 = nx2Var.J;
                            if (str5 == null) {
                                str5 = r14;
                            }
                            chat.link = str5;
                            ix2Var = nx2Var.K;
                            if (ix2Var != null) {
                                i4 = ix2Var.b;
                            } else {
                                i4 = 0;
                            }
                            chat.restrictions = i4;
                            gx2Var = nx2Var.L;
                            if (gx2Var != null) {
                                groupChatInfo = new Protos.Chat.GroupChatInfo();
                                groupChatInfo.groupId = gx2Var.c();
                                groupChatInfo.isAnswered = gx2Var.e();
                                groupChatInfo.isModerator = gx2Var.i();
                                groupChatInfo.isImportant = gx2Var.g();
                                strK = gx2Var.k();
                                if (strK == null) {
                                    strK = r14;
                                }
                                groupChatInfo.name = strK;
                                strB = gx2Var.b();
                                if (strB == null) {
                                    strB = r14;
                                }
                                groupChatInfo.baseIconUrl = strB;
                                groupChatInfo.isCustomTitle = gx2Var.f();
                                groupChatInfo.isMember = gx2Var.h();
                                jr7 jr7VarD = gx2Var.d();
                                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = new Protos.Chat.GroupChatInfo.GroupOptions();
                                groupOptions.groupPremium = jr7VarD.a();
                                groupChatInfo.groupOptions = groupOptions;
                                if (gx2Var.j() == 0) {
                                    i5 = 0;
                                } else {
                                    iD4 = qt4.D(gx2Var.j());
                                    if (iD4 != 0) {
                                        if (iD4 != 1) {
                                            groupChatInfo.messagingPermissions = 1;
                                        } else if (iD4 == 2) {
                                            groupChatInfo.messagingPermissions = 2;
                                        }
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                        groupChatInfo.messagingPermissions = 0;
                                    }
                                }
                                chat.groupChatInfo = groupChatInfo;
                            } else {
                                i5 = 0;
                            }
                            chat.pinnedMessageId = nx2Var.M;
                            chat.hidePinnedMessage = nx2Var.N;
                            chat.unreadReply = nx2Var.O;
                            chat.unreadPin = nx2Var.P;
                            chat.messagesTtlSec = nx2Var.S;
                            chat.flagsSettings = nx2Var.U;
                            mx2Var = nx2Var.V;
                            if (mx2Var != null) {
                                list2 = mx2Var.e;
                                Protos.Chat.VideoConversation videoConversation = new Protos.Chat.VideoConversation();
                                chat.videoConversation = videoConversation;
                                str8 = mx2Var.a;
                                if (str8 == null) {
                                    str8 = r14;
                                }
                                videoConversation.conversationId = str8;
                                videoConversation.startedAt = mx2Var.b;
                                str9 = mx2Var.c;
                                if (str9 == null) {
                                    str9 = r14;
                                }
                                videoConversation.joinLink = str9;
                                videoConversation.approxParticipantCount = mx2Var.d;
                                if (list2 != null) {
                                    jArr = new long[list2.size()];
                                    for (i7 = i5; i7 < list2.size(); i7++) {
                                        jArr[i7] = ((Long) list2.get(i7)).longValue();
                                    }
                                    chat.videoConversation.previewParticipantIds = jArr;
                                }
                                Protos.Chat.VideoConversation videoConversation2 = chat.videoConversation;
                                iD2 = qt4.D(mx2Var.f);
                                if (iD2 != 0) {
                                    i6 = i5;
                                } else if (iD2 != 1) {
                                    i6 = 1;
                                } else {
                                    if (iD2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    i6 = 2;
                                }
                                videoConversation2.type = i6;
                                Protos.Chat.VideoConversation videoConversation3 = chat.videoConversation;
                                iD3 = qt4.D(mx2Var.g);
                                if (iD3 != 0) {
                                    attach = null;
                                    str10 = "AUDIO";
                                } else if (iD3 != 1) {
                                    attach = null;
                                    str10 = "VIDEO";
                                } else {
                                    if (iD3 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    str10 = r14;
                                    attach = null;
                                }
                                videoConversation3.mediaCallType = str10;
                            } else {
                                attach = null;
                            }
                            chat.lastOpenPositionTime = nx2Var.W;
                            chat.lastOpenPositionOffset = nx2Var.X;
                            chat.lastOpenReadMark = nx2Var.Y;
                            chat.lastOpenNewMessages = nx2Var.Z;
                            chat.lastSearchClickTime = nx2Var.a0;
                            chat.lastWriteTime = nx2Var.b0;
                            h1cVar = nx2Var.e0;
                            if (h1cVar != null) {
                                i1cVar.getClass();
                                byteArray = sb8.i;
                                if (!h1cVar.c()) {
                                    uwdVar = new uwd();
                                    uwdVar.f = h1cVar.a();
                                    wx8Var = h1cVar.b;
                                    if (!iel.c(wx8Var)) {
                                        uwdVar.a = wx8Var.b();
                                        listA = wx8Var.a();
                                        list = listA;
                                        if (list != null && !list.isEmpty()) {
                                            uwdVar.e = dga.c(listA);
                                        }
                                    }
                                    l = h1cVar.d;
                                    if (l != null) {
                                        jLongValue = l.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    uwdVar.b = jLongValue;
                                    Long l2 = h1cVar.c;
                                    uwdVar.c = l2 != null ? l2.longValue() : 0L;
                                    byteArray = sia.toByteArray(uwdVar);
                                }
                                chat.draft = byteArray;
                            } else {
                                chat.draft = a.a;
                            }
                            chat.draftUpdateTime = nx2Var.f0;
                            chat.draftUpdateTimeForSyncLogic = nx2Var.g0;
                            d11Var = nx2Var.d0;
                            if (d11Var == null) {
                                d11Var = d11.c;
                            }
                            Protos.Chat.BotsInfo botsInfo = new Protos.Chat.BotsInfo();
                            botsInfo.hasBots = d11Var.a;
                            botsInfo.suspendedBot = d11Var.b;
                            chat.botsInfo = botsInfo;
                            chat.modified = nx2Var.c0;
                            chat.liveLocationMessageIds = nx2Var.l0;
                            chat.lastMentionMessageId = nx2Var.h0;
                            chat.lastReactedMessageId = nx2Var.j0;
                            str6 = nx2Var.k0;
                            if (str6 != null) {
                                str7 = str6;
                            } else {
                                str7 = r14;
                            }
                            chat.lastReaction = str7;
                            if (hx2Var != null) {
                                Protos.Chat.PushMessage pushMessage = new Protos.Chat.PushMessage();
                                pushMessage.id = hx2Var.c;
                                pushMessage.time = hx2Var.b;
                                pushMessage.text = hx2Var.a;
                                chat.lastPushMessage = pushMessage;
                            }
                            chat.lastDelayedUpdateTime = nx2Var.n0;
                            chat.lastFireDelayedErrorTime = nx2Var.p0;
                            chat.participantSettings = nx2Var.q0;
                            chat.pendingJoinRequestsCount = nx2Var.r0;
                            chat.invitedBy = nx2Var.s0;
                            chat.lastDelayedLoadTime = nx2Var.o0;
                            chat.liveStreamUpdateTime = nx2Var.t0;
                            if (gj2Var != null) {
                                Protos.Chat.LiveStream liveStream = new Protos.Chat.LiveStream();
                                chat.liveStream = liveStream;
                                liveStream.updateTime = gj2Var.b;
                                e70Var = (e70) gj2Var.c;
                                if (e70Var == null) {
                                    attachD = attach;
                                } else {
                                    attachD = a.d(e70Var);
                                }
                                liveStream.media = attachD;
                            }
                            chat.commentsBlacklistCount = nx2Var.v0;
                            vxeVar.d(3, sia.toByteArray(chat));
                            vxeVar.c(4, jy2Var.d);
                            vxeVar.c(5, jy2Var.e);
                            vxeVar.c(6, jy2Var.f);
                            return;
                        }
                        Long l3 = (Long) zc8Var.next();
                        sw2 sw2Var = (sw2) mwVar.get(l3);
                        Protos.Chat.AdminParticipant adminParticipant = new Protos.Chat.AdminParticipant();
                        adminParticipant.id = sw2Var.a;
                        adminParticipant.permissions = sw2Var.b;
                        adminParticipant.inviterId = sw2Var.c;
                        str11 = sw2Var.d;
                        if (str11 == null) {
                            str11 = r14;
                        }
                        adminParticipant.alias = str11;
                        map.put(l3, adminParticipant);
                    }
                } else {
                    i = 0;
                }
                i2 = i;
                chat.type = i2;
                switch (nx2Var.c.ordinal()) {
                    case 1:
                        i3 = 1;
                        break;
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 5;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 6;
                        break;
                    default:
                        i3 = i;
                        break;
                }
                chat.status = i3;
                chat.owner = nx2Var.d;
                chat.participants = nx2Var.e;
                chat.created = nx2Var.f;
                str = nx2Var.g;
                if (str == null) {
                    str = "";
                }
                chat.title = str;
                str2 = nx2Var.h;
                if (str2 == null) {
                    str2 = "";
                }
                chat.baseIconUrl = str2;
                str3 = nx2Var.i;
                if (str3 == null) {
                    str3 = "";
                }
                chat.baseRawIconUrl = str3;
                chat.lastMessageId = nx2Var.j;
                chat.lastEventTime = nx2Var.k;
                chat.joinTime = nx2Var.Q;
                chat.joinRequestTime = nx2Var.R;
                chat.cid = nx2Var.l;
                chat.newMessages = nx2Var.m;
                chat.markedAsUnread = nx2Var.i0;
                arrayListE = fx2Var.e(mg5.REGULAR);
                size = arrayListE.size();
                if (size > 0) {
                    chat.chunk = new Protos.Chat.Chunk[size];
                    while (i12 < size) {
                        chat.chunk[i12] = a.j((ex2) arrayListE.get(i12));
                    }
                }
                arrayListE2 = fx2Var.e(mg5.DELAYED);
                size2 = arrayListE2.size();
                if (size2 > 0) {
                    chat.delayedChunk = new Protos.Chat.Chunk[size2];
                    while (i11 < size2) {
                        chat.delayedChunk[i11] = a.j((ex2) arrayListE2.get(i11));
                    }
                }
                cx2VarA = nx2Var.a();
                if (cx2VarA != null) {
                    list3 = cx2VarA.b;
                    chatSettings = new Protos.Chat.ChatSettings();
                    chatSettings.lastNotifMark = cx2VarA.c;
                    chatSettings.lastNotifMessageId = cx2VarA.d;
                    chatSettings.dontDisturbUntil = cx2VarA.a;
                    if (list3.size() > 0) {
                        chatSettings.options = new int[list3.size()];
                        i10 = i;
                        while (i10 < list3.size()) {
                            iOrdinal2 = ((xw2) list3.get(i10)).ordinal();
                            if (iOrdinal2 != 0) {
                                i1cVar2 = i1cVar3;
                                if (iOrdinal2 != 1) {
                                    chatSettings.options[i10] = 1;
                                } else if (iOrdinal2 != 2) {
                                    chatSettings.options[i10] = 2;
                                }
                            } else {
                                i1cVar2 = i1cVar3;
                                chatSettings.options[i10] = i;
                            }
                            i10++;
                            i1cVar3 = i1cVar2;
                        }
                    }
                    i1cVar = i1cVar3;
                    chatSettings.favoriteIndex = cx2VarA.e;
                    chatSettings.hideMyLiveLocationPanelBeforeTime = cx2VarA.f;
                    chatSettings.hideLiveLocationPanelBeforeTime = cx2VarA.g;
                    chat.chatSettings = chatSettings;
                } else {
                    i1cVar = i1cVar3;
                }
                ax2Var = nx2Var.p;
                if (ax2Var != null) {
                    Protos.Chat.ChatReactionsSettings chatReactionsSettings2 = new Protos.Chat.ChatReactionsSettings();
                    chatReactionsSettings2.isActive = ax2Var.e();
                    chatReactionsSettings2.count = ax2Var.b();
                    chatReactionsSettings2.updateTime = ax2Var.d();
                    chatReactionsSettings2.included = ax2Var.f();
                    listC = ax2Var.c();
                    if (listC != null) {
                        strArr = (String[]) listC.toArray(new String[listC.size()]);
                    } else {
                        strArr = null;
                    }
                    chatReactionsSettings2.reactionIds = strArr;
                    if (listC != null) {
                        z = 1;
                    } else {
                        z = i;
                    }
                    chatReactionsSettings2.isFull = z;
                    chat.chatReactionsSettings = chatReactionsSettings2;
                }
                ww2Var = nx2Var.q;
                if (ww2Var == null) {
                    ww2Var = ww2.g;
                }
                chat.mediaAll = a.h(ww2Var);
                ww2Var2 = nx2Var.r;
                if (ww2Var2 == null) {
                    ww2Var2 = ww2.g;
                }
                chat.mediaPhotoVideo = a.h(ww2Var2);
                ww2Var3 = nx2Var.t;
                if (ww2Var3 == null) {
                    ww2Var3 = ww2.g;
                }
                chat.mediaMusic = a.h(ww2Var3);
                ww2Var4 = nx2Var.u;
                if (ww2Var4 == null) {
                    ww2Var4 = ww2.g;
                }
                chat.mediaAudio = a.h(ww2Var4);
                ww2Var5 = nx2Var.v;
                if (ww2Var5 == null) {
                    ww2Var5 = ww2.g;
                }
                chat.mediaAudioVideoMsg = a.h(ww2Var5);
                ww2Var6 = nx2Var.w;
                if (ww2Var6 == null) {
                    ww2Var6 = ww2.g;
                }
                chat.mediaFiles = a.h(ww2Var6);
                ww2Var7 = nx2Var.x;
                if (ww2Var7 == null) {
                    ww2Var7 = ww2.g;
                }
                chat.mediaLocations = a.h(ww2Var7);
                ww2Var8 = nx2Var.s;
                if (ww2Var8 == null) {
                    ww2Var8 = ww2.g;
                }
                chat.mediaShare = a.h(ww2Var8);
                chat.firstMessageId = nx2Var.y;
                if (list4.size() > 0) {
                    chat.sections = new Protos.Chat.Section[list4.size()];
                    while (i9 < list4.size()) {
                        jx2 jx2Var2 = (jx2) list4.get(i9);
                        Protos.Chat.Section section2 = new Protos.Chat.Section();
                        section2.id = jx2Var2.a;
                        str12 = jx2Var2.b;
                        if (str12 == null) {
                            str12 = "";
                        }
                        section2.title = str12;
                        section2.stickers = p90.i(jx2Var2.c);
                        section2.marker = jx2Var2.d;
                        section2.collapsed = jx2Var2.e;
                        chat.sections[i9] = section2;
                    }
                }
                if (list5 != null) {
                    List list7 = nx2Var.A;
                    chat.stickersOrder = (String[]) list7.toArray(new String[list7.size()]);
                }
                chat.stickersSyncTime = nx2Var.B;
                if (list5.size() > 0) {
                    chat.localChanges = new int[list5.size()];
                    while (i8 < list5.size()) {
                        iOrdinal = ((uw2) list5.get(i8)).ordinal();
                        if (iOrdinal != 0) {
                            chat.localChanges[i8] = i;
                        } else if (iOrdinal != 1) {
                            chat.localChanges[i8] = 1;
                        } else if (iOrdinal != 2) {
                            chat.localChanges[i8] = 2;
                        } else if (iOrdinal != 3) {
                            chat.localChanges[i8] = 3;
                        }
                    }
                }
                dx2Var = nx2Var.D;
                if (dx2Var != null) {
                    Protos.Chat.ChatSubject chatSubject2 = new Protos.Chat.ChatSubject();
                    chatSubject2.organizationIds = dx2Var.a();
                    chat.chatSubject = chatSubject2;
                }
                iD = qt4.D(nx2Var.w0);
                if (iD != 0) {
                    chat.accessType = i;
                } else if (iD == 1) {
                    chat.accessType = 1;
                }
                chat.participantsCount = nx2Var.b();
                str4 = nx2Var.F;
                if (str4 == null) {
                    str4 = r14;
                }
                chat.description = str4;
                chat.admins = p90.i(nx2Var.G);
                mwVar = nx2Var.T;
                map = new HashMap(mwVar.c);
                it = ((iw) mwVar.keySet()).iterator();
                while (true) {
                    zc8Var = (zc8) it;
                    if (zc8Var.hasNext()) {
                        chat.adminParticipants = map;
                        chat.blockedParticipantsCount = nx2Var.H;
                        if (zw2Var != null) {
                            Protos.Chat.ChatOptions chatOptions2 = new Protos.Chat.ChatOptions();
                            chat.chatOptions = chatOptions2;
                            chatOptions2.signAdmin = zw2Var.a;
                            chatOptions2.onlyOwnerCanChangeIconTitle = zw2Var.b;
                            chatOptions2.official = zw2Var.c;
                            chatOptions2.allCanPinMessage = zw2Var.e;
                            chatOptions2.onlyAdminCanAddMember = zw2Var.d;
                            chatOptions2.onlyAdminCanCall = zw2Var.f;
                            chatOptions2.sentByPhone = zw2Var.g;
                            chatOptions2.serviceChat = zw2Var.h;
                            chatOptions2.membersCanSeePrivateLink = zw2Var.i;
                            chatOptions2.contentLevelChat = zw2Var.j;
                            chatOptions2.aPlusChannel = zw2Var.k;
                            chatOptions2.joinRequest = zw2Var.l;
                            chatOptions2.comments = zw2Var.m;
                            chatOptions2.commentsDisabled = zw2Var.n;
                            chatOptions2.confirmBeforeSend = zw2Var.o;
                            chatOptions2.disableForward = zw2Var.p;
                        }
                        chat.channelInfo = null;
                        str5 = nx2Var.J;
                        if (str5 == null) {
                            str5 = r14;
                        }
                        chat.link = str5;
                        ix2Var = nx2Var.K;
                        if (ix2Var != null) {
                            i4 = ix2Var.b;
                        } else {
                            i4 = 0;
                        }
                        chat.restrictions = i4;
                        gx2Var = nx2Var.L;
                        if (gx2Var != null) {
                            groupChatInfo = new Protos.Chat.GroupChatInfo();
                            groupChatInfo.groupId = gx2Var.c();
                            groupChatInfo.isAnswered = gx2Var.e();
                            groupChatInfo.isModerator = gx2Var.i();
                            groupChatInfo.isImportant = gx2Var.g();
                            strK = gx2Var.k();
                            if (strK == null) {
                                strK = r14;
                            }
                            groupChatInfo.name = strK;
                            strB = gx2Var.b();
                            if (strB == null) {
                                strB = r14;
                            }
                            groupChatInfo.baseIconUrl = strB;
                            groupChatInfo.isCustomTitle = gx2Var.f();
                            groupChatInfo.isMember = gx2Var.h();
                            jr7 jr7VarD2 = gx2Var.d();
                            Protos.Chat.GroupChatInfo.GroupOptions groupOptions2 = new Protos.Chat.GroupChatInfo.GroupOptions();
                            groupOptions2.groupPremium = jr7VarD2.a();
                            groupChatInfo.groupOptions = groupOptions2;
                            if (gx2Var.j() == 0) {
                                i5 = 0;
                            } else {
                                iD4 = qt4.D(gx2Var.j());
                                if (iD4 != 0) {
                                    if (iD4 != 1) {
                                        groupChatInfo.messagingPermissions = 1;
                                    } else if (iD4 == 2) {
                                        groupChatInfo.messagingPermissions = 2;
                                    }
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    groupChatInfo.messagingPermissions = 0;
                                }
                            }
                            chat.groupChatInfo = groupChatInfo;
                        } else {
                            i5 = 0;
                        }
                        chat.pinnedMessageId = nx2Var.M;
                        chat.hidePinnedMessage = nx2Var.N;
                        chat.unreadReply = nx2Var.O;
                        chat.unreadPin = nx2Var.P;
                        chat.messagesTtlSec = nx2Var.S;
                        chat.flagsSettings = nx2Var.U;
                        mx2Var = nx2Var.V;
                        if (mx2Var != null) {
                            list2 = mx2Var.e;
                            Protos.Chat.VideoConversation videoConversation4 = new Protos.Chat.VideoConversation();
                            chat.videoConversation = videoConversation4;
                            str8 = mx2Var.a;
                            if (str8 == null) {
                                str8 = r14;
                            }
                            videoConversation4.conversationId = str8;
                            videoConversation4.startedAt = mx2Var.b;
                            str9 = mx2Var.c;
                            if (str9 == null) {
                                str9 = r14;
                            }
                            videoConversation4.joinLink = str9;
                            videoConversation4.approxParticipantCount = mx2Var.d;
                            if (list2 != null) {
                                jArr = new long[list2.size()];
                                while (i7 < list2.size()) {
                                    jArr[i7] = ((Long) list2.get(i7)).longValue();
                                }
                                chat.videoConversation.previewParticipantIds = jArr;
                            }
                            Protos.Chat.VideoConversation videoConversation5 = chat.videoConversation;
                            iD2 = qt4.D(mx2Var.f);
                            if (iD2 != 0) {
                                i6 = i5;
                            } else if (iD2 != 1) {
                                i6 = 1;
                            } else {
                                if (iD2 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                i6 = 2;
                            }
                            videoConversation5.type = i6;
                            Protos.Chat.VideoConversation videoConversation6 = chat.videoConversation;
                            iD3 = qt4.D(mx2Var.g);
                            if (iD3 != 0) {
                                attach = null;
                                str10 = "AUDIO";
                            } else if (iD3 != 1) {
                                attach = null;
                                str10 = "VIDEO";
                            } else {
                                if (iD3 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                str10 = r14;
                                attach = null;
                            }
                            videoConversation6.mediaCallType = str10;
                        } else {
                            attach = null;
                        }
                        chat.lastOpenPositionTime = nx2Var.W;
                        chat.lastOpenPositionOffset = nx2Var.X;
                        chat.lastOpenReadMark = nx2Var.Y;
                        chat.lastOpenNewMessages = nx2Var.Z;
                        chat.lastSearchClickTime = nx2Var.a0;
                        chat.lastWriteTime = nx2Var.b0;
                        h1cVar = nx2Var.e0;
                        if (h1cVar != null) {
                            i1cVar.getClass();
                            byteArray = sb8.i;
                            if (!h1cVar.c()) {
                                uwdVar = new uwd();
                                uwdVar.f = h1cVar.a();
                                wx8Var = h1cVar.b;
                                if (!iel.c(wx8Var)) {
                                    uwdVar.a = wx8Var.b();
                                    listA = wx8Var.a();
                                    list = listA;
                                    if (list != null) {
                                        uwdVar.e = dga.c(listA);
                                    }
                                }
                                l = h1cVar.d;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                uwdVar.b = jLongValue;
                                Long l4 = h1cVar.c;
                                uwdVar.c = l4 != null ? l4.longValue() : 0L;
                                byteArray = sia.toByteArray(uwdVar);
                            }
                            chat.draft = byteArray;
                        } else {
                            chat.draft = a.a;
                        }
                        chat.draftUpdateTime = nx2Var.f0;
                        chat.draftUpdateTimeForSyncLogic = nx2Var.g0;
                        d11Var = nx2Var.d0;
                        if (d11Var == null) {
                            d11Var = d11.c;
                        }
                        Protos.Chat.BotsInfo botsInfo2 = new Protos.Chat.BotsInfo();
                        botsInfo2.hasBots = d11Var.a;
                        botsInfo2.suspendedBot = d11Var.b;
                        chat.botsInfo = botsInfo2;
                        chat.modified = nx2Var.c0;
                        chat.liveLocationMessageIds = nx2Var.l0;
                        chat.lastMentionMessageId = nx2Var.h0;
                        chat.lastReactedMessageId = nx2Var.j0;
                        str6 = nx2Var.k0;
                        if (str6 != null) {
                            str7 = str6;
                        } else {
                            str7 = r14;
                        }
                        chat.lastReaction = str7;
                        if (hx2Var != null) {
                            Protos.Chat.PushMessage pushMessage2 = new Protos.Chat.PushMessage();
                            pushMessage2.id = hx2Var.c;
                            pushMessage2.time = hx2Var.b;
                            pushMessage2.text = hx2Var.a;
                            chat.lastPushMessage = pushMessage2;
                        }
                        chat.lastDelayedUpdateTime = nx2Var.n0;
                        chat.lastFireDelayedErrorTime = nx2Var.p0;
                        chat.participantSettings = nx2Var.q0;
                        chat.pendingJoinRequestsCount = nx2Var.r0;
                        chat.invitedBy = nx2Var.s0;
                        chat.lastDelayedLoadTime = nx2Var.o0;
                        chat.liveStreamUpdateTime = nx2Var.t0;
                        if (gj2Var != null) {
                            Protos.Chat.LiveStream liveStream2 = new Protos.Chat.LiveStream();
                            chat.liveStream = liveStream2;
                            liveStream2.updateTime = gj2Var.b;
                            e70Var = (e70) gj2Var.c;
                            if (e70Var == null) {
                                attachD = attach;
                            } else {
                                attachD = a.d(e70Var);
                            }
                            liveStream2.media = attachD;
                        }
                        chat.commentsBlacklistCount = nx2Var.v0;
                        vxeVar.d(3, sia.toByteArray(chat));
                        vxeVar.c(4, jy2Var.d);
                        vxeVar.c(5, jy2Var.e);
                        vxeVar.c(6, jy2Var.f);
                        return;
                    }
                    Long l5 = (Long) zc8Var.next();
                    sw2 sw2Var2 = (sw2) mwVar.get(l5);
                    Protos.Chat.AdminParticipant adminParticipant2 = new Protos.Chat.AdminParticipant();
                    adminParticipant2.id = sw2Var2.a;
                    adminParticipant2.permissions = sw2Var2.b;
                    adminParticipant2.inviterId = sw2Var2.c;
                    str11 = sw2Var2.d;
                    if (str11 == null) {
                        str11 = r14;
                    }
                    adminParticipant2.alias = str11;
                    map.put(l5, adminParticipant2);
                }
                break;
            case 1:
                gga ggaVar = (gga) obj;
                toa toaVar = (toa) obj2;
                vxeVar.c(1, ggaVar.a);
                vxeVar.c(2, ggaVar.b);
                vxeVar.c(3, ggaVar.c);
                vxeVar.c(4, ggaVar.d);
                vxeVar.c(5, ggaVar.e);
                vxeVar.c(6, ggaVar.f);
                String str13 = ggaVar.g;
                if (str13 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str13);
                }
                dwa dwaVarE = toaVar.e();
                xfa xfaVar = ggaVar.h;
                dwaVarE.getClass();
                vxeVar.c(8, xfaVar.a);
                dwa dwaVarE2 = toaVar.e();
                wja wjaVar = ggaVar.i;
                dwaVarE2.getClass();
                vxeVar.c(9, wjaVar.a);
                vxeVar.c(10, ggaVar.j ? 1L : 0L);
                vxeVar.c(11, ggaVar.k);
                String str14 = ggaVar.l;
                if (str14 == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.B(12, str14);
                }
                String str15 = ggaVar.m;
                if (str15 == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.B(13, str15);
                }
                c46 c46Var = ggaVar.n;
                toaVar.e().getClass();
                byte[] byteArray2 = c46Var != null ? sia.toByteArray(a.f(c46Var)) : null;
                if (byteArray2 == null) {
                    vxeVar.e(14);
                } else {
                    vxeVar.d(14, byteArray2);
                }
                vxeVar.c(15, ggaVar.o);
                vxeVar.c(16, ggaVar.p ? 1L : 0L);
                vxeVar.c(17, ggaVar.q);
                vxeVar.c(18, ggaVar.r);
                vxeVar.c(19, ggaVar.s ? 1L : 0L);
                vxeVar.c(20, ggaVar.t);
                String str16 = ggaVar.u;
                if (str16 == null) {
                    vxeVar.e(21);
                } else {
                    vxeVar.B(21, str16);
                }
                String str17 = ggaVar.v;
                if (str17 == null) {
                    vxeVar.e(22);
                } else {
                    vxeVar.B(22, str17);
                }
                String str18 = ggaVar.w;
                if (str18 == null) {
                    vxeVar.e(23);
                } else {
                    vxeVar.B(23, str18);
                }
                int i14 = ggaVar.K;
                toaVar.d().getClass();
                Integer numB = vo3.b(i14);
                if (numB == null) {
                    vxeVar.e(24);
                } else {
                    vxeVar.c(24, numB.intValue());
                }
                vxeVar.c(25, ggaVar.x);
                vxeVar.c(26, ggaVar.y);
                dwa dwaVarE3 = toaVar.e();
                int i15 = ggaVar.L;
                dwaVarE3.getClass();
                vxeVar.c(27, r5a.e(i15));
                vxeVar.c(28, ggaVar.z);
                vxeVar.c(29, ggaVar.A);
                vxeVar.c(30, ggaVar.B);
                vxeVar.c(31, ggaVar.C);
                vxeVar.c(32, ggaVar.D);
                vxeVar.c(33, ggaVar.E);
                dwa dwaVarE4 = toaVar.e();
                List list8 = ggaVar.F;
                dwaVarE4.getClass();
                vxeVar.d(34, dga.b(list8));
                kja kjaVar = ggaVar.G;
                toaVar.e().getClass();
                byte[] bArrX = pm9.x(kjaVar);
                if (bArrX == null) {
                    vxeVar.e(35);
                } else {
                    vxeVar.d(35, bArrX);
                }
                Long l6 = ggaVar.H;
                if (l6 == null) {
                    vxeVar.e(36);
                } else {
                    vxeVar.c(36, l6.longValue());
                }
                Boolean bool = ggaVar.I;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    vxeVar.e(37);
                } else {
                    vxeVar.c(37, numValueOf.intValue());
                }
                vxeVar.c(38, ggaVar.J);
                return;
            default:
                kcg kcgVar = (kcg) obj;
                vxeVar.c(1, kcgVar.a());
                vxeVar.c(2, kcgVar.c());
                vxeVar.d(3, kcgVar.b());
                gp0 gp0Var = ((icg) obj2).d;
                jcg jcgVarD = kcgVar.d();
                gp0Var.getClass();
                vxeVar.c(4, jcgVarD.a);
                return;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `chats` (`id`,`server_id`,`data`,`favourite_index`,`sort_time`,`cid`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`status_in_process`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_chat_icon_url`,`msg_link_chat_access_type`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`channel_views`,`channel_forwards`,`view_time`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`,`reactions_update_time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `perf_snapshots` (`id`,`sliceTime`,`payload`,`type`) VALUES (nullif(?, 0),?,?,?)";
        }
    }
}
