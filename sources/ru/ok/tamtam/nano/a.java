package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.a60;
import defpackage.a70;
import defpackage.azg;
import defpackage.b60;
import defpackage.b70;
import defpackage.c30;
import defpackage.c46;
import defpackage.c60;
import defpackage.c61;
import defpackage.c70;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.d;
import defpackage.d60;
import defpackage.d70;
import defpackage.dga;
import defpackage.e60;
import defpackage.e70;
import defpackage.ex2;
import defpackage.f60;
import defpackage.f70;
import defpackage.g60;
import defpackage.h60;
import defpackage.h61;
import defpackage.hke;
import defpackage.i60;
import defpackage.iil;
import defpackage.j60;
import defpackage.j61;
import defpackage.jg8;
import defpackage.jke;
import defpackage.jvj;
import defpackage.k5d;
import defpackage.k60;
import defpackage.kg8;
import defpackage.kke;
import defpackage.kvj;
import defpackage.kzi;
import defpackage.l5d;
import defpackage.l60;
import defpackage.m5d;
import defpackage.m60;
import defpackage.n5d;
import defpackage.n60;
import defpackage.nhb;
import defpackage.ntg;
import defpackage.o5d;
import defpackage.o60;
import defpackage.p60;
import defpackage.p90;
import defpackage.q60;
import defpackage.qr7;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.qvj;
import defpackage.r60;
import defpackage.rw2;
import defpackage.s60;
import defpackage.sia;
import defpackage.sw2;
import defpackage.t60;
import defpackage.u60;
import defpackage.u8b;
import defpackage.v60;
import defpackage.vc9;
import defpackage.vil;
import defpackage.w60;
import defpackage.ww2;
import defpackage.x60;
import defpackage.xyg;
import defpackage.y0e;
import defpackage.y50;
import defpackage.y51;
import defpackage.y60;
import defpackage.yyg;
import defpackage.z50;
import defpackage.z60;
import defpackage.zyg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a = new byte[0];

    static {
        cqk.c = new nhb(22);
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            rw2 rw2VarA = sw2.a();
            rw2VarA.c(adminParticipant.id);
            rw2VarA.e(adminParticipant.permissions);
            rw2VarA.d(adminParticipant.inviterId);
            rw2VarA.b(adminParticipant.alias);
            map2.put(l, rw2VarA.a());
        }
        return map2;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    public static e70 c(Protos.Attaches.Attach attach) {
        y60 y60Var;
        x60 x60Var;
        c60 c60Var;
        o5d o5dVarA;
        long j;
        String str;
        u8b u8bVar;
        n5d n5dVar;
        c60 c60Var2;
        jvj jvjVar;
        List list;
        int iLastIndexOf;
        int i;
        x60 x60Var2;
        x60 x60Var3;
        int i2;
        c60 c60Var3 = new c60();
        c60Var3.j = attach.lastErrorTime;
        float f = attach.progressFloat;
        if (f == 0.0f) {
            f = attach.progress;
        }
        c60Var3.k = f;
        c60Var3.l = attach.localId;
        c60Var3.m = attach.localPath;
        c60Var3.n = attach.isDeleted;
        c60Var3.o = attach.totalBytes;
        c60Var3.p = attach.bytesDownloaded;
        c60Var3.u = attach.lastModified;
        c60Var3.z = attach.sensitiveContentUnlocked;
        c60Var3.A = attach.sensitive;
        c60Var3.B = ch3.r(attach.appVersion) ? null : attach.appVersion;
        switch (attach.type) {
            case 1:
                y60Var = y60.b;
                break;
            case 2:
                y60Var = y60.c;
                break;
            case 3:
                y60Var = y60.d;
                break;
            case 4:
                y60Var = y60.e;
                break;
            case 5:
                y60Var = y60.f;
                break;
            case 6:
                y60Var = y60.g;
                break;
            case 7:
                y60Var = y60.i;
                break;
            case 8:
                y60Var = y60.h;
                break;
            case 9:
            case 13:
            case 15:
            default:
                y60Var = y60.a;
                break;
            case 10:
                y60Var = y60.j;
                break;
            case 11:
                y60Var = y60.k;
                break;
            case 12:
                y60Var = y60.l;
                break;
            case 14:
                y60Var = y60.m;
                break;
            case 16:
                y60Var = y60.n;
                break;
            case 17:
                y60Var = y60.o;
                break;
            case 18:
                y60Var = y60.p;
                break;
        }
        c60Var3.a = y60Var;
        int i3 = attach.status;
        u60 u60Var = u60.a;
        int i4 = 3;
        if (i3 != 0) {
            if (i3 == 1) {
                u60Var = u60.b;
            } else if (i3 == 2) {
                u60Var = u60.c;
            } else if (i3 == 3) {
                u60Var = u60.d;
            } else if (i3 == 4) {
                u60Var = u60.e;
            }
        }
        c60Var3.i = u60Var;
        Protos.Attaches.Attach.Photo photo = attach.photo;
        if (photo != null) {
            c60Var3.b = n(photo);
        }
        Protos.Attaches.Attach.Control control = attach.control;
        if (control != null) {
            int i5 = h60.p;
            g60 g60Var = new g60();
            switch (control.event) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
                case 12:
                    i2 = 12;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            g60Var.a = i2;
            g60Var.b = control.userId;
            g60Var.c = p90.h(control.userIds);
            Protos.Attaches.Attach.Control control2 = attach.control;
            g60Var.d = control2.title;
            g60Var.e = control2.iconToken;
            g60Var.f = control2.url;
            g60Var.g = control2.fullUrl;
            g60Var.k = control2.showHistory;
            int i6 = control2.chatType;
            if (i6 == 1) {
                g60Var.l = 3;
            } else if (i6 == 2) {
                g60Var.l = 4;
            } else if (i6 == 3) {
                g60Var.l = 5;
            } else if (i6 != 4) {
                g60Var.l = 1;
            } else {
                g60Var.l = 2;
            }
            Protos.Attaches.Attach.Rect rect = control2.crop;
            if (rect != null) {
                g60Var.h = new r60(rect.left, rect.top, rect.right, rect.bottom, 0);
            }
            g60Var.i = control2.message;
            g60Var.j = control2.shortMessage;
            g60Var.m = control2.pinnedMessageId;
            g60Var.n = control2.pinnedMessageServerId;
            g60Var.o = control2.startPayload;
            c60Var3.c = g60Var.a();
        }
        Protos.Attaches.Attach.Video video = attach.video;
        x60 x60Var4 = x60.b;
        x60 x60Var5 = x60.c;
        x60 x60Var6 = x60.e;
        x60 x60Var7 = x60.d;
        x60 x60Var8 = x60.a;
        if (video != null) {
            d70 d70Var = d70.w;
            z60 z60Var = new z60();
            int i7 = video.transcriptionStatus;
            if (i7 == 1) {
                x60Var3 = x60Var4;
                x60Var = x60Var3;
            } else if (i7 != 2) {
                x60Var = x60Var4;
                x60Var3 = i7 != 3 ? i7 != 5 ? x60Var8 : x60Var7 : x60Var6;
            } else {
                x60Var = x60Var4;
                x60Var3 = x60Var5;
            }
            z60Var.a = video.videoId;
            z60Var.s = qt4.a(video.videoType);
            Protos.Attaches.Attach.Video video2 = attach.video;
            z60Var.b = video2.duration;
            z60Var.c = video2.size;
            z60Var.d = video2.thumbnail;
            z60Var.e = video2.width;
            z60Var.f = video2.height;
            z60Var.g = video2.live;
            z60Var.h = video2.embedUrl;
            z60Var.i = video2.externalSiteName;
            z60Var.j = video2.previewData;
            z60Var.k = video2.thumbhashData;
            z60Var.l = video2.startTime;
            z60Var.n = video2.token;
            z60Var.p = video2.ignoreAutoplay;
            z60Var.q = video2.audioTrackIndex;
            z60Var.r = video2.audioGroupIndex;
            z60Var.t = video2.wave;
            z60Var.u = video2.transcription;
            z60Var.v = x60Var3;
            if (video2.convertOptions != null) {
                a70 a70VarF = b70.f();
                a70VarF.f(attach.video.convertOptions.startTrimPosition);
                a70VarF.b(attach.video.convertOptions.endTrimPosition);
                a70VarF.d(attach.video.convertOptions.mute);
                String[] strArr = attach.video.convertOptions.fragmentsPaths;
                if (strArr != null && strArr.length > 0) {
                    a70VarF.c(Arrays.asList(strArr));
                }
                if (attach.video.convertOptions.quality != null) {
                    a70VarF.e(y0e.values()[attach.video.convertOptions.quality.ordinal]);
                } else {
                    a70VarF.e(y0e.values()[attach.video.convertOptions.qualityValue]);
                }
                z60Var.m = a70VarF.a();
            }
            Protos.Attaches.Attach.Video.VideoCollage videoCollage = attach.video.videoCollage;
            if (videoCollage != null) {
                z60Var.o = new c70(videoCollage.url, videoCollage.frequency, videoCollage.height, videoCollage.width, videoCollage.count);
            }
            c60Var3.d = new d70(z60Var);
        } else {
            x60Var = x60Var4;
        }
        Protos.Attaches.Attach.Audio audio = attach.audio;
        if (audio != null) {
            int i8 = audio.transcriptionStatus;
            if (i8 == 1) {
                x60Var2 = x60Var;
            } else if (i8 == 2) {
                x60Var2 = x60Var5;
            } else if (i8 != 3) {
                x60Var2 = i8 != 5 ? x60Var8 : x60Var7;
            } else {
                x60Var2 = x60Var6;
            }
            b60 b60Var = b60.j;
            a60 a60Var = new a60();
            a60Var.a = audio.audioId;
            a60Var.b = audio.url;
            a60Var.c = audio.duration;
            a60Var.g = audio.startTime;
            a60Var.h = audio.lastStartTimeUpdateTimestamp;
            a60Var.d = audio.wave;
            a60Var.f = audio.transcription;
            a60Var.i = x60Var2;
            a60Var.e = audio.token;
            c60Var3.e = new b60(a60Var);
        }
        if (attach.sticker != null) {
            v60 v60VarQ = w60.q();
            v60VarQ.k(attach.sticker.stickerId);
            v60VarQ.o(attach.sticker.url);
            v60VarQ.q(attach.sticker.width);
            v60VarQ.e(attach.sticker.height);
            v60VarQ.g(attach.sticker.mp4Url);
            v60VarQ.d(attach.sticker.firstUrl);
            String[] strArr2 = attach.sticker.tags;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr2);
            v60VarQ.m(arrayList);
            v60VarQ.h(attach.sticker.previewUrl);
            v60VarQ.n(attach.sticker.updateTime);
            v60VarQ.i(attach.sticker.setId);
            v60VarQ.f(attach.sticker.lottieUrl);
            v60VarQ.p(attach.sticker.videoUrl);
            v60VarQ.c(attach.sticker.audio);
            int i9 = attach.sticker.stickerType;
            if (i9 == 1) {
                v60VarQ.l(2);
            } else if (i9 == 2) {
                v60VarQ.l(3);
            } else if (i9 != 4) {
                v60VarQ.l(1);
            } else {
                v60VarQ.l(4);
            }
            int i10 = attach.sticker.authorType;
            if (i10 == 1) {
                v60VarQ.j(2);
            } else if (i10 != 2) {
                v60VarQ.j(1);
            } else {
                v60VarQ.j(3);
            }
            c60Var3.f = v60VarQ.b();
        }
        if (attach.share != null) {
            s60 s60VarM = t60.m();
            s60VarM.p(attach.share.shareId);
            s60VarM.s(attach.share.url);
            s60VarM.r(attach.share.title);
            s60VarM.h(attach.share.description);
            s60VarM.k(attach.share.host);
            Protos.Attaches.Attach.Photo photo2 = attach.share.image;
            if (photo2 != null) {
                s60VarM.l(n(photo2));
            }
            Protos.Attaches.Attach attach2 = attach.share.media;
            if (attach2 != null) {
                s60VarM.n(c(attach2));
            }
            s60VarM.g(attach.share.deleted);
            s60VarM.e(attach.share.contentLevel);
            c60Var3.g = s60VarM.a();
        }
        Protos.Attaches.Attach.App app = attach.app;
        if (app != null) {
            y50 y50Var = new y50();
            y50Var.b(app.appId);
            y50Var.f(attach.app.name);
            y50Var.e(attach.app.message);
            y50Var.d(attach.app.icon);
            y50Var.h(attach.app.timeout);
            y50Var.g(attach.app.state);
            y50Var.c(attach.app.appState);
            c60Var3.h = y50Var.a();
        }
        Protos.Attaches.Attach.Call call = attach.call;
        if (call != null) {
            int i11 = call.callType;
            int i12 = i11 != 1 ? i11 != 2 ? 1 : 3 : 2;
            int i13 = call.hangupType;
            if (i13 == 1) {
                i = 2;
            } else if (i13 == 2) {
                i = 3;
            } else if (i13 != 3) {
                i = i13 != 4 ? 1 : 5;
            } else {
                i = 4;
            }
            long j2 = call.durationLong;
            if (j2 == 0) {
                j2 = call.duration;
            }
            d60 d60Var = new d60();
            d60Var.e(call.conversationId);
            d60Var.h(attach.call.joinLink);
            d60Var.c(i12);
            d60Var.g(i);
            d60Var.f(j2);
            d60Var.d(p90.h(attach.call.contactIds));
            c60Var3.q = d60Var.a();
        }
        Protos.Attaches.Attach.File file = attach.file;
        if (file != null) {
            i60 i60Var = new i60();
            i60Var.a = file.fileId;
            i60Var.b = file.size;
            String strSubstring = file.name;
            if (!ch3.r(strSubstring) && (iLastIndexOf = strSubstring.lastIndexOf("/")) != -1) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
            i60Var.c = strSubstring;
            Protos.Attaches.Attach attach3 = attach.file.preview;
            i60Var.d = attach3 != null ? c(attach3) : null;
            i60Var.e = attach.file.token;
            c60Var3.r = new j60(i60Var);
        }
        Protos.Attaches.Attach.Contact contact = attach.contact;
        if (contact != null) {
            c30 c30Var = new c30();
            c30Var.i(contact.vcfBody);
            c30Var.b(attach.contact.contactId);
            c30Var.f(attach.contact.name);
            c30Var.g(attach.contact.phone);
            c30Var.h(attach.contact.photoUrl);
            c30Var.e(attach.contact.localPhotoUrl);
            c30Var.c(attach.contact.firstName);
            c30Var.d(attach.contact.lastName);
            c60Var3.s = c30Var.a();
        }
        Protos.Attaches.Attach.Present present = attach.present;
        if (present != null) {
            int i14 = present.status;
            if (i14 == 1) {
                i4 = 2;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    i4 = 4;
                } else if (i14 != 4) {
                    i4 = i14 != 5 ? 1 : 5;
                } else {
                    i4 = 6;
                }
            }
            p60 p60Var = new p60();
            p60Var.i(present.presentId);
            p60Var.h(attach.present.metadataId);
            p60Var.l(attach.present.senderId);
            p60Var.k(attach.present.receiverId);
            p60Var.m(i4);
            p60Var.j(attach.present.presentJson);
            c60Var3.t = p60Var.a();
        }
        Protos.Attaches.Attach.Location location = attach.location;
        if (location != null) {
            k60 k60Var = new k60();
            k60Var.g(new vc9(location.latitude, location.longitude, location.altitude, location.accuracy, location.bearing, location.speed));
            k60Var.f(location.livePeriod);
            k60Var.h(location.startTime);
            k60Var.d(location.endTime);
            Protos.Attaches.LocationInfo[] locationInfoArr = location.track;
            if (locationInfoArr == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(locationInfoArr.length);
                int i15 = 0;
                for (int length = locationInfoArr.length; i15 < length; length = length) {
                    Protos.Attaches.LocationInfo locationInfo = locationInfoArr[i15];
                    arrayList2.add(new m60(new vc9(locationInfo.latitude, locationInfo.longitude, locationInfo.altitude, locationInfo.accuracy, locationInfo.bearing, locationInfo.speed), locationInfo.time));
                    i15++;
                }
                list = arrayList2;
            }
            k60Var.i(list);
            k60Var.c(location.deviceId);
            k60Var.j(location.zoom);
            k60Var.b(location.corrupted);
            Protos.Attaches.LocationInfo locationInfo2 = location.lastLocation;
            if (locationInfo2 != null) {
                k60Var.e(new m60(new vc9(locationInfo2.latitude, locationInfo2.longitude, locationInfo2.altitude, locationInfo2.accuracy, locationInfo2.bearing, locationInfo2.speed), locationInfo2.time));
            }
            c60Var3.v = k60Var.a();
        }
        Protos.Attaches.Attach.Widget widget = attach.widget;
        if (widget != null) {
            Protos.Attaches.Attach.Widget.Content[] contentArr = widget.contents;
            ArrayList arrayList3 = new ArrayList(contentArr.length);
            for (Protos.Attaches.Attach.Widget.Content content : contentArr) {
                switch (content.type) {
                    case 1:
                        jvjVar = jvj.a;
                        break;
                    case 2:
                        jvjVar = jvj.b;
                        break;
                    case 3:
                        jvjVar = jvj.c;
                        break;
                    case 4:
                        jvjVar = jvj.d;
                        break;
                    case 5:
                        jvjVar = jvj.e;
                        break;
                    case 6:
                        jvjVar = jvj.f;
                        break;
                    default:
                        jvjVar = null;
                        break;
                }
                if (jvjVar != null) {
                    String str2 = content.text;
                    Protos.MessageElement[] messageElementArr = content.elements;
                    kzi kziVar = !str2.isEmpty() ? new kzi(str2, (messageElementArr == null || messageElementArr.length <= 0) ? null : dga.a(messageElementArr)) : null;
                    Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = content.keyboard;
                    kg8 kg8VarK = inlineKeyboard != null ? k(inlineKeyboard) : null;
                    d dVar = !content.iconUrl.isEmpty() ? new d(content.iconUrl, content.iconWidth, content.iconHeight) : null;
                    if (kziVar != null || kg8VarK != null || dVar != null) {
                        arrayList3.add(new kvj(jvjVar, kziVar, kg8VarK, dVar));
                    }
                }
            }
            c60Var3.w = arrayList3.isEmpty() ? null : new qvj(arrayList3);
        }
        Protos.Attaches.Attach.Poll poll = attach.poll;
        if (poll != null) {
            long j3 = poll.pollId;
            String str3 = poll.title;
            Protos.Attaches.Attach.Poll.Answer[] answerArr = poll.answers;
            u8b u8bVar2 = new u8b(answerArr.length);
            for (Protos.Attaches.Attach.Poll.Answer answer : answerArr) {
                String str4 = answer.text;
                if (ch3.s(str4)) {
                    u8bVar2.b(new k5d(str4, answer.answerId));
                }
            }
            if (ch3.r(str3) || u8bVar2.i()) {
                c60Var = c60Var3;
                o5dVarA = null;
            } else {
                Protos.Attaches.Attach.Poll.State state = poll.state;
                if (state == null) {
                    c60Var = c60Var3;
                    j = j3;
                    str = str3;
                    u8bVar = u8bVar2;
                    n5dVar = null;
                } else {
                    int i16 = state.total;
                    Protos.Attaches.Attach.Poll.Result[] resultArr = state.result;
                    u8b u8bVar3 = resultArr != null ? new u8b(resultArr.length) : new u8b(0);
                    if (resultArr != null && resultArr.length > 0) {
                        int i17 = 0;
                        while (i17 < resultArr.length) {
                            Protos.Attaches.Attach.Poll.Result result = resultArr[i17];
                            int i18 = result.answerId;
                            int i19 = result.voteCount;
                            Protos.Attaches.Attach.Poll.AnswerStats[] answerStatsArr = result.votes;
                            long j4 = j3;
                            u8b u8bVar4 = answerStatsArr != null ? new u8b(answerStatsArr.length) : new u8b(0);
                            if (answerStatsArr == null || answerStatsArr.length <= 0) {
                                c60Var2 = c60Var3;
                            } else {
                                int i20 = 0;
                                while (i20 < answerStatsArr.length) {
                                    Protos.Attaches.Attach.Poll.AnswerStats answerStats = answerStatsArr[i20];
                                    c60 c60Var4 = c60Var3;
                                    long j5 = answerStats.userId;
                                    int i21 = i20;
                                    long j6 = answerStats.timestamp;
                                    if (j5 != r9 && j6 != 0) {
                                        u8bVar4.b(new l5d(j5, j6));
                                    }
                                    i20 = i21 + 1;
                                    c60Var3 = c60Var4;
                                    u8bVar2 = u8bVar2;
                                }
                                c60Var2 = c60Var3;
                            }
                            u8b u8bVar5 = u8bVar2;
                            u8bVar3.b(vil.a(i18, i19, u8bVar4, result.rate, result.options));
                            i17++;
                            j3 = j4;
                            str3 = str3;
                            c60Var3 = c60Var2;
                            u8bVar2 = u8bVar5;
                        }
                    }
                    c60Var = c60Var3;
                    j = j3;
                    str = str3;
                    u8bVar = u8bVar2;
                    long[] jArr = state.voterPreviewIds;
                    LinkedHashSet linkedHashSet = jArr.length > 0 ? new LinkedHashSet(jArr.length) : null;
                    if (linkedHashSet != null && jArr.length > 0) {
                        for (long j7 : jArr) {
                            linkedHashSet.add(Long.valueOf(j7));
                        }
                    }
                    n5dVar = new n5d(i16, u8bVar3, linkedHashSet);
                }
                o5dVarA = iil.a(j, str, u8bVar, poll.settings, n5dVar, poll.version);
            }
            c60Var3 = c60Var;
            c60Var3.x = o5dVarA;
        }
        Protos.Attaches.Attach.StoriesReply storiesReply = attach.storiesReply;
        if (storiesReply != null) {
            long j8 = storiesReply.storyId;
            Protos.Attaches.Attach.StoriesReply.StoryOwner storyOwner = storiesReply.storyOwner;
            long j9 = storyOwner.id;
            int i22 = storyOwner.type;
            c60Var3.C = new ntg(i22 != 1 ? i22 != 2 ? new zyg(j9) : new xyg(j9) : new yyg(j9), j8, storiesReply.previewUrl.isEmpty() ? null : storiesReply.previewUrl, storiesReply.expirationTime);
        }
        int i23 = attach.processingOnServerStatus;
        c60Var3.y = i23 != 1 ? i23 != 2 ? q60.a : q60.c : q60.b;
        return c60Var3.a();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    public static Protos.Attaches.Attach d(e70 e70Var) {
        int i;
        int i2;
        int i3;
        int i4;
        Protos.Attaches.Attach.Poll.Result[] resultArr;
        Protos.Attaches.Attach.Poll.State state;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Protos.Attaches.Attach attach = new Protos.Attaches.Attach();
        long j = e70Var.r;
        l60 l60Var = e70Var.m;
        w60 w60Var = e70Var.f;
        p60 p60Var = e70Var.l;
        j60 j60Var = e70Var.j;
        b60 b60Var = e70Var.e;
        e60 e60Var = e70Var.i;
        f60 f60Var = e70Var.k;
        d70 d70Var = e70Var.d;
        h60 h60Var = e70Var.c;
        t60 t60Var = e70Var.g;
        z50 z50Var = e70Var.h;
        attach.lastErrorTime = j;
        attach.progressFloat = e70Var.s;
        attach.progress = 0;
        String string = e70Var.t;
        if (ch3.r(string)) {
            string = UUID.randomUUID().toString();
        }
        attach.localId = string;
        String str = e70Var.u;
        if (str == null) {
            str = "";
        }
        attach.localPath = str;
        attach.isDeleted = e70Var.v;
        attach.totalBytes = e70Var.w;
        attach.bytesDownloaded = e70Var.x;
        attach.lastModified = e70Var.y;
        attach.sensitiveContentUnlocked = e70Var.A;
        attach.sensitive = e70Var.B;
        String str2 = e70Var.C;
        if (str2 == null) {
            str2 = "";
        }
        attach.appVersion = str2;
        switch (e70Var.a.ordinal()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 10;
                break;
            case 10:
                i = 11;
                break;
            case 11:
                i = 12;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 16;
                break;
            case 14:
                i = 17;
                break;
            case 15:
                i = 18;
                break;
            default:
                i = 0;
                break;
        }
        attach.type = i;
        int iOrdinal = e70Var.q.ordinal();
        if (iOrdinal == 0) {
            i2 = 0;
        } else if (iOrdinal == 1) {
            i2 = 1;
        } else if (iOrdinal == 2) {
            i2 = 2;
        } else if (iOrdinal == 3) {
            i2 = 3;
        } else if (iOrdinal != 4) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        attach.status = i2;
        if (e70Var.e()) {
            attach.photo = o(e70Var.b);
        }
        if (h60Var != null) {
            r60 r60Var = h60Var.h;
            Protos.Attaches.Attach.Control control = new Protos.Attaches.Attach.Control();
            switch (qt4.D(h60Var.a)) {
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 3;
                    break;
                case 4:
                    i11 = 4;
                    break;
                case 5:
                    i11 = 5;
                    break;
                case 6:
                    i11 = 6;
                    break;
                case 7:
                    i11 = 8;
                    break;
                case 8:
                    i11 = 9;
                    break;
                case 9:
                    i11 = 10;
                    break;
                case 10:
                    i11 = 11;
                    break;
                case 11:
                    i11 = 12;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            control.event = i11;
            control.userId = h60Var.b;
            control.userIds = p90.i(h60Var.c);
            String str3 = h60Var.d;
            if (str3 == null) {
                str3 = "";
            }
            control.title = str3;
            String str4 = h60Var.e;
            if (str4 == null) {
                str4 = "";
            }
            control.iconToken = str4;
            String str5 = h60Var.f;
            if (str5 == null) {
                str5 = "";
            }
            control.url = str5;
            String str6 = h60Var.g;
            if (str6 == null) {
                str6 = "";
            }
            control.fullUrl = str6;
            if (r60Var != null) {
                Protos.Attaches.Attach.Rect rect = new Protos.Attaches.Attach.Rect();
                control.crop = rect;
                rect.left = r60Var.b();
                control.crop.top = r60Var.d();
                control.crop.right = r60Var.c();
                control.crop.bottom = r60Var.a();
            }
            String str7 = h60Var.i;
            if (str7 == null) {
                str7 = "";
            }
            control.message = str7;
            String str8 = h60Var.j;
            if (str8 == null) {
                str8 = "";
            }
            control.shortMessage = str8;
            control.showHistory = h60Var.k;
            int i12 = h60Var.l;
            if (i12 != 0) {
                int iD = qt4.D(i12);
                if (iD == 1) {
                    control.chatType = 4;
                } else if (iD == 2) {
                    control.chatType = 1;
                } else if (iD == 3) {
                    control.chatType = 2;
                } else if (iD != 4) {
                    control.chatType = 0;
                } else {
                    control.chatType = 3;
                }
            }
            control.pinnedMessageId = h60Var.m;
            control.pinnedMessageServerId = h60Var.n;
            String str9 = h60Var.o;
            if (str9 == null) {
                str9 = "";
            }
            control.startPayload = str9;
            attach.control = control;
        }
        if (e70Var.h()) {
            Protos.Attaches.Attach.Video video = new Protos.Attaches.Attach.Video();
            long j2 = d70Var.a;
            c70 c70Var = d70Var.p;
            b70 b70Var = d70Var.n;
            video.videoId = j2;
            video.videoType = qt4.D(d70Var.b);
            video.duration = (int) d70Var.c;
            video.size = d70Var.d;
            String str10 = d70Var.e;
            if (str10 == null) {
                str10 = "";
            }
            video.thumbnail = str10;
            video.width = d70Var.f;
            video.height = d70Var.g;
            video.live = d70Var.h;
            String str11 = d70Var.i;
            if (str11 == null) {
                str11 = "";
            }
            video.embedUrl = str11;
            String str12 = d70Var.j;
            if (str12 == null) {
                str12 = "";
            }
            video.externalSiteName = str12;
            byte[] bArr = d70Var.k;
            if (bArr != null) {
                video.previewData = bArr;
            }
            byte[] bArr2 = d70Var.l;
            if (bArr2 != null) {
                video.thumbhashData = bArr2;
            }
            video.startTime = d70Var.m;
            String str13 = d70Var.o;
            if (str13 == null) {
                str13 = "";
            }
            video.token = str13;
            video.ignoreAutoplay = d70Var.q;
            video.audioTrackIndex = d70Var.r;
            video.audioGroupIndex = d70Var.s;
            if (b70Var != null) {
                Protos.Attaches.Attach.Video.ConvertOptions convertOptions = new Protos.Attaches.Attach.Video.ConvertOptions();
                convertOptions.qualityValue = b70Var.c().b;
                convertOptions.startTrimPosition = b70Var.d();
                convertOptions.endTrimPosition = b70Var.a();
                List listB = b70Var.b();
                if (listB != null && !listB.isEmpty()) {
                    convertOptions.fragmentsPaths = (String[]) listB.toArray(new String[0]);
                }
                convertOptions.mute = b70Var.e();
                video.convertOptions = convertOptions;
            } else {
                p60Var = p60Var;
            }
            if (c70Var != null) {
                Protos.Attaches.Attach.Video.VideoCollage videoCollage = new Protos.Attaches.Attach.Video.VideoCollage();
                videoCollage.url = (String) c70Var.e;
                videoCollage.frequency = c70Var.a;
                videoCollage.height = c70Var.b;
                videoCollage.width = c70Var.c;
                videoCollage.count = c70Var.d;
                video.videoCollage = videoCollage;
            }
            byte[] bArr3 = d70Var.t;
            if (bArr3 != null) {
                video.wave = bArr3;
            }
            String str14 = d70Var.u;
            if (str14 == null) {
                str14 = "";
            }
            video.transcription = str14;
            x60 x60Var = d70Var.v;
            if (x60Var != null) {
                video.transcriptionStatus = r(x60Var);
            }
            attach.video = video;
        } else {
            p60Var = p60Var;
        }
        if (e70Var.a()) {
            Protos.Attaches.Attach.Audio audio = new Protos.Attaches.Attach.Audio();
            audio.audioId = b60Var.a;
            String str15 = b60Var.b;
            if (str15 == null) {
                str15 = "";
            }
            audio.url = str15;
            audio.duration = b60Var.c;
            byte[] bArr4 = b60Var.d;
            if (bArr4 != null) {
                audio.wave = bArr4;
            }
            String str16 = b60Var.f;
            if (str16 != null) {
                audio.transcription = str16;
            }
            x60 x60Var2 = b60Var.i;
            if (x60Var2 != null) {
                audio.transcriptionStatus = r(x60Var2);
            }
            String str17 = b60Var.e;
            if (str17 == null) {
                str17 = "";
            }
            audio.token = str17;
            audio.startTime = b60Var.g;
            audio.lastStartTimeUpdateTimestamp = b60Var.h;
            attach.audio = audio;
        }
        if (w60Var != 0) {
            Protos.Attaches.Attach.Sticker sticker = new Protos.Attaches.Attach.Sticker();
            sticker.stickerId = w60Var.i();
            String strM = w60Var.m();
            if (strM == null) {
                strM = "";
            }
            sticker.url = strM;
            sticker.width = w60Var.o();
            sticker.height = w60Var.b();
            String strD = w60Var.d();
            if (strD == null) {
                strD = "";
            }
            sticker.mp4Url = strD;
            String strA = w60Var.a();
            if (strA == null) {
                strA = "";
            }
            sticker.firstUrl = strA;
            List listK = w60Var.k();
            sticker.tags = (String[]) listK.toArray(new String[listK.size()]);
            String strE = w60Var.e();
            if (strE == null) {
                strE = "";
            }
            sticker.previewUrl = strE;
            sticker.updateTime = w60Var.l();
            int iJ = w60Var.j();
            if (iJ != 0) {
                int iD2 = qt4.D(iJ);
                if (iD2 == 1) {
                    i10 = 1;
                } else if (iD2 != 2) {
                    i10 = iD2 != 3 ? 0 : 4;
                } else {
                    i10 = 2;
                }
                sticker.stickerType = i10;
            }
            sticker.setId = w60Var.g();
            String strC = w60Var.c();
            if (strC == null) {
                strC = "";
            }
            sticker.lottieUrl = strC;
            sticker.audio = w60Var.p();
            int iH = w60Var.h();
            if (iH != 0) {
                int iD3 = qt4.D(iH);
                sticker.authorType = iD3 != 1 ? iD3 != 2 ? 0 : 2 : 1;
            }
            String strN = w60Var.n();
            if (strN == null) {
                strN = "";
            }
            sticker.videoUrl = strN;
            attach.sticker = sticker;
        }
        if (e70Var.g()) {
            Protos.Attaches.Attach.Share share = new Protos.Attaches.Attach.Share();
            share.shareId = t60Var.f();
            String strH = t60Var.h();
            if (strH == null) {
                strH = "";
            }
            share.url = strH;
            String strG = t60Var.g();
            if (strG == null) {
                strG = "";
            }
            share.title = strG;
            String strA2 = t60Var.a();
            if (strA2 == null) {
                strA2 = "";
            }
            share.description = strA2;
            String strC2 = t60Var.c();
            if (strC2 == null) {
                strC2 = "";
            }
            share.host = strC2;
            if (t60Var.d() != null) {
                share.image = o(t60Var.d());
            }
            if (t60Var.e() != null) {
                share.media = d(t60Var.e());
            }
            share.deleted = t60Var.l();
            share.contentLevel = t60Var.k();
            attach.share = share;
        }
        if (z50Var != null) {
            Protos.Attaches.Attach.App app = new Protos.Attaches.Attach.App();
            app.appId = z50Var.a();
            if (z50Var.e() != null) {
                app.name = z50Var.e();
            }
            if (z50Var.c() != null) {
                app.icon = z50Var.c();
            }
            if (z50Var.d() != null) {
                app.message = z50Var.d();
            }
            app.state = z50Var.f();
            app.timeout = z50Var.g();
            if (z50Var.b() != null) {
                app.appState = z50Var.b();
            }
            attach.app = app;
        }
        if (e60Var != null) {
            Protos.Attaches.Attach.Call call = new Protos.Attaches.Attach.Call();
            call.conversationId = e60Var.c();
            int iA = e60Var.a();
            if (iA != 0) {
                int iD4 = qt4.D(iA);
                i8 = 1;
                if (iD4 != 1) {
                    i9 = 2;
                    if (iD4 != 2) {
                        i7 = 0;
                        call.callType = 0;
                    } else {
                        i7 = 0;
                        call.callType = 2;
                    }
                } else {
                    i7 = 0;
                    i9 = 2;
                    call.callType = 1;
                }
            } else {
                i7 = 0;
                i8 = 1;
                i9 = 2;
                call.callType = 0;
            }
            int iE = e60Var.e();
            if (iE != 0) {
                int iD5 = qt4.D(iE);
                if (iD5 == i8) {
                    call.hangupType = i8;
                } else if (iD5 == i9) {
                    call.hangupType = i9;
                } else if (iD5 == 3) {
                    call.hangupType = 3;
                } else if (iD5 != 4) {
                    call.hangupType = i7;
                } else {
                    call.hangupType = 4;
                }
            } else {
                call.hangupType = i7;
            }
            call.durationLong = e60Var.d();
            call.contactIds = p90.i(e60Var.b());
            String strF = e60Var.f();
            if (strF == null) {
                strF = "";
            }
            call.joinLink = strF;
            attach.call = call;
        }
        if (e70Var.c()) {
            Protos.Attaches.Attach.File file = new Protos.Attaches.Attach.File();
            file.fileId = j60Var.a;
            file.size = j60Var.b;
            String str18 = j60Var.c;
            if (str18 == null) {
                str18 = "";
            }
            file.name = str18;
            e70 e70Var2 = j60Var.d;
            if (e70Var2 != null) {
                file.preview = d(e70Var2);
            }
            String str19 = j60Var.e;
            if (str19 == null) {
                str19 = "";
            }
            file.token = str19;
            attach.file = file;
        }
        if (e70Var.b()) {
            Protos.Attaches.Attach.Contact contact = new Protos.Attaches.Attach.Contact();
            String strH2 = f60Var.h();
            if (strH2 == null) {
                strH2 = "";
            }
            contact.vcfBody = strH2;
            contact.contactId = f60Var.a();
            String strE2 = f60Var.e();
            if (strE2 == null) {
                strE2 = "";
            }
            contact.name = strE2;
            String strF2 = f60Var.f();
            if (strF2 == null) {
                strF2 = "";
            }
            contact.phone = strF2;
            String strG2 = f60Var.g();
            if (strG2 == null) {
                strG2 = "";
            }
            contact.photoUrl = strG2;
            String strD2 = f60Var.d();
            if (strD2 == null) {
                strD2 = "";
            }
            contact.localPhotoUrl = strD2;
            String strB = f60Var.b();
            if (strB == null) {
                strB = "";
            }
            contact.firstName = strB;
            String strC3 = f60Var.c();
            if (strC3 == null) {
                strC3 = "";
            }
            contact.lastName = strC3;
            attach.contact = contact;
        }
        if (p60Var != null) {
            Protos.Attaches.Attach.Present present = new Protos.Attaches.Attach.Present();
            present.presentId = p60Var.c();
            present.metadataId = p60Var.b();
            present.senderId = p60Var.f();
            present.receiverId = p60Var.e();
            int iD6 = qt4.D(p60Var.g());
            if (iD6 == 1) {
                i3 = 5;
                i6 = 1;
            } else if (iD6 == 2) {
                i3 = 5;
                i6 = 2;
            } else if (iD6 == 3) {
                i3 = 5;
                i6 = 3;
            } else if (iD6 != 4) {
                i3 = 5;
                i6 = iD6 != 5 ? 0 : 4;
            } else {
                i3 = 5;
                i6 = 5;
            }
            present.status = i6;
            String strD3 = p60Var.d();
            if (strD3 == null) {
                strD3 = "";
            }
            present.presentJson = strD3;
            attach.present = present;
        } else {
            i3 = 5;
        }
        if (l60Var != 0) {
            Protos.Attaches.Attach.Location location = new Protos.Attaches.Attach.Location();
            vc9 vc9VarE = l60Var.e();
            location.latitude = vc9VarE.a;
            location.longitude = vc9VarE.b;
            location.altitude = vc9VarE.c;
            location.accuracy = vc9VarE.d;
            location.bearing = vc9VarE.e;
            location.speed = vc9VarE.f;
            location.livePeriod = l60Var.d();
            location.startTime = l60Var.f();
            location.endTime = l60Var.b();
            List listG = l60Var.g();
            if (listG != null) {
                Protos.Attaches.LocationInfo[] locationInfoArr = new Protos.Attaches.LocationInfo[listG.size()];
                for (int i13 = 0; i13 < listG.size(); i13++) {
                    locationInfoArr[i13] = m((m60) listG.get(i13));
                }
                location.track = locationInfoArr;
            }
            String strA3 = l60Var.a();
            if (strA3 == null) {
                strA3 = "";
            }
            location.deviceId = strA3;
            location.zoom = l60Var.h();
            location.corrupted = l60Var.i();
            m60 m60VarC = l60Var.c();
            if (m60VarC != null) {
                location.lastLocation = m(m60VarC);
            }
            attach.location = location;
        }
        qvj qvjVar = e70Var.n;
        if (qvjVar != null) {
            ArrayList arrayList = (ArrayList) qvjVar.a();
            Protos.Attaches.Attach.Widget.Content[] contentArr = new Protos.Attaches.Attach.Widget.Content[arrayList.size()];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                kvj kvjVar = (kvj) arrayList.get(i14);
                int iOrdinal2 = kvjVar.e().ordinal();
                if (iOrdinal2 == 0) {
                    i5 = 1;
                } else if (iOrdinal2 == 1) {
                    i5 = 2;
                } else if (iOrdinal2 == 2) {
                    i5 = 3;
                } else if (iOrdinal2 == 3) {
                    i5 = 4;
                } else if (iOrdinal2 != 4) {
                    i5 = iOrdinal2 != 6 ? 0 : 6;
                } else {
                    i5 = i3;
                }
                if (i5 != 0) {
                    Protos.Attaches.Attach.Widget.Content content = new Protos.Attaches.Attach.Widget.Content();
                    content.type = i5;
                    content.text = kvjVar.d();
                    List listA = kvjVar.a();
                    if (!listA.isEmpty()) {
                        content.elements = dga.c(listA).elements;
                    }
                    kg8 kg8VarC = kvjVar.c();
                    if (kvjVar.f() && kg8VarC != null) {
                        content.keyboard = l(kg8VarC);
                    }
                    d dVarB = kvjVar.b();
                    if (dVarB != null) {
                        String strB2 = dVarB.b();
                        if (strB2 == null) {
                            strB2 = "";
                        }
                        content.iconUrl = strB2;
                        content.iconWidth = dVarB.c();
                        content.iconHeight = dVarB.a();
                    }
                    contentArr[i14] = content;
                }
            }
            Protos.Attaches.Attach.Widget widget = new Protos.Attaches.Attach.Widget();
            widget.contents = contentArr;
            attach.widget = widget;
        }
        o5d o5dVar = e70Var.o;
        if (o5dVar != null) {
            Protos.Attaches.Attach.Poll poll = new Protos.Attaches.Attach.Poll();
            poll.pollId = o5dVar.c();
            String strF3 = o5dVar.f();
            if (strF3 == null) {
                strF3 = "";
            }
            poll.title = strF3;
            u8b u8bVarB = o5dVar.b();
            Protos.Attaches.Attach.Poll.Answer[] answerArr = new Protos.Attaches.Attach.Poll.Answer[u8bVarB.b];
            for (int i15 = 0; i15 < u8bVarB.b; i15++) {
                k5d k5dVar = (k5d) u8bVarB.g(i15);
                String strB3 = k5dVar.b();
                if (!ch3.r(strB3)) {
                    Protos.Attaches.Attach.Poll.Answer answer = new Protos.Attaches.Attach.Poll.Answer();
                    answer.answerId = k5dVar.a();
                    answer.text = strB3;
                    answerArr[i15] = answer;
                }
            }
            poll.answers = answerArr;
            poll.settings = o5dVar.d();
            poll.version = o5dVar.g();
            n5d n5dVarE = o5dVar.e();
            if (n5dVarE == null) {
                state = null;
            } else {
                Protos.Attaches.Attach.Poll.State state2 = new Protos.Attaches.Attach.Poll.State();
                int iB = n5dVarE.b();
                u8b u8bVarA = n5dVarE.a();
                if (u8bVarA.j()) {
                    resultArr = new Protos.Attaches.Attach.Poll.Result[u8bVarA.b];
                    i4 = 0;
                } else {
                    i4 = 0;
                    resultArr = new Protos.Attaches.Attach.Poll.Result[0];
                }
                int i16 = i4;
                while (i16 < u8bVarA.b) {
                    m5d m5dVar = (m5d) u8bVarA.g(i16);
                    u8b u8bVarF = m5dVar.f();
                    Protos.Attaches.Attach.Poll.AnswerStats[] answerStatsArr = new Protos.Attaches.Attach.Poll.AnswerStats[u8bVarF.b];
                    int i17 = i4;
                    while (i17 < u8bVarF.b) {
                        l5d l5dVar = (l5d) u8bVarF.g(i17);
                        long jB = l5dVar.b();
                        int i18 = i16;
                        long jA = l5dVar.a();
                        Protos.Attaches.Attach.Poll.AnswerStats answerStats = new Protos.Attaches.Attach.Poll.AnswerStats();
                        answerStats.userId = jB;
                        answerStats.timestamp = jA;
                        answerStatsArr[i17] = answerStats;
                        i17++;
                        resultArr = resultArr;
                        i16 = i18;
                        m5dVar = m5dVar;
                    }
                    Protos.Attaches.Attach.Poll.Result[] resultArr2 = resultArr;
                    int i19 = i16;
                    m5d m5dVar2 = m5dVar;
                    Protos.Attaches.Attach.Poll.Result result = new Protos.Attaches.Attach.Poll.Result();
                    result.answerId = m5dVar2.a();
                    result.voteCount = m5dVar2.e();
                    result.rate = m5dVar2.d();
                    result.options = m5dVar2.c();
                    result.votes = answerStatsArr;
                    resultArr2[i19] = result;
                    i16 = i19 + 1;
                    resultArr = resultArr2;
                    i4 = 0;
                }
                Protos.Attaches.Attach.Poll.Result[] resultArr3 = resultArr;
                LinkedHashSet linkedHashSetC = n5dVarE.c();
                if (!p90.D(linkedHashSetC)) {
                    long[] jArr = new long[linkedHashSetC.size()];
                    Iterator it = linkedHashSetC.iterator();
                    int i20 = 0;
                    while (it.hasNext()) {
                        jArr[i20] = ((Long) it.next()).longValue();
                        i20++;
                    }
                    state2.voterPreviewIds = jArr;
                }
                state2.total = iB;
                state2.result = resultArr3;
                state = state2;
            }
            if (state != null) {
                poll.state = state;
            }
            attach.poll = poll;
        }
        ntg ntgVar = e70Var.p;
        if (ntgVar != null) {
            Protos.Attaches.Attach.StoriesReply storiesReply = new Protos.Attaches.Attach.StoriesReply();
            Protos.Attaches.Attach.StoriesReply.StoryOwner storyOwner = new Protos.Attaches.Attach.StoriesReply.StoryOwner();
            long jD = ntgVar.d();
            long jA2 = ntgVar.b().a();
            azg azgVarB = ntgVar.b();
            int i21 = azgVarB instanceof yyg ? 1 : azgVarB instanceof xyg ? 2 : 0;
            long jA3 = ntgVar.a();
            String strC4 = ntgVar.c();
            String str20 = strC4 != null ? strC4 : "";
            storyOwner.id = jA2;
            storyOwner.type = i21;
            storiesReply.storyOwner = storyOwner;
            storiesReply.storyId = jD;
            storiesReply.expirationTime = jA3;
            storiesReply.previewUrl = str20;
            attach.storiesReply = storiesReply;
        }
        int iOrdinal3 = e70Var.z.ordinal();
        attach.processingOnServerStatus = iOrdinal3 != 1 ? iOrdinal3 != 2 ? 0 : 2 : 1;
        return attach;
    }

    public static c46 e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        int i;
        int i2;
        f70 f70Var = new f70();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches.keyboard;
        if (inlineKeyboard2 != null) {
            f70Var.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i3 >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i3];
                if (replyButtons != null) {
                    arrayList.add(new jke());
                    int i4 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i4 < replyButtonArr.length) {
                            Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i4];
                            if (replyButton != null) {
                                jke jkeVar = (jke) arrayList.get(i3);
                                int i5 = replyButton.type;
                                if (i5 == 0) {
                                    i = 1;
                                } else if (i5 == 1) {
                                    i = 2;
                                } else if (i5 != 2) {
                                    i = i5 != 3 ? 5 : 4;
                                } else {
                                    i = 3;
                                }
                                int i6 = replyButton.intent;
                                if (i6 == 0) {
                                    i2 = 1;
                                } else if (i6 != 1) {
                                    i2 = i6 != 2 ? 4 : 3;
                                } else {
                                    i2 = 2;
                                }
                                Protos.Attaches.Attach.Photo photo = replyButton.image;
                                jkeVar.add(new hke(i, i2, replyButton.text, photo != null ? n(photo) : null, replyButton.outgoingMessageId));
                            }
                            i4++;
                        }
                    }
                }
                i3++;
            }
            f70Var.c = new kke(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches.attach) {
            if (f70Var.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                f70Var.a(c(attach));
            } else {
                f70Var.b = k(inlineKeyboard);
            }
        }
        return f70Var.c();
    }

    public static Protos.Attaches f(c46 c46Var) {
        int i;
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) c46Var.a).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i2 = 0; i2 < size; i2++) {
            attachArr[i2] = d(c46Var.h(i2));
        }
        attaches.attach = attachArr;
        kg8 kg8Var = (kg8) c46Var.b;
        if (kg8Var != null) {
            attaches.keyboard = l(kg8Var);
        }
        kke kkeVar = (kke) c46Var.c;
        if (kkeVar != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList<List> arrayList = kkeVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (List<hke> list : arrayList) {
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                for (hke hkeVar : list) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int iD = qt4.D(hkeVar.b);
                    int i3 = 1;
                    if (iD == 0) {
                        i = 0;
                    } else if (iD != 1) {
                        i = iD != 2 ? 3 : 2;
                    } else {
                        i = 1;
                    }
                    replyButton.intent = i;
                    int iD2 = qt4.D(hkeVar.a);
                    if (iD2 == 0) {
                        i3 = 0;
                    } else if (iD2 != 1) {
                        i3 = iD2 != 2 ? 3 : 2;
                    }
                    replyButton.type = i3;
                    String str = hkeVar.c;
                    if (str == null) {
                        str = "";
                    }
                    replyButton.text = str;
                    replyButton.outgoingMessageId = hkeVar.e;
                    o60 o60Var = hkeVar.d;
                    if (o60Var != null) {
                        replyButton.image = o(o60Var);
                    }
                    arrayList3.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList2.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList2.get(i4)).toArray(replyButtonArr);
                replyButtonsArr[i4] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = kkeVar.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static ww2 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        List arrayList = null;
        ex2 ex2VarI = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk chunk2 : chunkArr) {
                ex2 ex2VarI2 = i(chunk2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ex2VarI2);
            }
        }
        if (arrayList == null) {
            arrayList = Collections.EMPTY_LIST;
        }
        return new ww2(ex2VarI, i, j, j2, arrayList);
    }

    public static Protos.Chat.ChatMedia h(ww2 ww2Var) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        long j = ww2Var.c;
        List list = ww2Var.e;
        chatMedia.firstMessageId = j;
        chatMedia.lastMessageId = ww2Var.d;
        chatMedia.totalCount = ww2Var.b;
        ex2 ex2Var = ww2Var.a;
        if (ex2Var != null) {
            chatMedia.chunk = j(ex2Var);
        }
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((ex2) list.get(i));
            }
        }
        return chatMedia;
    }

    public static ex2 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            qv1.u("start time is -1", "Chunk.Builder", "");
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            qv1.u("end time is -1", "Chunk.Builder", "");
        }
        return new ex2(j, j2);
    }

    public static Protos.Chat.Chunk j(ex2 ex2Var) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = ex2Var.a;
        chunk.endTime = ex2Var.b;
        return chunk;
    }

    public static kg8 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        j61 j61Var;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard.buttons;
            if (i >= buttonsArr.length) {
                jg8 jg8Var = new jg8();
                jg8Var.a = arrayList;
                jg8Var.b = inlineKeyboard.callbackId;
                return new kg8(jg8Var);
            }
            Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
            arrayList.add(new h61());
            int i2 = 0;
            while (true) {
                Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                if (i2 < buttonArr.length) {
                    Protos.Attaches.Attach.Button button = buttonArr[i2];
                    h61 h61Var = (h61) arrayList.get(i);
                    switch (button.type) {
                        case 0:
                            j61Var = j61.CALLBACK;
                            break;
                        case 1:
                            j61Var = j61.LINK;
                            break;
                        case 2:
                            j61Var = j61.REQUEST_CONTACT;
                            break;
                        case 3:
                            j61Var = j61.REQUEST_GEO_LOCATION;
                            break;
                        case 4:
                        default:
                            j61Var = j61.UNKNOWN;
                            break;
                        case 5:
                            j61Var = j61.CHAT;
                            break;
                        case 6:
                            j61Var = j61.MESSAGE;
                            break;
                        case 7:
                            j61Var = j61.OPEN_APP;
                            break;
                        case 8:
                            j61Var = j61.CLIPBOARD;
                            break;
                    }
                    int i3 = button.intent;
                    int i4 = 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            i4 = i3 != 2 ? 4 : 3;
                        } else {
                            i4 = 2;
                        }
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    y51 y51Var = new y51(str, j61Var, i4);
                    y51Var.d = str2;
                    y51Var.e = str3;
                    y51Var.h = j;
                    y51Var.f = z;
                    y51Var.g = z2;
                    h61Var.add(new c61(y51Var));
                    i2++;
                }
            }
            i++;
        }
    }

    public static Protos.Attaches.Attach.InlineKeyboard l(kg8 kg8Var) {
        int i;
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
        ArrayList arrayList = kg8Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList2.size()];
                Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                    buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList2.get(i2)).toArray(buttonArr);
                    buttonsArr[i2] = buttons;
                }
                inlineKeyboard.buttons = buttonsArr;
                String str = kg8Var.b;
                inlineKeyboard.callbackId = str != null ? str : "";
                return inlineKeyboard;
            }
            List<c61> list = (List) it.next();
            ArrayList arrayList3 = new ArrayList();
            arrayList2.add(arrayList3);
            for (c61 c61Var : list) {
                Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                int iD = qt4.D(c61Var.c);
                int i3 = 1;
                if (iD == 0) {
                    i = 0;
                } else if (iD != 1) {
                    i = iD != 2 ? 3 : 2;
                } else {
                    i = 1;
                }
                button.intent = i;
                switch (c61Var.b.ordinal()) {
                    case 0:
                        i3 = 0;
                        break;
                    case 1:
                        break;
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 7;
                        break;
                    case 6:
                        i3 = 6;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                button.type = i3;
                String str2 = c61Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                button.title = str2;
                String str3 = c61Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                button.url = str3;
                String str4 = c61Var.e;
                if (str4 == null) {
                    str4 = "";
                }
                button.payload = str4;
                button.showLoading = c61Var.h;
                button.quickLocation = c61Var.f;
                button.contactId = c61Var.g;
                arrayList3.add(button);
            }
        }
    }

    public static Protos.Attaches.LocationInfo m(m60 m60Var) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        vc9 vc9Var = m60Var.a;
        locationInfo.latitude = vc9Var.a;
        locationInfo.longitude = vc9Var.b;
        locationInfo.altitude = vc9Var.c;
        locationInfo.accuracy = vc9Var.d;
        locationInfo.bearing = vc9Var.e;
        locationInfo.speed = vc9Var.f;
        locationInfo.time = m60Var.b;
        return locationInfo;
    }

    public static o60 n(Protos.Attaches.Attach.Photo photo) {
        o60 o60Var = o60.l;
        n60 n60Var = new n60();
        n60Var.a = photo.baseUrl;
        n60Var.b = photo.photoUrl;
        n60Var.c = photo.width;
        n60Var.d = photo.height;
        n60Var.e = photo.gif;
        n60Var.f = photo.previewData;
        n60Var.g = photo.thumbhashData;
        n60Var.h = photo.photoToken;
        n60Var.i = photo.photoId;
        n60Var.j = photo.mp4Url;
        n60Var.k = ch3.r(photo.previewUrl) ? null : photo.previewUrl;
        return new o60(n60Var);
    }

    public static Protos.Attaches.Attach.Photo o(o60 o60Var) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = o60Var.a;
        if (str == null) {
            str = "";
        }
        photo.baseUrl = str;
        String str2 = o60Var.b;
        if (str2 == null) {
            str2 = "";
        }
        photo.photoUrl = str2;
        photo.width = o60Var.c;
        photo.height = o60Var.d;
        photo.gif = o60Var.e;
        byte[] bArr = o60Var.f;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        byte[] bArr2 = o60Var.g;
        if (bArr2 != null) {
            photo.thumbhashData = bArr2;
        }
        String str3 = o60Var.k;
        if (str3 == null) {
            str3 = "";
        }
        photo.previewUrl = str3;
        String str4 = o60Var.h;
        if (str4 == null) {
            str4 = "";
        }
        photo.photoToken = str4;
        photo.photoId = o60Var.i;
        String str5 = o60Var.j;
        photo.mp4Url = str5 != null ? str5 : "";
        return photo;
    }

    public static int p(int i) {
        int iD = qt4.D(i);
        int i2 = 1;
        if (iD != 1) {
            i2 = 2;
            if (iD != 2) {
                i2 = 3;
                if (iD != 3) {
                    i2 = 4;
                    if (iD != 4) {
                        i2 = 5;
                        if (iD != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static Protos.Chat q(byte[] bArr) throws ProtoException {
        try {
            return (Protos.Chat) sia.mergeFrom(new Protos.Chat(), bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }

    public static int r(x60 x60Var) {
        int iOrdinal = x60Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 5;
                }
                if (iOrdinal == 4) {
                    return 3;
                }
                throw new RuntimeException(null, null);
            }
        }
        return i;
    }
}
