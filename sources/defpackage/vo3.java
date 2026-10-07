package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class vo3 {
    public final i1c a;

    public vo3(i1c i1cVar) {
        this.a = i1cVar;
    }

    public static int a(Integer num) {
        if (num != null && num.intValue() == 0) {
            return 1;
        }
        return (num != null && num.intValue() == 1) ? 2 : 0;
    }

    public static Integer b(int i) {
        int i2 = i == 0 ? -1 : uo3.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != 1) {
            return i2 != 2 ? null : 1;
        }
        return 0;
    }

    public final nx2 c(byte[] bArr) throws ProtoException {
        lx2 lx2Var;
        kx2 kx2Var;
        h1c h1cVar;
        Protos.MessageElement[] messageElementArr;
        ArrayList arrayList;
        Map<Long, Protos.Chat.AdminParticipant> map;
        byte[] bArr2 = a.a;
        try {
            Protos.Chat chat = (Protos.Chat) sia.mergeFrom(new Protos.Chat(), bArr);
            tw2 tw2Var = new tw2();
            tw2Var.a = chat.serverId;
            int i = chat.type;
            int i2 = 3;
            int i3 = 1;
            if (i != 0) {
                lx2Var = lx2.b;
                if (i != 1) {
                    if (i == 2) {
                        lx2Var = lx2.c;
                    } else if (i == 3) {
                        lx2Var = lx2.d;
                    } else if (i == 4) {
                        lx2Var = lx2.e;
                    }
                }
            } else {
                lx2Var = lx2.a;
            }
            tw2Var.b = lx2Var;
            switch (chat.status) {
                case 1:
                    kx2Var = kx2.b;
                    break;
                case 2:
                    kx2Var = kx2.c;
                    break;
                case 3:
                    kx2Var = kx2.d;
                    break;
                case 4:
                    kx2Var = kx2.e;
                    break;
                case 5:
                    kx2Var = kx2.f;
                    break;
                case 6:
                    kx2Var = kx2.h;
                    break;
                case 7:
                    kx2Var = kx2.g;
                    break;
                default:
                    kx2Var = kx2.a;
                    break;
            }
            tw2Var.c = kx2Var;
            tw2Var.d = chat.owner;
            tw2Var.e = chat.participants;
            tw2Var.f = chat.created;
            tw2Var.g = chat.title;
            tw2Var.h = chat.baseIconUrl;
            tw2Var.i = chat.baseRawIconUrl;
            tw2Var.j = chat.lastMessageId;
            tw2Var.k = chat.lastEventTime;
            tw2Var.Q = chat.joinTime;
            tw2Var.R = chat.joinRequestTime;
            tw2Var.l = chat.cid;
            tw2Var.m = chat.newMessages;
            tw2Var.j0 = chat.markedAsUnread;
            Protos.Chat.Chunk[] chunkArr = chat.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                for (Protos.Chat.Chunk chunk : chunkArr) {
                    tw2Var.n.a(a.i(chunk), mg5.REGULAR);
                }
            }
            Protos.Chat.Chunk[] chunkArr2 = chat.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                for (Protos.Chat.Chunk chunk2 : chunkArr2) {
                    tw2Var.n.a(a.i(chunk2), mg5.DELAYED);
                }
            }
            Protos.Chat.ChatSettings chatSettings = chat.chatSettings;
            if (chatSettings != null) {
                bx2 bx2Var = new bx2();
                bx2Var.c = chatSettings.lastNotifMark;
                bx2Var.d = chatSettings.lastNotifMessageId;
                bx2Var.a = chatSettings.dontDisturbUntil;
                int[] iArr = chatSettings.options;
                if (iArr != null && iArr.length > 0) {
                    for (int i5 : iArr) {
                        if (i5 == 0) {
                            bx2Var.a(xw2.a);
                        } else if (i5 == 1) {
                            bx2Var.a(xw2.b);
                        } else if (i5 == 2) {
                            bx2Var.a(xw2.c);
                        }
                    }
                }
                bx2Var.e = chatSettings.favoriteIndex;
                bx2Var.f = chatSettings.hideMyLiveLocationPanelBeforeTime;
                bx2Var.g = chatSettings.hideLiveLocationPanelBeforeTime;
                tw2Var.o = new cx2(bx2Var);
            }
            Protos.Chat.ChatReactionsSettings chatReactionsSettings = chat.chatReactionsSettings;
            if (chatReactionsSettings != null) {
                ax2 ax2Var = new ax2();
                ax2Var.i(chatReactionsSettings.isActive);
                ax2Var.g(chatReactionsSettings.count);
                ax2Var.k(chatReactionsSettings.updateTime);
                ax2Var.h(chatReactionsSettings.included);
                ax2Var.j(chatReactionsSettings.isFull ? Arrays.asList(chatReactionsSettings.reactionIds) : null);
                tw2Var.p = ax2Var.a();
            }
            Protos.Chat.ChatMedia chatMedia = chat.mediaAll;
            if (chatMedia != null) {
                tw2Var.q = a.g(chatMedia);
            }
            Protos.Chat.ChatMedia chatMedia2 = chat.mediaPhotoVideo;
            if (chatMedia2 != null) {
                tw2Var.r = a.g(chatMedia2);
            }
            Protos.Chat.ChatMedia chatMedia3 = chat.mediaMusic;
            if (chatMedia3 != null) {
                tw2Var.t = a.g(chatMedia3);
            }
            Protos.Chat.ChatMedia chatMedia4 = chat.mediaAudio;
            if (chatMedia4 != null) {
                tw2Var.u = a.g(chatMedia4);
            }
            Protos.Chat.ChatMedia chatMedia5 = chat.mediaAudioVideoMsg;
            if (chatMedia5 != null) {
                tw2Var.v = a.g(chatMedia5);
            }
            Protos.Chat.ChatMedia chatMedia6 = chat.mediaFiles;
            if (chatMedia6 != null) {
                tw2Var.w = a.g(chatMedia6);
            }
            Protos.Chat.ChatMedia chatMedia7 = chat.mediaLocations;
            if (chatMedia7 != null) {
                tw2Var.x = a.g(chatMedia7);
            }
            Protos.Chat.ChatMedia chatMedia8 = chat.mediaShare;
            if (chatMedia8 != null) {
                tw2Var.s = a.g(chatMedia8);
            }
            tw2Var.y = chat.firstMessageId;
            Protos.Chat.Section[] sectionArr = chat.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                for (Protos.Chat.Section section : sectionArr) {
                    m9 m9Var = new m9();
                    m9Var.d(section.id);
                    m9Var.g(section.title);
                    long[] jArr = section.stickers;
                    if (jArr != null) {
                        m9Var.f(p90.h(jArr));
                    }
                    m9Var.e(section.marker);
                    m9Var.c(section.collapsed);
                    jx2 jx2VarA = m9Var.a();
                    if (tw2Var.z == null) {
                        tw2Var.z = new ArrayList();
                    }
                    tw2Var.z.add(jx2VarA);
                }
            }
            String[] strArr = chat.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                tw2Var.A = Arrays.asList(strArr);
            }
            tw2Var.B = chat.stickersSyncTime;
            int[] iArr2 = chat.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i6 : iArr2) {
                    if (i6 == 0) {
                        tw2Var.a(uw2.a);
                    } else if (i6 == 1) {
                        tw2Var.a(uw2.b);
                    } else if (i6 == 2) {
                        tw2Var.a(uw2.c);
                    } else if (i6 == 3) {
                        tw2Var.a(uw2.d);
                    }
                }
            }
            Protos.Chat.ChatSubject chatSubject = chat.chatSubject;
            if (chatSubject != null) {
                long[] jArr2 = chatSubject.organizationIds;
                if (jArr2.length > 0) {
                    tw2Var.E = new dx2(jArr2);
                }
            }
            Protos.Chat.ChannelInfo channelInfo = chat.channelInfo;
            if (channelInfo != null) {
                chat.participantsCount = channelInfo.membersCount;
                chat.description = channelInfo.description;
                chat.admins = channelInfo.admins;
                if (channelInfo.signAdmin) {
                    Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                    chatOptions.signAdmin = true;
                    chat.chatOptions = chatOptions;
                }
            }
            if (chat.participantsCount == 0 && tw2Var.c().size() > 0) {
                chat.participantsCount = tw2Var.c().size();
            }
            tw2Var.H = chat.participantsCount;
            tw2Var.I = chat.description;
            tw2Var.J = p90.h(chat.admins);
            long[] jArr3 = chat.admins;
            if (jArr3 == null || ((map = chat.adminParticipants) != null && jArr3.length <= map.size())) {
                tw2Var.d(a.a(chat.adminParticipants));
            } else {
                HashMap map2 = new HashMap();
                Map<Long, Protos.Chat.AdminParticipant> map3 = chat.adminParticipants;
                if (map3 != null) {
                    map2.putAll(a.a(map3));
                }
                for (long j : chat.admins) {
                    if (!map2.containsKey(Long.valueOf(j))) {
                        Long lValueOf = Long.valueOf(j);
                        rw2 rw2VarA = sw2.a();
                        rw2VarA.c(j);
                        rw2VarA.e(4091);
                        map2.put(lValueOf, rw2VarA.a());
                    }
                }
                tw2Var.d(map2);
            }
            tw2Var.K = chat.blockedParticipantsCount;
            if (chat.chatOptions != null) {
                if (tw2Var.L == null) {
                    tw2Var.L = zw2.q;
                }
                yw2 yw2VarA = tw2Var.L.a();
                Protos.Chat.ChatOptions chatOptions2 = chat.chatOptions;
                yw2VarA.b = chatOptions2.onlyOwnerCanChangeIconTitle;
                yw2VarA.a = chatOptions2.signAdmin;
                yw2VarA.c = chatOptions2.official;
                yw2VarA.e = chatOptions2.allCanPinMessage;
                yw2VarA.d = chatOptions2.onlyAdminCanAddMember;
                yw2VarA.f = chatOptions2.onlyAdminCanCall;
                yw2VarA.g = chatOptions2.sentByPhone;
                yw2VarA.h = chatOptions2.serviceChat;
                yw2VarA.i = chatOptions2.membersCanSeePrivateLink;
                yw2VarA.j = chatOptions2.contentLevelChat;
                yw2VarA.k = chatOptions2.aPlusChannel;
                yw2VarA.l = chatOptions2.joinRequest;
                yw2VarA.m = chatOptions2.comments;
                yw2VarA.n = chatOptions2.commentsDisabled;
                yw2VarA.o = chatOptions2.confirmBeforeSend;
                yw2VarA.p = chatOptions2.disableForward;
                tw2Var.L = new zw2(yw2VarA);
            }
            int i7 = chat.accessType;
            if (i7 == 0) {
                tw2Var.w0 = 1;
            } else if (i7 == 1) {
                tw2Var.w0 = 2;
            }
            tw2Var.F = chat.link;
            tw2Var.G = new ix2(chat.restrictions, i4);
            Protos.Chat.GroupChatInfo groupChatInfo = chat.groupChatInfo;
            if (groupChatInfo != null) {
                gx2 gx2Var = new gx2();
                gx2Var.m(groupChatInfo.groupId);
                gx2Var.o(groupChatInfo.isAnswered);
                gx2Var.s(groupChatInfo.isModerator);
                gx2Var.q(groupChatInfo.isImportant);
                gx2Var.u(groupChatInfo.name);
                gx2Var.l(groupChatInfo.baseIconUrl);
                gx2Var.p(groupChatInfo.isCustomTitle);
                gx2Var.r(groupChatInfo.isMember);
                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = groupChatInfo.groupOptions;
                gx2Var.n(groupOptions == null ? jr7.b : new jr7(groupOptions.groupPremium));
                int i8 = groupChatInfo.messagingPermissions;
                gx2Var.t(i8 != 1 ? i8 != 2 ? 1 : 3 : 2);
                tw2Var.D = gx2Var.a();
            }
            tw2Var.M = chat.pinnedMessageId;
            tw2Var.N = chat.hidePinnedMessage;
            tw2Var.O = chat.unreadReply;
            tw2Var.P = chat.unreadPin;
            tw2Var.S = chat.messagesTtlSec;
            tw2Var.U = chat.flagsSettings;
            Protos.Chat.VideoConversation videoConversation = chat.videoConversation;
            if (videoConversation != null) {
                long[] jArr4 = videoConversation.previewParticipantIds;
                if (jArr4 != null) {
                    arrayList = new ArrayList(jArr4.length);
                    while (i4 < jArr4.length) {
                        arrayList.add(Long.valueOf(jArr4[i4]));
                        i4++;
                    }
                } else {
                    arrayList = null;
                }
                Protos.Chat.VideoConversation videoConversation2 = chat.videoConversation;
                int i9 = videoConversation2.type;
                int i10 = i9 != 1 ? i9 != 2 ? 1 : 3 : 2;
                String str = videoConversation2.mediaCallType;
                if (str != null) {
                    if (str.equals("AUDIO")) {
                        i2 = 1;
                    } else if (str.equals("VIDEO")) {
                        i2 = 2;
                    }
                }
                mx2 mx2VarB = mx2.b();
                mx2VarB.d(chat.videoConversation.conversationId);
                mx2VarB.h(chat.videoConversation.startedAt);
                mx2VarB.e(chat.videoConversation.joinLink);
                mx2VarB.c(chat.videoConversation.approxParticipantCount);
                mx2VarB.g(arrayList);
                mx2VarB.i(i10);
                mx2VarB.f(i2);
                tw2Var.V = mx2VarB.a();
            }
            tw2Var.W = chat.lastOpenPositionTime;
            tw2Var.X = chat.lastOpenPositionOffset;
            tw2Var.Y = chat.lastOpenReadMark;
            tw2Var.Z = (int) chat.lastOpenNewMessages;
            tw2Var.a0 = chat.lastSearchClickTime;
            tw2Var.b0 = chat.lastWriteTime;
            byte[] bArr3 = chat.draft;
            this.a.getClass();
            if (bArr3.length == 0) {
                h1cVar = null;
            } else {
                try {
                    uwd uwdVarA = uwd.a(bArr3);
                    String str2 = uwdVarA.a;
                    Protos.MessageElements messageElements = uwdVarA.e;
                    wx8 wx8Var = new wx8(str2, (messageElements == null || (messageElementArr = messageElements.elements) == null || messageElementArr.length == 0) ? null : dga.a(messageElementArr));
                    long j2 = uwdVarA.f;
                    long j3 = uwdVarA.c;
                    Long lValueOf2 = j3 == 0 ? null : Long.valueOf(j3);
                    long j4 = uwdVarA.b;
                    h1cVar = new h1c(j2, wx8Var, lValueOf2, j4 == 0 ? null : Long.valueOf(j4));
                } catch (Exception e) {
                    gm0.l(kt5.class.getName(), "Can't parse draft", e);
                    h1cVar = null;
                }
            }
            tw2Var.e0 = h1cVar;
            tw2Var.f0 = chat.draftUpdateTime;
            tw2Var.g0 = chat.draftUpdateTimeForSyncLogic;
            Protos.Chat.BotsInfo botsInfo = chat.botsInfo;
            tw2Var.c0 = botsInfo == null ? d11.c : new d11(botsInfo.hasBots, botsInfo.suspendedBot);
            tw2Var.d0 = chat.modified;
            tw2Var.h0 = chat.liveLocationMessageIds;
            tw2Var.i0 = chat.lastMentionMessageId;
            tw2Var.l0 = chat.lastReactedMessageId;
            String str3 = chat.lastReaction;
            if (ch3.r(str3)) {
                tw2Var.m0 = null;
            } else {
                tw2Var.m0 = str3;
            }
            Protos.Chat.PushMessage pushMessage = chat.lastPushMessage;
            if (pushMessage != null) {
                tw2Var.k0 = new hx2(pushMessage.text, pushMessage.time, pushMessage.id);
            }
            tw2Var.p0 = chat.lastFireDelayedErrorTime;
            tw2Var.n0 = chat.lastDelayedUpdateTime;
            tw2Var.q0 = chat.participantSettings;
            tw2Var.r0 = chat.pendingJoinRequestsCount;
            tw2Var.s0 = chat.invitedBy;
            tw2Var.o0 = chat.lastDelayedLoadTime;
            tw2Var.u0 = chat.liveStreamUpdateTime;
            Protos.Chat.LiveStream liveStream = chat.liveStream;
            if (liveStream == null) {
                tw2Var.v0 = null;
            } else {
                Protos.Attaches.Attach attach = liveStream.media;
                tw2Var.v0 = new gj2(chat.liveStream.updateTime, attach != null ? a.c(attach) : null, i3);
            }
            tw2Var.t0 = chat.commentsBlacklistCount;
            return new nx2(tw2Var);
        } catch (InvalidProtocolBufferNanoException e2) {
            qr7.t(e2);
            return null;
        }
    }
}
