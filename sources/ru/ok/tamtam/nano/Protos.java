package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.vk.push.core.base.AidlException;
import defpackage.ck8;
import defpackage.cqk;
import defpackage.em9;
import defpackage.np0;
import defpackage.sb8;
import defpackage.sia;
import defpackage.su3;
import defpackage.uu3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public interface Protos {

    /* JADX INFO: loaded from: classes.dex */
    public static final class Attaches extends sia {
        private static volatile Attaches[] _emptyArray;
        public Attach[] attach;
        public Attach.InlineKeyboard keyboard;
        public Attach.ReplyKeyboard replyKeyboard;
        public Attach.SendAction sendAction;

        public Attaches() {
            clear();
        }

        public static Attaches[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Attaches[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Attaches parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Attaches) sia.mergeFrom(new Attaches(), bArr);
        }

        public Attaches clear() {
            this.attach = Attach.emptyArray();
            this.keyboard = null;
            this.sendAction = null;
            this.replyKeyboard = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            Attach[] attachArr = this.attach;
            int i = 0;
            if (attachArr != null && attachArr.length > 0) {
                int i2 = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        i2 = uu3.i(1, attach) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                i += uu3.i(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                i += uu3.i(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            return replyKeyboard != null ? uu3.i(4, replyKeyboard) + i : i;
        }

        @Override // defpackage.sia
        public Attaches mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int I = sb8.I(su3Var, 10);
                    Attach[] attachArr = this.attach;
                    int length = attachArr == null ? 0 : attachArr.length;
                    int i = I + length;
                    Attach[] attachArr2 = new Attach[i];
                    if (length != 0) {
                        System.arraycopy(attachArr, 0, attachArr2, 0, length);
                    }
                    while (length < i - 1) {
                        Attach attach = new Attach();
                        attachArr2[length] = attach;
                        su3Var.j(attach);
                        su3Var.s();
                        length++;
                    }
                    Attach attach2 = new Attach();
                    attachArr2[length] = attach2;
                    su3Var.j(attach2);
                    this.attach = attachArr2;
                } else if (iS == 18) {
                    if (this.keyboard == null) {
                        this.keyboard = new Attach.InlineKeyboard();
                    }
                    su3Var.j(this.keyboard);
                } else if (iS == 26) {
                    if (this.sendAction == null) {
                        this.sendAction = new Attach.SendAction();
                    }
                    su3Var.j(this.sendAction);
                } else if (iS == 34) {
                    if (this.replyKeyboard == null) {
                        this.replyKeyboard = new Attach.ReplyKeyboard();
                    }
                    su3Var.j(this.replyKeyboard);
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            Attach[] attachArr = this.attach;
            if (attachArr != null && attachArr.length > 0) {
                int i = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        uu3Var.y(1, attach);
                    }
                    i++;
                }
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                uu3Var.y(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                uu3Var.y(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            if (replyKeyboard != null) {
                uu3Var.y(4, replyKeyboard);
            }
        }

        public static final class Attach extends sia {
            public static final int APP = 7;
            public static final int AUDIO = 4;
            public static final int CALL = 8;
            public static final int CANCELLED = 1;
            public static final int CONTACT = 11;
            public static final int CONTROL = 1;
            public static final int DAILY_MEDIA = 15;
            public static final int DEFAULT = 0;
            public static final int ERROR = 3;
            public static final int FILE = 10;
            public static final int INLINE_KEYBOARD = 13;
            public static final int LOADED = 2;
            public static final int LOADING = 4;
            public static final int LOCATION = 14;
            public static final int MUSIC = 9;
            public static final int NOT_LOADED = 0;
            public static final int PHOTO = 2;
            public static final int POLL = 17;
            public static final int PRESENT = 12;
            public static final int PROCESSED = 2;
            public static final int PROCESSING = 1;
            public static final int SHARE = 6;
            public static final int STICKER = 5;
            public static final int STORY_REPLY = 18;
            public static final int UNKNOWN = 0;
            public static final int VIDEO = 3;
            public static final int WIDGET = 16;
            private static volatile Attach[] _emptyArray;
            public App app;
            public String appVersion;
            public Audio audio;
            public long bytesDownloaded;
            public Call call;
            public Contact contact;
            public Control control;
            public File file;
            public InlineKeyboard inlineKeyboard;
            public boolean isDeleted;
            public boolean isProcessingOnServer;
            public long lastErrorTime;
            public long lastModified;
            public String localId;
            public String localPath;
            public Location location;
            public Photo photo;
            public Poll poll;
            public Present present;
            public int processingOnServerStatus;
            public int progress;
            public float progressFloat;
            public boolean sensitive;
            public boolean sensitiveContentUnlocked;
            public Share share;
            public int status;
            public Sticker sticker;
            public StoriesReply storiesReply;
            public long totalBytes;
            public int type;
            public Video video;
            public Widget widget;

            public Attach() {
                clear();
            }

            public static Attach[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Attach[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Attach parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Attach) sia.mergeFrom(new Attach(), bArr);
            }

            public Attach clear() {
                this.type = 0;
                this.photo = null;
                this.control = null;
                this.video = null;
                this.audio = null;
                this.sticker = null;
                this.share = null;
                this.app = null;
                this.call = null;
                this.status = 0;
                this.lastErrorTime = 0L;
                this.progress = 0;
                this.localId = "";
                this.localPath = "";
                this.isProcessingOnServer = false;
                this.isDeleted = false;
                this.totalBytes = 0L;
                this.bytesDownloaded = 0L;
                this.file = null;
                this.contact = null;
                this.lastModified = 0L;
                this.present = null;
                this.inlineKeyboard = null;
                this.location = null;
                this.progressFloat = 0.0f;
                this.processingOnServerStatus = 0;
                this.sensitiveContentUnlocked = false;
                this.sensitive = false;
                this.widget = null;
                this.appVersion = "";
                this.poll = null;
                this.storiesReply = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int i = this.type;
                int iF = i != 0 ? uu3.f(1, i) : 0;
                Photo photo = this.photo;
                if (photo != null) {
                    iF += uu3.i(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    iF += uu3.i(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    iF += uu3.i(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    iF += uu3.i(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    iF += uu3.i(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    iF += uu3.i(7, share);
                }
                App app = this.app;
                if (app != null) {
                    iF += uu3.i(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    iF += uu3.i(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    iF += uu3.f(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    iF += uu3.h(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    iF += uu3.f(12, i3);
                }
                if (!this.localId.equals("")) {
                    iF += uu3.l(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    iF += uu3.l(14, this.localPath);
                }
                if (this.isProcessingOnServer) {
                    iF += uu3.a(15);
                }
                if (this.isDeleted) {
                    iF += uu3.a(16);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    iF += uu3.h(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    iF += uu3.h(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    iF += uu3.i(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    iF += uu3.i(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    iF += uu3.h(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    iF += uu3.i(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    iF += uu3.i(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    iF += uu3.i(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    iF += uu3.e(26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    iF += uu3.f(27, i4);
                }
                if (this.sensitiveContentUnlocked) {
                    iF += uu3.a(28);
                }
                if (this.sensitive) {
                    iF += uu3.a(29);
                }
                Widget widget = this.widget;
                if (widget != null) {
                    iF += uu3.i(31, widget);
                }
                if (!this.appVersion.equals("")) {
                    iF += uu3.l(32, this.appVersion);
                }
                Poll poll = this.poll;
                if (poll != null) {
                    iF += uu3.i(33, poll);
                }
                StoriesReply storiesReply = this.storiesReply;
                return storiesReply != null ? uu3.i(34, storiesReply) + iF : iF;
            }

            @Override // defpackage.sia
            public Attach mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            int iP = su3Var.p();
                            switch (iP) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    this.type = iP;
                                    break;
                            }
                            break;
                        case 18:
                            if (this.photo == null) {
                                this.photo = new Photo();
                            }
                            su3Var.j(this.photo);
                            break;
                        case 26:
                            if (this.control == null) {
                                this.control = new Control();
                            }
                            su3Var.j(this.control);
                            break;
                        case 34:
                            if (this.video == null) {
                                this.video = new Video();
                            }
                            su3Var.j(this.video);
                            break;
                        case 42:
                            if (this.audio == null) {
                                this.audio = new Audio();
                            }
                            su3Var.j(this.audio);
                            break;
                        case 50:
                            if (this.sticker == null) {
                                this.sticker = new Sticker();
                            }
                            su3Var.j(this.sticker);
                            break;
                        case 58:
                            if (this.share == null) {
                                this.share = new Share();
                            }
                            su3Var.j(this.share);
                            break;
                        case 66:
                            if (this.app == null) {
                                this.app = new App();
                            }
                            su3Var.j(this.app);
                            break;
                        case 74:
                            if (this.call == null) {
                                this.call = new Call();
                            }
                            su3Var.j(this.call);
                            break;
                        case 80:
                            int iP2 = su3Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4) {
                                this.status = iP2;
                            }
                            break;
                        case 88:
                            this.lastErrorTime = su3Var.q();
                            break;
                        case 96:
                            this.progress = su3Var.p();
                            break;
                        case 106:
                            this.localId = su3Var.r();
                            break;
                        case 114:
                            this.localPath = su3Var.r();
                            break;
                        case 120:
                            this.isProcessingOnServer = su3Var.f();
                            break;
                        case np0.m /* 128 */:
                            this.isDeleted = su3Var.f();
                            break;
                        case 136:
                            this.totalBytes = su3Var.q();
                            break;
                        case 144:
                            this.bytesDownloaded = su3Var.q();
                            break;
                        case 162:
                            if (this.file == null) {
                                this.file = new File();
                            }
                            su3Var.j(this.file);
                            break;
                        case 170:
                            if (this.contact == null) {
                                this.contact = new Contact();
                            }
                            su3Var.j(this.contact);
                            break;
                        case 176:
                            this.lastModified = su3Var.q();
                            break;
                        case 186:
                            if (this.present == null) {
                                this.present = new Present();
                            }
                            su3Var.j(this.present);
                            break;
                        case 194:
                            if (this.inlineKeyboard == null) {
                                this.inlineKeyboard = new InlineKeyboard();
                            }
                            su3Var.j(this.inlineKeyboard);
                            break;
                        case 202:
                            if (this.location == null) {
                                this.location = new Location();
                            }
                            su3Var.j(this.location);
                            break;
                        case 213:
                            this.progressFloat = su3Var.i();
                            break;
                        case 216:
                            int iP3 = su3Var.p();
                            if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                                this.processingOnServerStatus = iP3;
                            }
                            break;
                        case 224:
                            this.sensitiveContentUnlocked = su3Var.f();
                            break;
                        case 232:
                            this.sensitive = su3Var.f();
                            break;
                        case 250:
                            if (this.widget == null) {
                                this.widget = new Widget();
                            }
                            su3Var.j(this.widget);
                            break;
                        case 258:
                            this.appVersion = su3Var.r();
                            break;
                        case 266:
                            if (this.poll == null) {
                                this.poll = new Poll();
                            }
                            su3Var.j(this.poll);
                            break;
                        case 274:
                            if (this.storiesReply == null) {
                                this.storiesReply = new StoriesReply();
                            }
                            su3Var.j(this.storiesReply);
                            break;
                        default:
                            if (!su3Var.u(iS)) {
                            }
                            break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                int i = this.type;
                if (i != 0) {
                    uu3Var.w(1, i);
                }
                Photo photo = this.photo;
                if (photo != null) {
                    uu3Var.y(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    uu3Var.y(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    uu3Var.y(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    uu3Var.y(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    uu3Var.y(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    uu3Var.y(7, share);
                }
                App app = this.app;
                if (app != null) {
                    uu3Var.y(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    uu3Var.y(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    uu3Var.w(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    uu3Var.x(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    uu3Var.w(12, i3);
                }
                if (!this.localId.equals("")) {
                    uu3Var.E(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    uu3Var.E(14, this.localPath);
                }
                boolean z = this.isProcessingOnServer;
                if (z) {
                    uu3Var.r(15, z);
                }
                boolean z2 = this.isDeleted;
                if (z2) {
                    uu3Var.r(16, z2);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    uu3Var.x(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    uu3Var.x(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    uu3Var.y(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    uu3Var.y(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    uu3Var.x(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    uu3Var.y(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    uu3Var.y(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    uu3Var.y(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    uu3Var.v(26, this.progressFloat);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    uu3Var.w(27, i4);
                }
                boolean z3 = this.sensitiveContentUnlocked;
                if (z3) {
                    uu3Var.r(28, z3);
                }
                boolean z4 = this.sensitive;
                if (z4) {
                    uu3Var.r(29, z4);
                }
                Widget widget = this.widget;
                if (widget != null) {
                    uu3Var.y(31, widget);
                }
                if (!this.appVersion.equals("")) {
                    uu3Var.E(32, this.appVersion);
                }
                Poll poll = this.poll;
                if (poll != null) {
                    uu3Var.y(33, poll);
                }
                StoriesReply storiesReply = this.storiesReply;
                if (storiesReply != null) {
                    uu3Var.y(34, storiesReply);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Poll extends sia {
                private static volatile Poll[] _emptyArray;
                public Answer[] answers;
                public long pollId;
                public int settings;
                public State state;
                public String title;
                public int version;

                public Poll() {
                    clear();
                }

                public static Poll[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Poll[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Poll parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Poll) sia.mergeFrom(new Poll(), bArr);
                }

                public Poll clear() {
                    this.pollId = 0L;
                    this.title = "";
                    this.answers = Answer.emptyArray();
                    this.settings = 0;
                    this.state = null;
                    this.version = 0;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.pollId;
                    int i = 0;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    if (!this.title.equals("")) {
                        iH += uu3.l(2, this.title);
                    }
                    Answer[] answerArr = this.answers;
                    if (answerArr != null && answerArr.length > 0) {
                        while (true) {
                            Answer[] answerArr2 = this.answers;
                            if (i >= answerArr2.length) {
                                break;
                            }
                            Answer answer = answerArr2[i];
                            if (answer != null) {
                                iH = uu3.i(3, answer) + iH;
                            }
                            i++;
                        }
                    }
                    int i2 = this.settings;
                    if (i2 != 0) {
                        iH += uu3.f(4, i2);
                    }
                    State state = this.state;
                    if (state != null) {
                        iH += uu3.i(5, state);
                    }
                    int i3 = this.version;
                    return i3 != 0 ? uu3.f(6, i3) + iH : iH;
                }

                @Override // defpackage.sia
                public Poll mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.pollId = su3Var.q();
                        } else if (iS == 18) {
                            this.title = su3Var.r();
                        } else if (iS == 26) {
                            int I = sb8.I(su3Var, 26);
                            Answer[] answerArr = this.answers;
                            int length = answerArr == null ? 0 : answerArr.length;
                            int i = I + length;
                            Answer[] answerArr2 = new Answer[i];
                            if (length != 0) {
                                System.arraycopy(answerArr, 0, answerArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Answer answer = new Answer();
                                answerArr2[length] = answer;
                                su3Var.j(answer);
                                su3Var.s();
                                length++;
                            }
                            Answer answer2 = new Answer();
                            answerArr2[length] = answer2;
                            su3Var.j(answer2);
                            this.answers = answerArr2;
                        } else if (iS == 32) {
                            this.settings = su3Var.p();
                        } else if (iS == 42) {
                            if (this.state == null) {
                                this.state = new State();
                            }
                            su3Var.j(this.state);
                        } else if (iS == 48) {
                            this.version = su3Var.p();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.pollId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    if (!this.title.equals("")) {
                        uu3Var.E(2, this.title);
                    }
                    Answer[] answerArr = this.answers;
                    if (answerArr != null && answerArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Answer[] answerArr2 = this.answers;
                            if (i >= answerArr2.length) {
                                break;
                            }
                            Answer answer = answerArr2[i];
                            if (answer != null) {
                                uu3Var.y(3, answer);
                            }
                            i++;
                        }
                    }
                    int i2 = this.settings;
                    if (i2 != 0) {
                        uu3Var.w(4, i2);
                    }
                    State state = this.state;
                    if (state != null) {
                        uu3Var.y(5, state);
                    }
                    int i3 = this.version;
                    if (i3 != 0) {
                        uu3Var.w(6, i3);
                    }
                }

                public static final class Answer extends sia {
                    private static volatile Answer[] _emptyArray;
                    public int answerId;
                    public String text;

                    public Answer() {
                        clear();
                    }

                    public static Answer[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Answer[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Answer parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Answer) sia.mergeFrom(new Answer(), bArr);
                    }

                    public Answer clear() {
                        this.text = "";
                        this.answerId = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int iL = !this.text.equals("") ? uu3.l(1, this.text) : 0;
                        int i = this.answerId;
                        return i != 0 ? uu3.f(2, i) + iL : iL;
                    }

                    @Override // defpackage.sia
                    public Answer mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 10) {
                                this.text = su3Var.r();
                            } else if (iS == 16) {
                                this.answerId = su3Var.p();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        if (!this.text.equals("")) {
                            uu3Var.E(1, this.text);
                        }
                        int i = this.answerId;
                        if (i != 0) {
                            uu3Var.w(2, i);
                        }
                    }

                    public static Answer parseFrom(su3 su3Var) throws IOException {
                        return new Answer().mergeFrom(su3Var);
                    }
                }

                public static final class AnswerStats extends sia {
                    private static volatile AnswerStats[] _emptyArray;
                    public long timestamp;
                    public long userId;

                    public AnswerStats() {
                        clear();
                    }

                    public static AnswerStats[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnswerStats[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnswerStats parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (AnswerStats) sia.mergeFrom(new AnswerStats(), bArr);
                    }

                    public AnswerStats clear() {
                        this.userId = 0L;
                        this.timestamp = 0L;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        long j = this.userId;
                        int iH = j != 0 ? uu3.h(1, j) : 0;
                        long j2 = this.timestamp;
                        return j2 != 0 ? uu3.h(2, j2) + iH : iH;
                    }

                    @Override // defpackage.sia
                    public AnswerStats mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                this.userId = su3Var.q();
                            } else if (iS == 16) {
                                this.timestamp = su3Var.q();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        long j = this.userId;
                        if (j != 0) {
                            uu3Var.x(1, j);
                        }
                        long j2 = this.timestamp;
                        if (j2 != 0) {
                            uu3Var.x(2, j2);
                        }
                    }

                    public static AnswerStats parseFrom(su3 su3Var) throws IOException {
                        return new AnswerStats().mergeFrom(su3Var);
                    }
                }

                public static final class Result extends sia {
                    private static volatile Result[] _emptyArray;
                    public int answerId;
                    public int options;
                    public int rate;
                    public int voteCount;
                    public AnswerStats[] votes;

                    public Result() {
                        clear();
                    }

                    public static Result[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Result[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Result) sia.mergeFrom(new Result(), bArr);
                    }

                    public Result clear() {
                        this.answerId = 0;
                        this.voteCount = 0;
                        this.votes = AnswerStats.emptyArray();
                        this.rate = 0;
                        this.options = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.answerId;
                        int i2 = 0;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        int i3 = this.voteCount;
                        if (i3 != 0) {
                            iF += uu3.f(2, i3);
                        }
                        AnswerStats[] answerStatsArr = this.votes;
                        if (answerStatsArr != null && answerStatsArr.length > 0) {
                            while (true) {
                                AnswerStats[] answerStatsArr2 = this.votes;
                                if (i2 >= answerStatsArr2.length) {
                                    break;
                                }
                                AnswerStats answerStats = answerStatsArr2[i2];
                                if (answerStats != null) {
                                    iF = uu3.i(3, answerStats) + iF;
                                }
                                i2++;
                            }
                        }
                        int i4 = this.rate;
                        if (i4 != 0) {
                            iF += uu3.f(4, i4);
                        }
                        int i5 = this.options;
                        return i5 != 0 ? uu3.f(5, i5) + iF : iF;
                    }

                    @Override // defpackage.sia
                    public Result mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                this.answerId = su3Var.p();
                            } else if (iS == 16) {
                                this.voteCount = su3Var.p();
                            } else if (iS == 26) {
                                int I = sb8.I(su3Var, 26);
                                AnswerStats[] answerStatsArr = this.votes;
                                int length = answerStatsArr == null ? 0 : answerStatsArr.length;
                                int i = I + length;
                                AnswerStats[] answerStatsArr2 = new AnswerStats[i];
                                if (length != 0) {
                                    System.arraycopy(answerStatsArr, 0, answerStatsArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    AnswerStats answerStats = new AnswerStats();
                                    answerStatsArr2[length] = answerStats;
                                    su3Var.j(answerStats);
                                    su3Var.s();
                                    length++;
                                }
                                AnswerStats answerStats2 = new AnswerStats();
                                answerStatsArr2[length] = answerStats2;
                                su3Var.j(answerStats2);
                                this.votes = answerStatsArr2;
                            } else if (iS == 32) {
                                this.rate = su3Var.p();
                            } else if (iS == 40) {
                                this.options = su3Var.p();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.answerId;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        int i2 = this.voteCount;
                        if (i2 != 0) {
                            uu3Var.w(2, i2);
                        }
                        AnswerStats[] answerStatsArr = this.votes;
                        if (answerStatsArr != null && answerStatsArr.length > 0) {
                            int i3 = 0;
                            while (true) {
                                AnswerStats[] answerStatsArr2 = this.votes;
                                if (i3 >= answerStatsArr2.length) {
                                    break;
                                }
                                AnswerStats answerStats = answerStatsArr2[i3];
                                if (answerStats != null) {
                                    uu3Var.y(3, answerStats);
                                }
                                i3++;
                            }
                        }
                        int i4 = this.rate;
                        if (i4 != 0) {
                            uu3Var.w(4, i4);
                        }
                        int i5 = this.options;
                        if (i5 != 0) {
                            uu3Var.w(5, i5);
                        }
                    }

                    public static Result parseFrom(su3 su3Var) throws IOException {
                        return new Result().mergeFrom(su3Var);
                    }
                }

                public static final class State extends sia {
                    private static volatile State[] _emptyArray;
                    public Result[] result;
                    public int total;
                    public long[] voterPreviewIds;

                    public State() {
                        clear();
                    }

                    public static State[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new State[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static State parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (State) sia.mergeFrom(new State(), bArr);
                    }

                    public State clear() {
                        this.total = 0;
                        this.result = Result.emptyArray();
                        this.voterPreviewIds = sb8.f;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.total;
                        int i2 = 0;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        Result[] resultArr = this.result;
                        if (resultArr != null && resultArr.length > 0) {
                            int i3 = 0;
                            while (true) {
                                Result[] resultArr2 = this.result;
                                if (i3 >= resultArr2.length) {
                                    break;
                                }
                                Result result = resultArr2[i3];
                                if (result != null) {
                                    iF = uu3.i(2, result) + iF;
                                }
                                i3++;
                            }
                        }
                        long[] jArr = this.voterPreviewIds;
                        if (jArr == null || jArr.length <= 0) {
                            return iF;
                        }
                        int iK = 0;
                        while (true) {
                            long[] jArr2 = this.voterPreviewIds;
                            if (i2 >= jArr2.length) {
                                return iF + iK + jArr2.length;
                            }
                            iK += uu3.k(jArr2[i2]);
                            i2++;
                        }
                    }

                    @Override // defpackage.sia
                    public State mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                this.total = su3Var.p();
                            } else if (iS == 18) {
                                int I = sb8.I(su3Var, 18);
                                Result[] resultArr = this.result;
                                int length = resultArr == null ? 0 : resultArr.length;
                                int i = I + length;
                                Result[] resultArr2 = new Result[i];
                                if (length != 0) {
                                    System.arraycopy(resultArr, 0, resultArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    Result result = new Result();
                                    resultArr2[length] = result;
                                    su3Var.j(result);
                                    su3Var.s();
                                    length++;
                                }
                                Result result2 = new Result();
                                resultArr2[length] = result2;
                                su3Var.j(result2);
                                this.result = resultArr2;
                            } else if (iS == 24) {
                                int I2 = sb8.I(su3Var, 24);
                                long[] jArr = this.voterPreviewIds;
                                int length2 = jArr == null ? 0 : jArr.length;
                                int i2 = I2 + length2;
                                long[] jArr2 = new long[i2];
                                if (length2 != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length2);
                                }
                                while (length2 < i2 - 1) {
                                    jArr2[length2] = su3Var.q();
                                    su3Var.s();
                                    length2++;
                                }
                                jArr2[length2] = su3Var.q();
                                this.voterPreviewIds = jArr2;
                            } else if (iS == 26) {
                                int iE = su3Var.e(su3Var.p());
                                int iC = su3Var.c();
                                int i3 = 0;
                                while (su3Var.b() > 0) {
                                    su3Var.q();
                                    i3++;
                                }
                                su3Var.t(iC);
                                long[] jArr3 = this.voterPreviewIds;
                                int length3 = jArr3 == null ? 0 : jArr3.length;
                                int i4 = i3 + length3;
                                long[] jArr4 = new long[i4];
                                if (length3 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length3);
                                }
                                while (length3 < i4) {
                                    jArr4[length3] = su3Var.q();
                                    length3++;
                                }
                                this.voterPreviewIds = jArr4;
                                su3Var.d(iE);
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.total;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        Result[] resultArr = this.result;
                        int i2 = 0;
                        if (resultArr != null && resultArr.length > 0) {
                            int i3 = 0;
                            while (true) {
                                Result[] resultArr2 = this.result;
                                if (i3 >= resultArr2.length) {
                                    break;
                                }
                                Result result = resultArr2[i3];
                                if (result != null) {
                                    uu3Var.y(2, result);
                                }
                                i3++;
                            }
                        }
                        long[] jArr = this.voterPreviewIds;
                        if (jArr == null || jArr.length <= 0) {
                            return;
                        }
                        while (true) {
                            long[] jArr2 = this.voterPreviewIds;
                            if (i2 >= jArr2.length) {
                                return;
                            }
                            uu3Var.x(3, jArr2[i2]);
                            i2++;
                        }
                    }

                    public static State parseFrom(su3 su3Var) throws IOException {
                        return new State().mergeFrom(su3Var);
                    }
                }

                public static Poll parseFrom(su3 su3Var) throws IOException {
                    return new Poll().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Sticker extends sia {
                public static final int LIVE = 2;
                public static final int LOTTIE = 4;
                public static final int POSTCARD = 3;
                public static final int STATIC = 1;
                public static final int SYSTEM = 1;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                public static final int USER = 2;
                private static volatile Sticker[] _emptyArray;
                public boolean audio;
                public int authorType;
                public String firstUrl;
                public int height;
                public String lottieUrl;
                public String mp4Url;
                public String previewUrl;
                public long setId;
                public long stickerId;
                public int stickerType;
                public String[] tags;
                public long updateTime;
                public String url;
                public String videoUrl;
                public int width;

                public Sticker() {
                    clear();
                }

                public static Sticker[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Sticker[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Sticker parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Sticker) sia.mergeFrom(new Sticker(), bArr);
                }

                public Sticker clear() {
                    this.stickerId = 0L;
                    this.url = "";
                    this.width = 0;
                    this.height = 0;
                    this.mp4Url = "";
                    this.firstUrl = "";
                    this.tags = sb8.h;
                    this.previewUrl = "";
                    this.updateTime = 0L;
                    this.stickerType = 0;
                    this.setId = 0L;
                    this.lottieUrl = "";
                    this.audio = false;
                    this.authorType = 0;
                    this.videoUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.stickerId;
                    int i = 0;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += uu3.l(2, this.url);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += uu3.f(3, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += uu3.f(4, i3);
                    }
                    if (!this.mp4Url.equals("")) {
                        iH += uu3.l(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        iH += uu3.l(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int iJ = 0;
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i4++;
                                int iQ = uu3.q(str);
                                iJ = uu3.j(iQ) + iQ + iJ;
                            }
                            i++;
                        }
                        iH = iH + iJ + i4;
                    }
                    if (!this.previewUrl.equals("")) {
                        iH += uu3.l(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        iH += uu3.h(10, j2);
                    }
                    int i5 = this.stickerType;
                    if (i5 != 0) {
                        iH += uu3.f(13, i5);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        iH += uu3.h(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        iH += uu3.l(16, this.lottieUrl);
                    }
                    if (this.audio) {
                        iH += uu3.a(17);
                    }
                    int i6 = this.authorType;
                    if (i6 != 0) {
                        iH += uu3.f(18, i6);
                    }
                    return !this.videoUrl.equals("") ? uu3.l(20, this.videoUrl) + iH : iH;
                }

                @Override // defpackage.sia
                public Sticker mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.stickerId = su3Var.q();
                                break;
                            case 18:
                                this.url = su3Var.r();
                                break;
                            case 24:
                                this.width = su3Var.p();
                                break;
                            case 32:
                                this.height = su3Var.p();
                                break;
                            case 42:
                                this.mp4Url = su3Var.r();
                                break;
                            case 50:
                                this.firstUrl = su3Var.r();
                                break;
                            case 66:
                                int I = sb8.I(su3Var, 66);
                                String[] strArr = this.tags;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = I + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = su3Var.r();
                                    su3Var.s();
                                    length++;
                                }
                                strArr2[length] = su3Var.r();
                                this.tags = strArr2;
                                break;
                            case 74:
                                this.previewUrl = su3Var.r();
                                break;
                            case 80:
                                this.updateTime = su3Var.q();
                                break;
                            case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                                int iP = su3Var.p();
                                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                    this.stickerType = iP;
                                }
                                break;
                            case 120:
                                this.setId = su3Var.q();
                                break;
                            case 130:
                                this.lottieUrl = su3Var.r();
                                break;
                            case 136:
                                this.audio = su3Var.f();
                                break;
                            case 144:
                                int iP2 = su3Var.p();
                                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                                    this.authorType = iP2;
                                }
                                break;
                            case 162:
                                this.videoUrl = su3Var.r();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.stickerId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        uu3Var.E(2, this.url);
                    }
                    int i = this.width;
                    if (i != 0) {
                        uu3Var.w(3, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        uu3Var.w(4, i2);
                    }
                    if (!this.mp4Url.equals("")) {
                        uu3Var.E(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        uu3Var.E(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i3 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i3];
                            if (str != null) {
                                uu3Var.E(8, str);
                            }
                            i3++;
                        }
                    }
                    if (!this.previewUrl.equals("")) {
                        uu3Var.E(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        uu3Var.x(10, j2);
                    }
                    int i4 = this.stickerType;
                    if (i4 != 0) {
                        uu3Var.w(13, i4);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        uu3Var.x(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        uu3Var.E(16, this.lottieUrl);
                    }
                    boolean z = this.audio;
                    if (z) {
                        uu3Var.r(17, z);
                    }
                    int i5 = this.authorType;
                    if (i5 != 0) {
                        uu3Var.w(18, i5);
                    }
                    if (this.videoUrl.equals("")) {
                        return;
                    }
                    uu3Var.E(20, this.videoUrl);
                }

                public static final class AnimationProperties extends sia {
                    private static volatile AnimationProperties[] _emptyArray;
                    public int duration;
                    public int fps;
                    public Map<Integer, Integer> frameRepeats;
                    public int framesCount;
                    public int replayDelay;

                    public AnimationProperties() {
                        clear();
                    }

                    public static AnimationProperties[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnimationProperties[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnimationProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (AnimationProperties) sia.mergeFrom(new AnimationProperties(), bArr);
                    }

                    public AnimationProperties clear() {
                        this.framesCount = 0;
                        this.fps = 0;
                        this.duration = 0;
                        this.replayDelay = 0;
                        this.frameRepeats = null;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.framesCount;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        int i2 = this.fps;
                        if (i2 != 0) {
                            iF += uu3.f(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            iF += uu3.f(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            iF += uu3.f(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        return map != null ? ck8.a(map, 5, 5, 5) + iF : iF;
                    }

                    @Override // defpackage.sia
                    public AnimationProperties mergeFrom(su3 su3Var) throws IOException {
                        su3 su3Var2;
                        em9 em9Var = cqk.c;
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                su3Var2 = su3Var;
                                this.framesCount = su3Var2.p();
                            } else if (iS == 16) {
                                su3Var2 = su3Var;
                                this.fps = su3Var2.p();
                            } else if (iS == 24) {
                                su3Var2 = su3Var;
                                this.duration = su3Var2.p();
                            } else if (iS == 32) {
                                su3Var2 = su3Var;
                                this.replayDelay = su3Var2.p();
                            } else if (iS == 42) {
                                su3Var2 = su3Var;
                                this.frameRepeats = ck8.b(su3Var2, this.frameRepeats, em9Var, 5, 5, null, 8, 16);
                            } else {
                                if (!su3Var.u(iS)) {
                                    break;
                                }
                                su3Var2 = su3Var;
                            }
                            su3Var = su3Var2;
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.framesCount;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        int i2 = this.fps;
                        if (i2 != 0) {
                            uu3Var.w(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            uu3Var.w(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            uu3Var.w(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        if (map != null) {
                            ck8.d(uu3Var, map, 5, 5, 5);
                        }
                    }

                    public static AnimationProperties parseFrom(su3 su3Var) throws IOException {
                        return new AnimationProperties().mergeFrom(su3Var);
                    }
                }

                public static Sticker parseFrom(su3 su3Var) throws IOException {
                    return new Sticker().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class StoriesReply extends sia {
                private static volatile StoriesReply[] _emptyArray;
                public long expirationTime;
                public String previewUrl;
                public long storyId;
                public StoryOwner storyOwner;

                public StoriesReply() {
                    clear();
                }

                public static StoriesReply[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new StoriesReply[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static StoriesReply parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (StoriesReply) sia.mergeFrom(new StoriesReply(), bArr);
                }

                public StoriesReply clear() {
                    this.storyOwner = null;
                    this.storyId = 0L;
                    this.previewUrl = "";
                    this.expirationTime = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    StoryOwner storyOwner = this.storyOwner;
                    int i = storyOwner != null ? uu3.i(1, storyOwner) : 0;
                    long j = this.storyId;
                    if (j != 0) {
                        i += uu3.h(2, j);
                    }
                    if (!this.previewUrl.equals("")) {
                        i += uu3.l(3, this.previewUrl);
                    }
                    long j2 = this.expirationTime;
                    return j2 != 0 ? uu3.h(4, j2) + i : i;
                }

                @Override // defpackage.sia
                public StoriesReply mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            if (this.storyOwner == null) {
                                this.storyOwner = new StoryOwner();
                            }
                            su3Var.j(this.storyOwner);
                        } else if (iS == 16) {
                            this.storyId = su3Var.q();
                        } else if (iS == 26) {
                            this.previewUrl = su3Var.r();
                        } else if (iS == 32) {
                            this.expirationTime = su3Var.q();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    StoryOwner storyOwner = this.storyOwner;
                    if (storyOwner != null) {
                        uu3Var.y(1, storyOwner);
                    }
                    long j = this.storyId;
                    if (j != 0) {
                        uu3Var.x(2, j);
                    }
                    if (!this.previewUrl.equals("")) {
                        uu3Var.E(3, this.previewUrl);
                    }
                    long j2 = this.expirationTime;
                    if (j2 != 0) {
                        uu3Var.x(4, j2);
                    }
                }

                public static final class StoryOwner extends sia {
                    public static final int CHANNEL = 2;
                    public static final int CHAT = 1;
                    public static final int USER = 0;
                    private static volatile StoryOwner[] _emptyArray;
                    public long id;
                    public int type;

                    public StoryOwner() {
                        clear();
                    }

                    public static StoryOwner[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new StoryOwner[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static StoryOwner parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (StoryOwner) sia.mergeFrom(new StoryOwner(), bArr);
                    }

                    public StoryOwner clear() {
                        this.type = 0;
                        this.id = 0L;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.type;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        long j = this.id;
                        return j != 0 ? uu3.h(2, j) + iF : iF;
                    }

                    @Override // defpackage.sia
                    public StoryOwner mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                int iP = su3Var.p();
                                if (iP == 0 || iP == 1 || iP == 2) {
                                    this.type = iP;
                                }
                            } else if (iS == 16) {
                                this.id = su3Var.q();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.type;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        long j = this.id;
                        if (j != 0) {
                            uu3Var.x(2, j);
                        }
                    }

                    public static StoryOwner parseFrom(su3 su3Var) throws IOException {
                        return new StoryOwner().mergeFrom(su3Var);
                    }
                }

                public static StoriesReply parseFrom(su3 su3Var) throws IOException {
                    return new StoriesReply().mergeFrom(su3Var);
                }
            }

            public static final class Video extends sia {
                private static volatile Video[] _emptyArray;
                public int audioGroupIndex;
                public int audioTrackIndex;
                public ConvertOptions convertOptions;
                public int duration;
                public String embedUrl;
                public String externalSiteName;
                public int height;
                public boolean ignoreAutoplay;
                public boolean isThumbnailInCache;
                public boolean live;
                public byte[] previewData;
                public long size;
                public long startTime;
                public byte[] thumbhashData;
                public String thumbnail;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public VideoCollage videoCollage;
                public long videoId;
                public int videoType;
                public byte[] wave;
                public int width;

                public Video() {
                    clear();
                }

                public static Video[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Video[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Video) sia.mergeFrom(new Video(), bArr);
                }

                public Video clear() {
                    this.videoId = 0L;
                    this.duration = 0;
                    this.thumbnail = "";
                    this.width = 0;
                    this.height = 0;
                    this.live = false;
                    byte[] bArr = sb8.i;
                    this.previewData = bArr;
                    this.isThumbnailInCache = false;
                    this.startTime = 0L;
                    this.externalSiteName = "";
                    this.convertOptions = null;
                    this.token = "";
                    this.videoCollage = null;
                    this.ignoreAutoplay = false;
                    this.audioTrackIndex = 0;
                    this.audioGroupIndex = 0;
                    this.videoType = 0;
                    this.embedUrl = "";
                    this.wave = bArr;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.thumbhashData = bArr;
                    this.size = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.videoId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    int i = this.duration;
                    if (i != 0) {
                        iH += uu3.f(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        iH += uu3.l(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += uu3.f(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += uu3.f(5, i3);
                    }
                    if (this.live) {
                        iH += uu3.a(6);
                    }
                    byte[] bArr = this.previewData;
                    byte[] bArr2 = sb8.i;
                    if (!Arrays.equals(bArr, bArr2)) {
                        iH += uu3.b(8, this.previewData);
                    }
                    if (this.isThumbnailInCache) {
                        iH += uu3.a(9);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        iH += uu3.h(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        iH += uu3.l(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        iH += uu3.i(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        iH += uu3.l(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        iH += uu3.i(14, videoCollage);
                    }
                    if (this.ignoreAutoplay) {
                        iH += uu3.a(15);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        iH += uu3.f(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        iH += uu3.f(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        iH += uu3.f(18, i6);
                    }
                    if (!this.embedUrl.equals("")) {
                        iH += uu3.l(19, this.embedUrl);
                    }
                    if (!Arrays.equals(this.wave, bArr2)) {
                        iH += uu3.b(20, this.wave);
                    }
                    if (!this.transcription.equals("")) {
                        iH += uu3.l(21, this.transcription);
                    }
                    int i7 = this.transcriptionStatus;
                    if (i7 != 0) {
                        iH += uu3.f(22, i7);
                    }
                    if (!Arrays.equals(this.thumbhashData, bArr2)) {
                        iH += uu3.b(23, this.thumbhashData);
                    }
                    long j3 = this.size;
                    return j3 != 0 ? uu3.h(24, j3) + iH : iH;
                }

                @Override // defpackage.sia
                public Video mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.videoId = su3Var.q();
                                break;
                            case 16:
                                this.duration = su3Var.p();
                                break;
                            case 26:
                                this.thumbnail = su3Var.r();
                                break;
                            case 32:
                                this.width = su3Var.p();
                                break;
                            case 40:
                                this.height = su3Var.p();
                                break;
                            case 48:
                                this.live = su3Var.f();
                                break;
                            case 66:
                                this.previewData = su3Var.g();
                                break;
                            case 72:
                                this.isThumbnailInCache = su3Var.f();
                                break;
                            case 80:
                                this.startTime = su3Var.q();
                                break;
                            case 90:
                                this.externalSiteName = su3Var.r();
                                break;
                            case 98:
                                if (this.convertOptions == null) {
                                    this.convertOptions = new ConvertOptions();
                                }
                                su3Var.j(this.convertOptions);
                                break;
                            case 106:
                                this.token = su3Var.r();
                                break;
                            case 114:
                                if (this.videoCollage == null) {
                                    this.videoCollage = new VideoCollage();
                                }
                                su3Var.j(this.videoCollage);
                                break;
                            case 120:
                                this.ignoreAutoplay = su3Var.f();
                                break;
                            case np0.m /* 128 */:
                                this.audioTrackIndex = su3Var.p();
                                break;
                            case 136:
                                this.audioGroupIndex = su3Var.p();
                                break;
                            case 144:
                                this.videoType = su3Var.p();
                                break;
                            case 154:
                                this.embedUrl = su3Var.r();
                                break;
                            case 162:
                                this.wave = su3Var.g();
                                break;
                            case 170:
                                this.transcription = su3Var.r();
                                break;
                            case 176:
                                int iP = su3Var.p();
                                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                                    this.transcriptionStatus = iP;
                                }
                                break;
                            case 186:
                                this.thumbhashData = su3Var.g();
                                break;
                            case 192:
                                this.size = su3Var.q();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.videoId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    int i = this.duration;
                    if (i != 0) {
                        uu3Var.w(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        uu3Var.E(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        uu3Var.w(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        uu3Var.w(5, i3);
                    }
                    boolean z = this.live;
                    if (z) {
                        uu3Var.r(6, z);
                    }
                    byte[] bArr = this.previewData;
                    byte[] bArr2 = sb8.i;
                    if (!Arrays.equals(bArr, bArr2)) {
                        uu3Var.s(8, this.previewData);
                    }
                    boolean z2 = this.isThumbnailInCache;
                    if (z2) {
                        uu3Var.r(9, z2);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        uu3Var.x(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        uu3Var.E(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        uu3Var.y(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        uu3Var.E(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        uu3Var.y(14, videoCollage);
                    }
                    boolean z3 = this.ignoreAutoplay;
                    if (z3) {
                        uu3Var.r(15, z3);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        uu3Var.w(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        uu3Var.w(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        uu3Var.w(18, i6);
                    }
                    if (!this.embedUrl.equals("")) {
                        uu3Var.E(19, this.embedUrl);
                    }
                    if (!Arrays.equals(this.wave, bArr2)) {
                        uu3Var.s(20, this.wave);
                    }
                    if (!this.transcription.equals("")) {
                        uu3Var.E(21, this.transcription);
                    }
                    int i7 = this.transcriptionStatus;
                    if (i7 != 0) {
                        uu3Var.w(22, i7);
                    }
                    if (!Arrays.equals(this.thumbhashData, bArr2)) {
                        uu3Var.s(23, this.thumbhashData);
                    }
                    long j3 = this.size;
                    if (j3 != 0) {
                        uu3Var.x(24, j3);
                    }
                }

                /* JADX INFO: loaded from: classes3.dex */
                public static final class ConvertOptions extends sia {
                    private static volatile ConvertOptions[] _emptyArray;
                    public float endTrimPosition;
                    public String[] fragmentsPaths;
                    public boolean mute;
                    public Quality quality;
                    public int qualityValue;
                    public float startTrimPosition;

                    public ConvertOptions() {
                        clear();
                    }

                    public static ConvertOptions[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new ConvertOptions[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static ConvertOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (ConvertOptions) sia.mergeFrom(new ConvertOptions(), bArr);
                    }

                    public ConvertOptions clear() {
                        this.quality = null;
                        this.startTrimPosition = 0.0f;
                        this.endTrimPosition = 0.0f;
                        this.qualityValue = 0;
                        this.mute = false;
                        this.fragmentsPaths = sb8.h;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        Quality quality = this.quality;
                        int i = 0;
                        int i2 = quality != null ? uu3.i(1, quality) : 0;
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i2 += uu3.e(2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i2 += uu3.e(3);
                        }
                        int i3 = this.qualityValue;
                        if (i3 != 0) {
                            i2 += uu3.f(4, i3);
                        }
                        if (this.mute) {
                            i2 += uu3.a(5);
                        }
                        String[] strArr = this.fragmentsPaths;
                        if (strArr == null || strArr.length <= 0) {
                            return i2;
                        }
                        int iJ = 0;
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = this.fragmentsPaths;
                            if (i >= strArr2.length) {
                                return i2 + iJ + i4;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i4++;
                                int iQ = uu3.q(str);
                                iJ = uu3.j(iQ) + iQ + iJ;
                            }
                            i++;
                        }
                    }

                    @Override // defpackage.sia
                    public ConvertOptions mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 10) {
                                if (this.quality == null) {
                                    this.quality = new Quality();
                                }
                                su3Var.j(this.quality);
                            } else if (iS == 21) {
                                this.startTrimPosition = su3Var.i();
                            } else if (iS == 29) {
                                this.endTrimPosition = su3Var.i();
                            } else if (iS == 32) {
                                this.qualityValue = su3Var.p();
                            } else if (iS == 40) {
                                this.mute = su3Var.f();
                            } else if (iS == 50) {
                                int I = sb8.I(su3Var, 50);
                                String[] strArr = this.fragmentsPaths;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = I + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = su3Var.r();
                                    su3Var.s();
                                    length++;
                                }
                                strArr2[length] = su3Var.r();
                                this.fragmentsPaths = strArr2;
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        Quality quality = this.quality;
                        if (quality != null) {
                            uu3Var.y(1, quality);
                        }
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            uu3Var.v(2, this.startTrimPosition);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            uu3Var.v(3, this.endTrimPosition);
                        }
                        int i = this.qualityValue;
                        if (i != 0) {
                            uu3Var.w(4, i);
                        }
                        boolean z = this.mute;
                        if (z) {
                            uu3Var.r(5, z);
                        }
                        String[] strArr = this.fragmentsPaths;
                        if (strArr == null || strArr.length <= 0) {
                            return;
                        }
                        int i2 = 0;
                        while (true) {
                            String[] strArr2 = this.fragmentsPaths;
                            if (i2 >= strArr2.length) {
                                return;
                            }
                            String str = strArr2[i2];
                            if (str != null) {
                                uu3Var.E(6, str);
                            }
                            i2++;
                        }
                    }

                    public static ConvertOptions parseFrom(su3 su3Var) throws IOException {
                        return new ConvertOptions().mergeFrom(su3Var);
                    }
                }

                /* JADX INFO: loaded from: classes3.dex */
                public static final class Quality extends sia {
                    private static volatile Quality[] _emptyArray;
                    public int bitrate;
                    public int height;
                    public boolean isOriginal;
                    public int ordinal;
                    public int width;

                    public Quality() {
                        clear();
                    }

                    public static Quality[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Quality[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Quality) sia.mergeFrom(new Quality(), bArr);
                    }

                    public Quality clear() {
                        this.ordinal = 0;
                        this.width = 0;
                        this.height = 0;
                        this.isOriginal = false;
                        this.bitrate = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.ordinal;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        int i2 = this.width;
                        if (i2 != 0) {
                            iF += uu3.f(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            iF += uu3.f(3, i3);
                        }
                        if (this.isOriginal) {
                            iF += uu3.a(4);
                        }
                        int i4 = this.bitrate;
                        return i4 != 0 ? uu3.f(5, i4) + iF : iF;
                    }

                    @Override // defpackage.sia
                    public Quality mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                this.ordinal = su3Var.p();
                            } else if (iS == 16) {
                                this.width = su3Var.p();
                            } else if (iS == 24) {
                                this.height = su3Var.p();
                            } else if (iS == 32) {
                                this.isOriginal = su3Var.f();
                            } else if (iS == 40) {
                                this.bitrate = su3Var.p();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.ordinal;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        int i2 = this.width;
                        if (i2 != 0) {
                            uu3Var.w(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            uu3Var.w(3, i3);
                        }
                        boolean z = this.isOriginal;
                        if (z) {
                            uu3Var.r(4, z);
                        }
                        int i4 = this.bitrate;
                        if (i4 != 0) {
                            uu3Var.w(5, i4);
                        }
                    }

                    public static Quality parseFrom(su3 su3Var) throws IOException {
                        return new Quality().mergeFrom(su3Var);
                    }
                }

                /* JADX INFO: loaded from: classes3.dex */
                public static final class VideoCollage extends sia {
                    private static volatile VideoCollage[] _emptyArray;
                    public int count;
                    public int frequency;
                    public int height;
                    public String url;
                    public int width;

                    public VideoCollage() {
                        clear();
                    }

                    public static VideoCollage[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new VideoCollage[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static VideoCollage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (VideoCollage) sia.mergeFrom(new VideoCollage(), bArr);
                    }

                    public VideoCollage clear() {
                        this.url = "";
                        this.frequency = 0;
                        this.height = 0;
                        this.width = 0;
                        this.count = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int iL = !this.url.equals("") ? uu3.l(1, this.url) : 0;
                        int i = this.frequency;
                        if (i != 0) {
                            iL += uu3.f(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            iL += uu3.f(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            iL += uu3.f(4, i3);
                        }
                        int i4 = this.count;
                        return i4 != 0 ? uu3.f(5, i4) + iL : iL;
                    }

                    @Override // defpackage.sia
                    public VideoCollage mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 10) {
                                this.url = su3Var.r();
                            } else if (iS == 16) {
                                this.frequency = su3Var.p();
                            } else if (iS == 24) {
                                this.height = su3Var.p();
                            } else if (iS == 32) {
                                this.width = su3Var.p();
                            } else if (iS == 40) {
                                this.count = su3Var.p();
                            } else if (!su3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        if (!this.url.equals("")) {
                            uu3Var.E(1, this.url);
                        }
                        int i = this.frequency;
                        if (i != 0) {
                            uu3Var.w(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            uu3Var.w(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            uu3Var.w(4, i3);
                        }
                        int i4 = this.count;
                        if (i4 != 0) {
                            uu3Var.w(5, i4);
                        }
                    }

                    public static VideoCollage parseFrom(su3 su3Var) throws IOException {
                        return new VideoCollage().mergeFrom(su3Var);
                    }
                }

                public static Video parseFrom(su3 su3Var) throws IOException {
                    return new Video().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Widget extends sia {
                private static volatile Widget[] _emptyArray;
                public Content[] contents;

                public Widget() {
                    clear();
                }

                public static Widget[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Widget[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Widget parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Widget) sia.mergeFrom(new Widget(), bArr);
                }

                public Widget clear() {
                    this.contents = Content.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    Content[] contentArr = this.contents;
                    int i = 0;
                    if (contentArr == null || contentArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return i2;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            i2 = uu3.i(1, content) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.sia
                public Widget mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int I = sb8.I(su3Var, 10);
                            Content[] contentArr = this.contents;
                            int length = contentArr == null ? 0 : contentArr.length;
                            int i = I + length;
                            Content[] contentArr2 = new Content[i];
                            if (length != 0) {
                                System.arraycopy(contentArr, 0, contentArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Content content = new Content();
                                contentArr2[length] = content;
                                su3Var.j(content);
                                su3Var.s();
                                length++;
                            }
                            Content content2 = new Content();
                            contentArr2[length] = content2;
                            su3Var.j(content2);
                            this.contents = contentArr2;
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    Content[] contentArr = this.contents;
                    if (contentArr == null || contentArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            uu3Var.y(1, content);
                        }
                        i++;
                    }
                }

                public static final class Content extends sia {
                    public static final int ADAPTIVE_ICON = 1;
                    public static final int DESCRIPTION = 5;
                    public static final int KEYBOARD = 6;
                    public static final int PICTURE = 2;
                    public static final int TITLE_BIG = 3;
                    public static final int TITLE_STANDARD = 4;
                    public static final int UNSUPPORTED = 0;
                    private static volatile Content[] _emptyArray;
                    public MessageElement[] elements;
                    public int iconHeight;
                    public String iconUrl;
                    public int iconWidth;
                    public InlineKeyboard keyboard;
                    public String text;
                    public int type;

                    public Content() {
                        clear();
                    }

                    public static Content[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (ck8.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Content[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Content) sia.mergeFrom(new Content(), bArr);
                    }

                    public Content clear() {
                        this.type = 0;
                        this.keyboard = null;
                        this.text = "";
                        this.elements = MessageElement.emptyArray();
                        this.iconUrl = "";
                        this.iconWidth = 0;
                        this.iconHeight = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.sia
                    public int computeSerializedSize() {
                        int i = this.type;
                        int i2 = 0;
                        int iF = i != 0 ? uu3.f(1, i) : 0;
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            iF += uu3.i(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            iF += uu3.l(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    iF = uu3.i(4, messageElement) + iF;
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            iF += uu3.l(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            iF += uu3.f(6, i3);
                        }
                        int i4 = this.iconHeight;
                        return i4 != 0 ? uu3.f(7, i4) + iF : iF;
                    }

                    @Override // defpackage.sia
                    public Content mergeFrom(su3 su3Var) throws IOException {
                        while (true) {
                            int iS = su3Var.s();
                            if (iS != 0) {
                                if (iS == 8) {
                                    int iP = su3Var.p();
                                    switch (iP) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            this.type = iP;
                                            break;
                                    }
                                } else if (iS == 18) {
                                    if (this.keyboard == null) {
                                        this.keyboard = new InlineKeyboard();
                                    }
                                    su3Var.j(this.keyboard);
                                } else if (iS == 26) {
                                    this.text = su3Var.r();
                                } else if (iS == 34) {
                                    int I = sb8.I(su3Var, 34);
                                    MessageElement[] messageElementArr = this.elements;
                                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                                    int i = I + length;
                                    MessageElement[] messageElementArr2 = new MessageElement[i];
                                    if (length != 0) {
                                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                                    }
                                    while (length < i - 1) {
                                        MessageElement messageElement = new MessageElement();
                                        messageElementArr2[length] = messageElement;
                                        su3Var.j(messageElement);
                                        su3Var.s();
                                        length++;
                                    }
                                    MessageElement messageElement2 = new MessageElement();
                                    messageElementArr2[length] = messageElement2;
                                    su3Var.j(messageElement2);
                                    this.elements = messageElementArr2;
                                } else if (iS == 42) {
                                    this.iconUrl = su3Var.r();
                                } else if (iS == 48) {
                                    this.iconWidth = su3Var.p();
                                } else if (iS == 56) {
                                    this.iconHeight = su3Var.p();
                                } else if (!su3Var.u(iS)) {
                                }
                            }
                        }
                        return this;
                    }

                    @Override // defpackage.sia
                    public void writeTo(uu3 uu3Var) throws IOException {
                        int i = this.type;
                        if (i != 0) {
                            uu3Var.w(1, i);
                        }
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            uu3Var.y(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            uu3Var.E(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    uu3Var.y(4, messageElement);
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            uu3Var.E(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            uu3Var.w(6, i3);
                        }
                        int i4 = this.iconHeight;
                        if (i4 != 0) {
                            uu3Var.w(7, i4);
                        }
                    }

                    public static Content parseFrom(su3 su3Var) throws IOException {
                        return new Content().mergeFrom(su3Var);
                    }
                }

                public static Widget parseFrom(su3 su3Var) throws IOException {
                    return new Widget().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class App extends sia {
                private static volatile App[] _emptyArray;
                public long appId;
                public String appState;
                public String icon;
                public String message;
                public String name;
                public int state;
                public long timeout;

                public App() {
                    clear();
                }

                public static App[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new App[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (App) sia.mergeFrom(new App(), bArr);
                }

                public App clear() {
                    this.appId = 0L;
                    this.name = "";
                    this.icon = "";
                    this.message = "";
                    this.state = 0;
                    this.timeout = 0L;
                    this.appState = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.appId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    if (!this.name.equals("")) {
                        iH += uu3.l(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        iH += uu3.l(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        iH += uu3.l(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        iH += uu3.f(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        iH += uu3.h(6, j2);
                    }
                    return !this.appState.equals("") ? uu3.l(7, this.appState) + iH : iH;
                }

                @Override // defpackage.sia
                public App mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.appId = su3Var.q();
                        } else if (iS == 18) {
                            this.name = su3Var.r();
                        } else if (iS == 26) {
                            this.icon = su3Var.r();
                        } else if (iS == 34) {
                            this.message = su3Var.r();
                        } else if (iS == 40) {
                            this.state = su3Var.p();
                        } else if (iS == 48) {
                            this.timeout = su3Var.q();
                        } else if (iS == 58) {
                            this.appState = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.appId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    if (!this.name.equals("")) {
                        uu3Var.E(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        uu3Var.E(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        uu3Var.E(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        uu3Var.w(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        uu3Var.x(6, j2);
                    }
                    if (this.appState.equals("")) {
                        return;
                    }
                    uu3Var.E(7, this.appState);
                }

                public static App parseFrom(su3 su3Var) throws IOException {
                    return new App().mergeFrom(su3Var);
                }
            }

            public static final class Audio extends sia {
                public static final int FAILED = 3;
                public static final int MEDIA_NOT_READY = 5;
                public static final int NOT_SUPPORTED = 4;
                public static final int PROCESSING = 1;
                public static final int SUCCESS = 2;
                public static final int UNKNOWN = 0;
                private static volatile Audio[] _emptyArray;
                public long audioId;
                public long duration;
                public long lastStartTimeUpdateTimestamp;
                public long startTime;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public String url;
                public byte[] wave;

                public Audio() {
                    clear();
                }

                public static Audio[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Audio[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Audio) sia.mergeFrom(new Audio(), bArr);
                }

                public Audio clear() {
                    this.audioId = 0L;
                    this.url = "";
                    this.duration = 0L;
                    this.wave = sb8.i;
                    this.token = "";
                    this.startTime = 0L;
                    this.lastStartTimeUpdateTimestamp = 0L;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.audioId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += uu3.l(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        iH += uu3.h(3, j2);
                    }
                    if (!Arrays.equals(this.wave, sb8.i)) {
                        iH += uu3.b(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        iH += uu3.l(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iH += uu3.h(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        iH += uu3.h(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        iH += uu3.l(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    return i != 0 ? uu3.f(9, i) + iH : iH;
                }

                @Override // defpackage.sia
                public Audio mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.audioId = su3Var.q();
                        } else if (iS == 18) {
                            this.url = su3Var.r();
                        } else if (iS == 24) {
                            this.duration = su3Var.q();
                        } else if (iS == 34) {
                            this.wave = su3Var.g();
                        } else if (iS == 42) {
                            this.token = su3Var.r();
                        } else if (iS == 48) {
                            this.startTime = su3Var.q();
                        } else if (iS == 56) {
                            this.lastStartTimeUpdateTimestamp = su3Var.q();
                        } else if (iS == 66) {
                            this.transcription = su3Var.r();
                        } else if (iS == 72) {
                            int iP = su3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                                this.transcriptionStatus = iP;
                            }
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.audioId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        uu3Var.E(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        uu3Var.x(3, j2);
                    }
                    if (!Arrays.equals(this.wave, sb8.i)) {
                        uu3Var.s(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        uu3Var.E(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        uu3Var.x(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        uu3Var.x(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        uu3Var.E(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    if (i != 0) {
                        uu3Var.w(9, i);
                    }
                }

                public static Audio parseFrom(su3 su3Var) throws IOException {
                    return new Audio().mergeFrom(su3Var);
                }
            }

            public static final class Button extends sia {
                public static final int CALLBACK = 0;
                public static final int CHAT = 5;
                public static final int CLIPBOARD = 8;
                public static final int DEFAULT = 0;
                public static final int LINK = 1;
                public static final int MESSAGE = 6;
                public static final int NEGATIVE = 2;
                public static final int OPEN_APP = 7;
                public static final int POSITIVE = 1;
                public static final int REQUEST_CONTACT = 2;
                public static final int REQUEST_GEO_LOCATION = 3;
                public static final int UNKNOWN_INTENT = 3;
                public static final int UNKNOWN_TYPE = 4;
                private static volatile Button[] _emptyArray;
                public long contactId;
                public int intent;
                public String payload;
                public boolean quickLocation;
                public boolean showLoading;
                public String title;
                public int type;
                public String url;

                public Button() {
                    clear();
                }

                public static Button[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Button[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Button) sia.mergeFrom(new Button(), bArr);
                }

                public Button clear() {
                    this.title = "";
                    this.type = 0;
                    this.intent = 0;
                    this.url = "";
                    this.payload = "";
                    this.showLoading = false;
                    this.quickLocation = false;
                    this.contactId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iL = !this.title.equals("") ? uu3.l(1, this.title) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += uu3.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += uu3.f(3, i2);
                    }
                    if (!this.url.equals("")) {
                        iL += uu3.l(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        iL += uu3.l(5, this.payload);
                    }
                    if (this.showLoading) {
                        iL += uu3.a(6);
                    }
                    if (this.quickLocation) {
                        iL += uu3.a(7);
                    }
                    long j = this.contactId;
                    return j != 0 ? uu3.h(8, j) + iL : iL;
                }

                @Override // defpackage.sia
                public Button mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS != 0) {
                            if (iS == 10) {
                                this.title = su3Var.r();
                            } else if (iS == 16) {
                                int iP = su3Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        this.type = iP;
                                        break;
                                }
                            } else if (iS == 24) {
                                int iP2 = su3Var.p();
                                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                    this.intent = iP2;
                                }
                            } else if (iS == 34) {
                                this.url = su3Var.r();
                            } else if (iS == 42) {
                                this.payload = su3Var.r();
                            } else if (iS == 48) {
                                this.showLoading = su3Var.f();
                            } else if (iS == 56) {
                                this.quickLocation = su3Var.f();
                            } else if (iS == 64) {
                                this.contactId = su3Var.q();
                            } else if (!su3Var.u(iS)) {
                            }
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.title.equals("")) {
                        uu3Var.E(1, this.title);
                    }
                    int i = this.type;
                    if (i != 0) {
                        uu3Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        uu3Var.w(3, i2);
                    }
                    if (!this.url.equals("")) {
                        uu3Var.E(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        uu3Var.E(5, this.payload);
                    }
                    boolean z = this.showLoading;
                    if (z) {
                        uu3Var.r(6, z);
                    }
                    boolean z2 = this.quickLocation;
                    if (z2) {
                        uu3Var.r(7, z2);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        uu3Var.x(8, j);
                    }
                }

                public static Button parseFrom(su3 su3Var) throws IOException {
                    return new Button().mergeFrom(su3Var);
                }
            }

            public static final class Buttons extends sia {
                private static volatile Buttons[] _emptyArray;
                public Button[] button;

                public Buttons() {
                    clear();
                }

                public static Buttons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Buttons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Buttons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Buttons) sia.mergeFrom(new Buttons(), bArr);
                }

                public Buttons clear() {
                    this.button = Button.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    Button[] buttonArr = this.button;
                    int i = 0;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return i2;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            i2 = uu3.i(1, button) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.sia
                public Buttons mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int I = sb8.I(su3Var, 10);
                            Button[] buttonArr = this.button;
                            int length = buttonArr == null ? 0 : buttonArr.length;
                            int i = I + length;
                            Button[] buttonArr2 = new Button[i];
                            if (length != 0) {
                                System.arraycopy(buttonArr, 0, buttonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Button button = new Button();
                                buttonArr2[length] = button;
                                su3Var.j(button);
                                su3Var.s();
                                length++;
                            }
                            Button button2 = new Button();
                            buttonArr2[length] = button2;
                            su3Var.j(button2);
                            this.button = buttonArr2;
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    Button[] buttonArr = this.button;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            uu3Var.y(1, button);
                        }
                        i++;
                    }
                }

                public static Buttons parseFrom(su3 su3Var) throws IOException {
                    return new Buttons().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Call extends sia {
                public static final int AUDIO = 2;
                public static final int CANCELED = 2;
                public static final int HANGUP = 1;
                public static final int MISSED = 4;
                public static final int REJECTED = 3;
                public static final int UNKNOWN_CALL_TYPE = 0;
                public static final int UNKNOWN_HANGUP_TYPE = 0;
                public static final int VIDEO = 1;
                private static volatile Call[] _emptyArray;
                public int callType;
                public long[] contactIds;
                public String conversationId;
                public int duration;
                public long durationLong;
                public int hangupType;
                public String joinLink;

                public Call() {
                    clear();
                }

                public static Call[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Call[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Call parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Call) sia.mergeFrom(new Call(), bArr);
                }

                public Call clear() {
                    this.conversationId = "";
                    this.callType = 0;
                    this.hangupType = 0;
                    this.duration = 0;
                    this.contactIds = sb8.f;
                    this.durationLong = 0L;
                    this.joinLink = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = 0;
                    int iL = !this.conversationId.equals("") ? uu3.l(1, this.conversationId) : 0;
                    int i2 = this.callType;
                    if (i2 != 0) {
                        iL += uu3.f(2, i2);
                    }
                    int i3 = this.hangupType;
                    if (i3 != 0) {
                        iL += uu3.f(3, i3);
                    }
                    int i4 = this.duration;
                    if (i4 != 0) {
                        iL += uu3.f(4, i4);
                    }
                    long[] jArr2 = this.contactIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.contactIds;
                            if (i >= jArr.length) {
                                break;
                            }
                            iK += uu3.k(jArr[i]);
                            i++;
                        }
                        iL = iL + iK + jArr.length;
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        iL += uu3.h(6, j);
                    }
                    return !this.joinLink.equals("") ? uu3.l(7, this.joinLink) + iL : iL;
                }

                @Override // defpackage.sia
                public Call mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.conversationId = su3Var.r();
                        } else if (iS == 16) {
                            int iP = su3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2) {
                                this.callType = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = su3Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4) {
                                this.hangupType = iP2;
                            }
                        } else if (iS == 32) {
                            this.duration = su3Var.p();
                        } else if (iS == 40) {
                            int I = sb8.I(su3Var, 40);
                            long[] jArr = this.contactIds;
                            int length = jArr == null ? 0 : jArr.length;
                            int i = I + length;
                            long[] jArr2 = new long[i];
                            if (length != 0) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                            }
                            while (length < i - 1) {
                                jArr2[length] = su3Var.q();
                                su3Var.s();
                                length++;
                            }
                            jArr2[length] = su3Var.q();
                            this.contactIds = jArr2;
                        } else if (iS == 42) {
                            int iE = su3Var.e(su3Var.p());
                            int iC = su3Var.c();
                            int i2 = 0;
                            while (su3Var.b() > 0) {
                                su3Var.q();
                                i2++;
                            }
                            su3Var.t(iC);
                            long[] jArr3 = this.contactIds;
                            int length2 = jArr3 == null ? 0 : jArr3.length;
                            int i3 = i2 + length2;
                            long[] jArr4 = new long[i3];
                            if (length2 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                jArr4[length2] = su3Var.q();
                                length2++;
                            }
                            this.contactIds = jArr4;
                            su3Var.d(iE);
                        } else if (iS == 48) {
                            this.durationLong = su3Var.q();
                        } else if (iS == 58) {
                            this.joinLink = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.conversationId.equals("")) {
                        uu3Var.E(1, this.conversationId);
                    }
                    int i = this.callType;
                    if (i != 0) {
                        uu3Var.w(2, i);
                    }
                    int i2 = this.hangupType;
                    if (i2 != 0) {
                        uu3Var.w(3, i2);
                    }
                    int i3 = this.duration;
                    if (i3 != 0) {
                        uu3Var.w(4, i3);
                    }
                    long[] jArr = this.contactIds;
                    if (jArr != null && jArr.length > 0) {
                        int i4 = 0;
                        while (true) {
                            long[] jArr2 = this.contactIds;
                            if (i4 >= jArr2.length) {
                                break;
                            }
                            uu3Var.x(5, jArr2[i4]);
                            i4++;
                        }
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        uu3Var.x(6, j);
                    }
                    if (this.joinLink.equals("")) {
                        return;
                    }
                    uu3Var.E(7, this.joinLink);
                }

                public static Call parseFrom(su3 su3Var) throws IOException {
                    return new Call().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Contact extends sia {
                private static volatile Contact[] _emptyArray;
                public long contactId;
                public String firstName;
                public String lastName;
                public String localPhotoUrl;
                public String name;
                public String phone;
                public String photoUrl;
                public String vcfBody;

                public Contact() {
                    clear();
                }

                public static Contact[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Contact[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Contact) sia.mergeFrom(new Contact(), bArr);
                }

                public Contact clear() {
                    this.vcfBody = "";
                    this.contactId = 0L;
                    this.name = "";
                    this.phone = "";
                    this.photoUrl = "";
                    this.localPhotoUrl = "";
                    this.firstName = "";
                    this.lastName = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iL = !this.vcfBody.equals("") ? uu3.l(1, this.vcfBody) : 0;
                    long j = this.contactId;
                    if (j != 0) {
                        iL += uu3.h(2, j);
                    }
                    if (!this.name.equals("")) {
                        iL += uu3.l(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        iL += uu3.l(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        iL += uu3.l(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        iL += uu3.l(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        iL += uu3.l(7, this.firstName);
                    }
                    return !this.lastName.equals("") ? uu3.l(8, this.lastName) + iL : iL;
                }

                @Override // defpackage.sia
                public Contact mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.vcfBody = su3Var.r();
                        } else if (iS == 16) {
                            this.contactId = su3Var.q();
                        } else if (iS == 26) {
                            this.name = su3Var.r();
                        } else if (iS == 34) {
                            this.phone = su3Var.r();
                        } else if (iS == 42) {
                            this.photoUrl = su3Var.r();
                        } else if (iS == 50) {
                            this.localPhotoUrl = su3Var.r();
                        } else if (iS == 58) {
                            this.firstName = su3Var.r();
                        } else if (iS == 66) {
                            this.lastName = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.vcfBody.equals("")) {
                        uu3Var.E(1, this.vcfBody);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        uu3Var.x(2, j);
                    }
                    if (!this.name.equals("")) {
                        uu3Var.E(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        uu3Var.E(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        uu3Var.E(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        uu3Var.E(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        uu3Var.E(7, this.firstName);
                    }
                    if (this.lastName.equals("")) {
                        return;
                    }
                    uu3Var.E(8, this.lastName);
                }

                public static Contact parseFrom(su3 su3Var) throws IOException {
                    return new Contact().mergeFrom(su3Var);
                }
            }

            public static final class Control extends sia {
                public static final int ADD = 2;
                public static final int BOT_STARTED = 11;
                public static final int CHANNEL_TYPE = 2;
                public static final int CHAT_TYPE = 1;
                public static final int COMMENTS_START = 12;
                public static final int DIALOG = 4;
                public static final int GROUP_CHAT_TYPE = 3;
                public static final int HELLO = 7;
                public static final int ICON = 6;
                public static final int JOIN_BY_LINK = 9;
                public static final int LEAVE = 4;
                public static final int NEW = 1;
                public static final int PIN = 10;
                public static final int REMOVE = 3;
                public static final int SYSTEM = 8;
                public static final int TITLE = 5;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                private static volatile Control[] _emptyArray;
                public int chatType;
                public Rect crop;
                public int event;
                public String fullUrl;
                public String iconToken;
                public String message;
                public long pinnedMessageId;
                public long pinnedMessageServerId;
                public String shortMessage;
                public boolean showHistory;
                public String startPayload;
                public String title;
                public String url;
                public long userId;
                public long[] userIds;

                public Control() {
                    clear();
                }

                public static Control[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Control[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Control) sia.mergeFrom(new Control(), bArr);
                }

                public Control clear() {
                    this.event = 0;
                    this.userId = 0L;
                    this.userIds = sb8.f;
                    this.title = "";
                    this.iconToken = "";
                    this.url = "";
                    this.crop = null;
                    this.message = "";
                    this.shortMessage = "";
                    this.showHistory = false;
                    this.chatType = 0;
                    this.fullUrl = "";
                    this.pinnedMessageId = 0L;
                    this.pinnedMessageServerId = 0L;
                    this.startPayload = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = this.event;
                    int i2 = 0;
                    int iF = i != 0 ? uu3.f(1, i) : 0;
                    long j = this.userId;
                    if (j != 0) {
                        iF += uu3.h(2, j);
                    }
                    long[] jArr2 = this.userIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.userIds;
                            if (i2 >= jArr.length) {
                                break;
                            }
                            iK += uu3.k(jArr[i2]);
                            i2++;
                        }
                        iF = iF + iK + jArr.length;
                    }
                    if (!this.title.equals("")) {
                        iF += uu3.l(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        iF += uu3.l(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        iF += uu3.l(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        iF += uu3.i(7, rect);
                    }
                    if (!this.message.equals("")) {
                        iF += uu3.l(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        iF += uu3.l(9, this.shortMessage);
                    }
                    if (this.showHistory) {
                        iF += uu3.a(10);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        iF += uu3.f(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        iF += uu3.l(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        iF += uu3.h(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        iF += uu3.h(14, j3);
                    }
                    return !this.startPayload.equals("") ? uu3.l(16, this.startPayload) + iF : iF;
                }

                @Override // defpackage.sia
                public Control mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                int iP = su3Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.event = iP;
                                        break;
                                }
                                break;
                            case 16:
                                this.userId = su3Var.q();
                                break;
                            case 24:
                                int I = sb8.I(su3Var, 24);
                                long[] jArr = this.userIds;
                                int length = jArr == null ? 0 : jArr.length;
                                int i = I + length;
                                long[] jArr2 = new long[i];
                                if (length != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    jArr2[length] = su3Var.q();
                                    su3Var.s();
                                    length++;
                                }
                                jArr2[length] = su3Var.q();
                                this.userIds = jArr2;
                                break;
                            case 26:
                                int iE = su3Var.e(su3Var.p());
                                int iC = su3Var.c();
                                int i2 = 0;
                                while (su3Var.b() > 0) {
                                    su3Var.q();
                                    i2++;
                                }
                                su3Var.t(iC);
                                long[] jArr3 = this.userIds;
                                int length2 = jArr3 == null ? 0 : jArr3.length;
                                int i3 = i2 + length2;
                                long[] jArr4 = new long[i3];
                                if (length2 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                                }
                                while (length2 < i3) {
                                    jArr4[length2] = su3Var.q();
                                    length2++;
                                }
                                this.userIds = jArr4;
                                su3Var.d(iE);
                                break;
                            case 34:
                                this.title = su3Var.r();
                                break;
                            case 42:
                                this.iconToken = su3Var.r();
                                break;
                            case 50:
                                this.url = su3Var.r();
                                break;
                            case 58:
                                if (this.crop == null) {
                                    this.crop = new Rect();
                                }
                                su3Var.j(this.crop);
                                break;
                            case 66:
                                this.message = su3Var.r();
                                break;
                            case 74:
                                this.shortMessage = su3Var.r();
                                break;
                            case 80:
                                this.showHistory = su3Var.f();
                                break;
                            case 88:
                                int iP2 = su3Var.p();
                                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4) {
                                    this.chatType = iP2;
                                }
                                break;
                            case 98:
                                this.fullUrl = su3Var.r();
                                break;
                            case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                                this.pinnedMessageId = su3Var.q();
                                break;
                            case 112:
                                this.pinnedMessageServerId = su3Var.q();
                                break;
                            case 130:
                                this.startPayload = su3Var.r();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    int i = this.event;
                    if (i != 0) {
                        uu3Var.w(1, i);
                    }
                    long j = this.userId;
                    if (j != 0) {
                        uu3Var.x(2, j);
                    }
                    long[] jArr = this.userIds;
                    if (jArr != null && jArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            long[] jArr2 = this.userIds;
                            if (i2 >= jArr2.length) {
                                break;
                            }
                            uu3Var.x(3, jArr2[i2]);
                            i2++;
                        }
                    }
                    if (!this.title.equals("")) {
                        uu3Var.E(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        uu3Var.E(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        uu3Var.E(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        uu3Var.y(7, rect);
                    }
                    if (!this.message.equals("")) {
                        uu3Var.E(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        uu3Var.E(9, this.shortMessage);
                    }
                    boolean z = this.showHistory;
                    if (z) {
                        uu3Var.r(10, z);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        uu3Var.w(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        uu3Var.E(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        uu3Var.x(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        uu3Var.x(14, j3);
                    }
                    if (this.startPayload.equals("")) {
                        return;
                    }
                    uu3Var.E(16, this.startPayload);
                }

                public static Control parseFrom(su3 su3Var) throws IOException {
                    return new Control().mergeFrom(su3Var);
                }
            }

            public static final class File extends sia {
                private static volatile File[] _emptyArray;
                public long fileId;
                public String name;
                public Attach preview;
                public long size;
                public String token;

                public File() {
                    clear();
                }

                public static File[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new File[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (File) sia.mergeFrom(new File(), bArr);
                }

                public File clear() {
                    this.fileId = 0L;
                    this.size = 0L;
                    this.name = "";
                    this.preview = null;
                    this.token = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.fileId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    long j2 = this.size;
                    if (j2 != 0) {
                        iH += uu3.h(2, j2);
                    }
                    if (!this.name.equals("")) {
                        iH += uu3.l(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        iH += uu3.i(4, attach);
                    }
                    return !this.token.equals("") ? uu3.l(5, this.token) + iH : iH;
                }

                @Override // defpackage.sia
                public File mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.fileId = su3Var.q();
                        } else if (iS == 16) {
                            this.size = su3Var.q();
                        } else if (iS == 26) {
                            this.name = su3Var.r();
                        } else if (iS == 34) {
                            if (this.preview == null) {
                                this.preview = new Attach();
                            }
                            su3Var.j(this.preview);
                        } else if (iS == 42) {
                            this.token = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.fileId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    long j2 = this.size;
                    if (j2 != 0) {
                        uu3Var.x(2, j2);
                    }
                    if (!this.name.equals("")) {
                        uu3Var.E(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        uu3Var.y(4, attach);
                    }
                    if (this.token.equals("")) {
                        return;
                    }
                    uu3Var.E(5, this.token);
                }

                public static File parseFrom(su3 su3Var) throws IOException {
                    return new File().mergeFrom(su3Var);
                }
            }

            public static final class InlineKeyboard extends sia {
                private static volatile InlineKeyboard[] _emptyArray;
                public Buttons[] buttons;
                public String callbackId;

                public InlineKeyboard() {
                    clear();
                }

                public static InlineKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new InlineKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static InlineKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (InlineKeyboard) sia.mergeFrom(new InlineKeyboard(), bArr);
                }

                public InlineKeyboard clear() {
                    this.buttons = Buttons.emptyArray();
                    this.callbackId = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    Buttons[] buttonsArr = this.buttons;
                    int i = 0;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                i2 = uu3.i(1, buttons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return !this.callbackId.equals("") ? uu3.l(2, this.callbackId) + i : i;
                }

                @Override // defpackage.sia
                public InlineKeyboard mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int I = sb8.I(su3Var, 10);
                            Buttons[] buttonsArr = this.buttons;
                            int length = buttonsArr == null ? 0 : buttonsArr.length;
                            int i = I + length;
                            Buttons[] buttonsArr2 = new Buttons[i];
                            if (length != 0) {
                                System.arraycopy(buttonsArr, 0, buttonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Buttons buttons = new Buttons();
                                buttonsArr2[length] = buttons;
                                su3Var.j(buttons);
                                su3Var.s();
                                length++;
                            }
                            Buttons buttons2 = new Buttons();
                            buttonsArr2[length] = buttons2;
                            su3Var.j(buttons2);
                            this.buttons = buttonsArr2;
                        } else if (iS == 18) {
                            this.callbackId = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    Buttons[] buttonsArr = this.buttons;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                uu3Var.y(1, buttons);
                            }
                            i++;
                        }
                    }
                    if (this.callbackId.equals("")) {
                        return;
                    }
                    uu3Var.E(2, this.callbackId);
                }

                public static InlineKeyboard parseFrom(su3 su3Var) throws IOException {
                    return new InlineKeyboard().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Location extends sia {
                private static volatile Location[] _emptyArray;
                public float accuracy;
                public double altitude;
                public float bearing;
                public boolean corrupted;
                public String deviceId;
                public long endTime;
                public LocationInfo lastLocation;
                public double latitude;
                public long livePeriod;
                public double longitude;
                public float speed;
                public long startTime;
                public LocationInfo[] track;
                public long ttl;
                public float zoom;

                public Location() {
                    clear();
                }

                public static Location[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Location[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Location) sia.mergeFrom(new Location(), bArr);
                }

                public Location clear() {
                    this.latitude = 0.0d;
                    this.longitude = 0.0d;
                    this.zoom = 0.0f;
                    this.ttl = 0L;
                    this.livePeriod = 0L;
                    this.track = LocationInfo.emptyArray();
                    this.deviceId = "";
                    this.lastLocation = null;
                    this.altitude = 0.0d;
                    this.accuracy = 0.0f;
                    this.bearing = 0.0f;
                    this.speed = 0.0f;
                    this.corrupted = false;
                    this.startTime = 0L;
                    this.endTime = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int i = 0;
                    int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? uu3.c(1) : 0;
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        iC += uu3.c(2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        iC += uu3.e(3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        iC += uu3.h(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        iC += uu3.h(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                iC = uu3.i(6, locationInfo) + iC;
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        iC += uu3.l(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        iC += uu3.i(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        iC += uu3.c(9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        iC += uu3.e(10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        iC += uu3.e(11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        iC += uu3.e(12);
                    }
                    if (this.corrupted) {
                        iC += uu3.a(13);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iC += uu3.h(14, j3);
                    }
                    long j4 = this.endTime;
                    return j4 != 0 ? uu3.h(15, j4) + iC : iC;
                }

                @Override // defpackage.sia
                public Location mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 9:
                                this.latitude = su3Var.h();
                                break;
                            case 17:
                                this.longitude = su3Var.h();
                                break;
                            case 29:
                                this.zoom = su3Var.i();
                                break;
                            case 32:
                                this.ttl = su3Var.q();
                                break;
                            case 40:
                                this.livePeriod = su3Var.q();
                                break;
                            case 50:
                                int I = sb8.I(su3Var, 50);
                                LocationInfo[] locationInfoArr = this.track;
                                int length = locationInfoArr == null ? 0 : locationInfoArr.length;
                                int i = I + length;
                                LocationInfo[] locationInfoArr2 = new LocationInfo[i];
                                if (length != 0) {
                                    System.arraycopy(locationInfoArr, 0, locationInfoArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    LocationInfo locationInfo = new LocationInfo();
                                    locationInfoArr2[length] = locationInfo;
                                    su3Var.j(locationInfo);
                                    su3Var.s();
                                    length++;
                                }
                                LocationInfo locationInfo2 = new LocationInfo();
                                locationInfoArr2[length] = locationInfo2;
                                su3Var.j(locationInfo2);
                                this.track = locationInfoArr2;
                                break;
                            case 58:
                                this.deviceId = su3Var.r();
                                break;
                            case 66:
                                if (this.lastLocation == null) {
                                    this.lastLocation = new LocationInfo();
                                }
                                su3Var.j(this.lastLocation);
                                break;
                            case 73:
                                this.altitude = su3Var.h();
                                break;
                            case 85:
                                this.accuracy = su3Var.i();
                                break;
                            case 93:
                                this.bearing = su3Var.i();
                                break;
                            case 101:
                                this.speed = su3Var.i();
                                break;
                            case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                                this.corrupted = su3Var.f();
                                break;
                            case 112:
                                this.startTime = su3Var.q();
                                break;
                            case 120:
                                this.endTime = su3Var.q();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                        uu3Var.t(1, this.latitude);
                    }
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        uu3Var.t(2, this.longitude);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(3, this.zoom);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        uu3Var.x(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        uu3Var.x(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        int i = 0;
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                uu3Var.y(6, locationInfo);
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        uu3Var.E(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        uu3Var.y(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        uu3Var.t(9, this.altitude);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(10, this.accuracy);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(11, this.bearing);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(12, this.speed);
                    }
                    boolean z = this.corrupted;
                    if (z) {
                        uu3Var.r(13, z);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        uu3Var.x(14, j3);
                    }
                    long j4 = this.endTime;
                    if (j4 != 0) {
                        uu3Var.x(15, j4);
                    }
                }

                public static Location parseFrom(su3 su3Var) throws IOException {
                    return new Location().mergeFrom(su3Var);
                }
            }

            public static final class Photo extends sia {
                private static volatile Photo[] _emptyArray;
                public String baseUrl;
                public boolean gif;
                public int height;
                public String mp4Url;
                public long photoId;
                public String photoToken;
                public String photoUrl;
                public byte[] previewData;
                public String previewUrl;
                public byte[] thumbhashData;
                public int width;

                public Photo() {
                    clear();
                }

                public static Photo[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Photo[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Photo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Photo) sia.mergeFrom(new Photo(), bArr);
                }

                public Photo clear() {
                    this.photoUrl = "";
                    this.width = 0;
                    this.height = 0;
                    this.gif = false;
                    byte[] bArr = sb8.i;
                    this.previewData = bArr;
                    this.photoToken = "";
                    this.photoId = 0L;
                    this.mp4Url = "";
                    this.baseUrl = "";
                    this.previewUrl = "";
                    this.thumbhashData = bArr;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iL = !this.photoUrl.equals("") ? uu3.l(1, this.photoUrl) : 0;
                    int i = this.width;
                    if (i != 0) {
                        iL += uu3.f(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        iL += uu3.f(3, i2);
                    }
                    if (this.gif) {
                        iL += uu3.a(4);
                    }
                    byte[] bArr = this.previewData;
                    byte[] bArr2 = sb8.i;
                    if (!Arrays.equals(bArr, bArr2)) {
                        iL += uu3.b(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        iL += uu3.l(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        iL += uu3.h(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        iL += uu3.l(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        iL += uu3.l(10, this.baseUrl);
                    }
                    if (!this.previewUrl.equals("")) {
                        iL += uu3.l(12, this.previewUrl);
                    }
                    return !Arrays.equals(this.thumbhashData, bArr2) ? uu3.b(13, this.thumbhashData) + iL : iL;
                }

                @Override // defpackage.sia
                public Photo mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 10:
                                this.photoUrl = su3Var.r();
                                break;
                            case 16:
                                this.width = su3Var.p();
                                break;
                            case 24:
                                this.height = su3Var.p();
                                break;
                            case 32:
                                this.gif = su3Var.f();
                                break;
                            case 42:
                                this.previewData = su3Var.g();
                                break;
                            case 50:
                                this.photoToken = su3Var.r();
                                break;
                            case 56:
                                this.photoId = su3Var.q();
                                break;
                            case 66:
                                this.mp4Url = su3Var.r();
                                break;
                            case 82:
                                this.baseUrl = su3Var.r();
                                break;
                            case 98:
                                this.previewUrl = su3Var.r();
                                break;
                            case 106:
                                this.thumbhashData = su3Var.g();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.photoUrl.equals("")) {
                        uu3Var.E(1, this.photoUrl);
                    }
                    int i = this.width;
                    if (i != 0) {
                        uu3Var.w(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        uu3Var.w(3, i2);
                    }
                    boolean z = this.gif;
                    if (z) {
                        uu3Var.r(4, z);
                    }
                    byte[] bArr = this.previewData;
                    byte[] bArr2 = sb8.i;
                    if (!Arrays.equals(bArr, bArr2)) {
                        uu3Var.s(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        uu3Var.E(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        uu3Var.x(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        uu3Var.E(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        uu3Var.E(10, this.baseUrl);
                    }
                    if (!this.previewUrl.equals("")) {
                        uu3Var.E(12, this.previewUrl);
                    }
                    if (Arrays.equals(this.thumbhashData, bArr2)) {
                        return;
                    }
                    uu3Var.s(13, this.thumbhashData);
                }

                public static Photo parseFrom(su3 su3Var) throws IOException {
                    return new Photo().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Present extends sia {
                public static final int ACCEPTED = 3;
                public static final int ACCEPTING = 5;
                public static final int DECLINED = 4;
                public static final int NEW = 1;
                public static final int RECEIVED = 2;
                public static final int UNKNOWN = 0;
                private static volatile Present[] _emptyArray;
                public long metadataId;
                public long presentId;
                public String presentJson;
                public long receiverId;
                public long senderId;
                public int status;

                public Present() {
                    clear();
                }

                public static Present[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Present[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Present parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Present) sia.mergeFrom(new Present(), bArr);
                }

                public Present clear() {
                    this.presentId = 0L;
                    this.metadataId = 0L;
                    this.senderId = 0L;
                    this.receiverId = 0L;
                    this.status = 0;
                    this.presentJson = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.presentId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        iH += uu3.h(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        iH += uu3.h(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        iH += uu3.h(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        iH += uu3.f(5, i);
                    }
                    return !this.presentJson.equals("") ? uu3.l(6, this.presentJson) + iH : iH;
                }

                @Override // defpackage.sia
                public Present mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.presentId = su3Var.q();
                        } else if (iS == 16) {
                            this.metadataId = su3Var.q();
                        } else if (iS == 24) {
                            this.senderId = su3Var.q();
                        } else if (iS == 32) {
                            this.receiverId = su3Var.q();
                        } else if (iS == 40) {
                            int iP = su3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                                this.status = iP;
                            }
                        } else if (iS == 50) {
                            this.presentJson = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.presentId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        uu3Var.x(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        uu3Var.x(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        uu3Var.x(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        uu3Var.w(5, i);
                    }
                    if (this.presentJson.equals("")) {
                        return;
                    }
                    uu3Var.E(6, this.presentJson);
                }

                public static Present parseFrom(su3 su3Var) throws IOException {
                    return new Present().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Rect extends sia {
                private static volatile Rect[] _emptyArray;
                public float bottom;
                public float left;
                public float right;
                public float top;

                public Rect() {
                    clear();
                }

                public static Rect[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Rect[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Rect) sia.mergeFrom(new Rect(), bArr);
                }

                public Rect clear() {
                    this.left = 0.0f;
                    this.top = 0.0f;
                    this.right = 0.0f;
                    this.bottom = 0.0f;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? uu3.e(1) : 0;
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        iE += uu3.e(2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        iE += uu3.e(3);
                    }
                    return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? uu3.e(4) + iE : iE;
                }

                @Override // defpackage.sia
                public Rect mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 13) {
                            this.left = su3Var.i();
                        } else if (iS == 21) {
                            this.top = su3Var.i();
                        } else if (iS == 29) {
                            this.right = su3Var.i();
                        } else if (iS == 37) {
                            this.bottom = su3Var.i();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(1, this.left);
                    }
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(2, this.top);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(3, this.right);
                    }
                    if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                        uu3Var.v(4, this.bottom);
                    }
                }

                public static Rect parseFrom(su3 su3Var) throws IOException {
                    return new Rect().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class ReplyButton extends sia {
                public static final int CONTACT = 2;
                public static final int DEFAULT = 0;
                public static final int IMAGE = 1;
                public static final int LOCATION = 3;
                public static final int MESSAGE = 0;
                public static final int NEGATIVE = 2;
                public static final int POSITIVE = 1;
                public static final int UNKNOWN = 4;
                public static final int UNKNOWN_INTENT = 3;
                private static volatile ReplyButton[] _emptyArray;
                public Photo image;
                public int intent;
                public long outgoingMessageId;
                public String text;
                public int type;

                public ReplyButton() {
                    clear();
                }

                public static ReplyButton[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButton[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButton) sia.mergeFrom(new ReplyButton(), bArr);
                }

                public ReplyButton clear() {
                    this.text = "";
                    this.type = 0;
                    this.intent = 0;
                    this.image = null;
                    this.outgoingMessageId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iL = !this.text.equals("") ? uu3.l(1, this.text) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += uu3.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += uu3.f(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iL += uu3.i(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    return j != 0 ? uu3.h(5, j) + iL : iL;
                }

                @Override // defpackage.sia
                public ReplyButton mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.text = su3Var.r();
                        } else if (iS == 16) {
                            int iP = su3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                this.type = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = su3Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                this.intent = iP2;
                            }
                        } else if (iS == 34) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            su3Var.j(this.image);
                        } else if (iS == 40) {
                            this.outgoingMessageId = su3Var.q();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.text.equals("")) {
                        uu3Var.E(1, this.text);
                    }
                    int i = this.type;
                    if (i != 0) {
                        uu3Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        uu3Var.w(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        uu3Var.y(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    if (j != 0) {
                        uu3Var.x(5, j);
                    }
                }

                public static ReplyButton parseFrom(su3 su3Var) throws IOException {
                    return new ReplyButton().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class ReplyButtons extends sia {
                private static volatile ReplyButtons[] _emptyArray;
                public ReplyButton[] replyButton;

                public ReplyButtons() {
                    clear();
                }

                public static ReplyButtons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButtons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButtons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButtons) sia.mergeFrom(new ReplyButtons(), bArr);
                }

                public ReplyButtons clear() {
                    this.replyButton = ReplyButton.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    int i = 0;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return i2;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            i2 = uu3.i(1, replyButton) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.sia
                public ReplyButtons mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int I = sb8.I(su3Var, 10);
                            ReplyButton[] replyButtonArr = this.replyButton;
                            int length = replyButtonArr == null ? 0 : replyButtonArr.length;
                            int i = I + length;
                            ReplyButton[] replyButtonArr2 = new ReplyButton[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonArr, 0, replyButtonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButton replyButton = new ReplyButton();
                                replyButtonArr2[length] = replyButton;
                                su3Var.j(replyButton);
                                su3Var.s();
                                length++;
                            }
                            ReplyButton replyButton2 = new ReplyButton();
                            replyButtonArr2[length] = replyButton2;
                            su3Var.j(replyButton2);
                            this.replyButton = replyButtonArr2;
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            uu3Var.y(1, replyButton);
                        }
                        i++;
                    }
                }

                public static ReplyButtons parseFrom(su3 su3Var) throws IOException {
                    return new ReplyButtons().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class ReplyKeyboard extends sia {
                private static volatile ReplyKeyboard[] _emptyArray;
                public ReplyButtons[] buttons;
                public boolean defaultInputDisabled;

                public ReplyKeyboard() {
                    clear();
                }

                public static ReplyKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyKeyboard) sia.mergeFrom(new ReplyKeyboard(), bArr);
                }

                public ReplyKeyboard clear() {
                    this.buttons = ReplyButtons.emptyArray();
                    this.defaultInputDisabled = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    int i = 0;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                i2 = uu3.i(1, replyButtons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return this.defaultInputDisabled ? uu3.a(2) + i : i;
                }

                @Override // defpackage.sia
                public ReplyKeyboard mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int I = sb8.I(su3Var, 10);
                            ReplyButtons[] replyButtonsArr = this.buttons;
                            int length = replyButtonsArr == null ? 0 : replyButtonsArr.length;
                            int i = I + length;
                            ReplyButtons[] replyButtonsArr2 = new ReplyButtons[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonsArr, 0, replyButtonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButtons replyButtons = new ReplyButtons();
                                replyButtonsArr2[length] = replyButtons;
                                su3Var.j(replyButtons);
                                su3Var.s();
                                length++;
                            }
                            ReplyButtons replyButtons2 = new ReplyButtons();
                            replyButtonsArr2[length] = replyButtons2;
                            su3Var.j(replyButtons2);
                            this.buttons = replyButtonsArr2;
                        } else if (iS == 16) {
                            this.defaultInputDisabled = su3Var.f();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                uu3Var.y(1, replyButtons);
                            }
                            i++;
                        }
                    }
                    boolean z = this.defaultInputDisabled;
                    if (z) {
                        uu3Var.r(2, z);
                    }
                }

                public static ReplyKeyboard parseFrom(su3 su3Var) throws IOException {
                    return new ReplyKeyboard().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class SendAction extends sia {
                private static volatile SendAction[] _emptyArray;
                public String actionDestinationType;
                public String backgroundColor;
                public String contentType;
                public String context;
                public String nextContentType;
                public String textColor;
                public String title;

                public SendAction() {
                    clear();
                }

                public static SendAction[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new SendAction[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static SendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (SendAction) sia.mergeFrom(new SendAction(), bArr);
                }

                public SendAction clear() {
                    this.contentType = "";
                    this.title = "";
                    this.nextContentType = "";
                    this.textColor = "";
                    this.backgroundColor = "";
                    this.context = "";
                    this.actionDestinationType = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    int iL = !this.contentType.equals("") ? uu3.l(1, this.contentType) : 0;
                    if (!this.title.equals("")) {
                        iL += uu3.l(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        iL += uu3.l(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        iL += uu3.l(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        iL += uu3.l(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        iL += uu3.l(6, this.context);
                    }
                    return !this.actionDestinationType.equals("") ? uu3.l(7, this.actionDestinationType) + iL : iL;
                }

                @Override // defpackage.sia
                public SendAction mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.contentType = su3Var.r();
                        } else if (iS == 18) {
                            this.title = su3Var.r();
                        } else if (iS == 26) {
                            this.nextContentType = su3Var.r();
                        } else if (iS == 34) {
                            this.textColor = su3Var.r();
                        } else if (iS == 42) {
                            this.backgroundColor = su3Var.r();
                        } else if (iS == 50) {
                            this.context = su3Var.r();
                        } else if (iS == 58) {
                            this.actionDestinationType = su3Var.r();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    if (!this.contentType.equals("")) {
                        uu3Var.E(1, this.contentType);
                    }
                    if (!this.title.equals("")) {
                        uu3Var.E(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        uu3Var.E(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        uu3Var.E(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        uu3Var.E(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        uu3Var.E(6, this.context);
                    }
                    if (this.actionDestinationType.equals("")) {
                        return;
                    }
                    uu3Var.E(7, this.actionDestinationType);
                }

                public static SendAction parseFrom(su3 su3Var) throws IOException {
                    return new SendAction().mergeFrom(su3Var);
                }
            }

            /* JADX INFO: loaded from: classes3.dex */
            public static final class Share extends sia {
                private static volatile Share[] _emptyArray;
                public boolean contentLevel;
                public boolean deleted;
                public String description;
                public String host;
                public Photo image;
                public Attach media;
                public long shareId;
                public String title;
                public String token;
                public String url;

                public Share() {
                    clear();
                }

                public static Share[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Share[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Share parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Share) sia.mergeFrom(new Share(), bArr);
                }

                public Share clear() {
                    this.shareId = 0L;
                    this.token = "";
                    this.url = "";
                    this.title = "";
                    this.description = "";
                    this.host = "";
                    this.image = null;
                    this.media = null;
                    this.deleted = false;
                    this.contentLevel = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    long j = this.shareId;
                    int iH = j != 0 ? uu3.h(1, j) : 0;
                    if (!this.token.equals("")) {
                        iH += uu3.l(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        iH += uu3.l(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        iH += uu3.l(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        iH += uu3.l(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        iH += uu3.l(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iH += uu3.i(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        iH += uu3.i(8, attach);
                    }
                    if (this.deleted) {
                        iH += uu3.a(9);
                    }
                    return this.contentLevel ? uu3.a(10) + iH : iH;
                }

                @Override // defpackage.sia
                public Share mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.shareId = su3Var.q();
                                break;
                            case 18:
                                this.token = su3Var.r();
                                break;
                            case 26:
                                this.url = su3Var.r();
                                break;
                            case 34:
                                this.title = su3Var.r();
                                break;
                            case 42:
                                this.description = su3Var.r();
                                break;
                            case 50:
                                this.host = su3Var.r();
                                break;
                            case 58:
                                if (this.image == null) {
                                    this.image = new Photo();
                                }
                                su3Var.j(this.image);
                                break;
                            case 66:
                                if (this.media == null) {
                                    this.media = new Attach();
                                }
                                su3Var.j(this.media);
                                break;
                            case 72:
                                this.deleted = su3Var.f();
                                break;
                            case 80:
                                this.contentLevel = su3Var.f();
                                break;
                            default:
                                if (!su3Var.u(iS)) {
                                }
                                break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    long j = this.shareId;
                    if (j != 0) {
                        uu3Var.x(1, j);
                    }
                    if (!this.token.equals("")) {
                        uu3Var.E(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        uu3Var.E(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        uu3Var.E(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        uu3Var.E(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        uu3Var.E(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        uu3Var.y(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        uu3Var.y(8, attach);
                    }
                    boolean z = this.deleted;
                    if (z) {
                        uu3Var.r(9, z);
                    }
                    boolean z2 = this.contentLevel;
                    if (z2) {
                        uu3Var.r(10, z2);
                    }
                }

                public static Share parseFrom(su3 su3Var) throws IOException {
                    return new Share().mergeFrom(su3Var);
                }
            }

            public static Attach parseFrom(su3 su3Var) throws IOException {
                return new Attach().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class LocationInfo extends sia {
            private static volatile LocationInfo[] _emptyArray;
            public float accuracy;
            public double altitude;
            public float bearing;
            public double latitude;
            public double longitude;
            public float speed;
            public long time;

            public LocationInfo() {
                clear();
            }

            public static LocationInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LocationInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LocationInfo) sia.mergeFrom(new LocationInfo(), bArr);
            }

            public LocationInfo clear() {
                this.latitude = 0.0d;
                this.longitude = 0.0d;
                this.time = 0L;
                this.altitude = 0.0d;
                this.accuracy = 0.0f;
                this.bearing = 0.0f;
                this.speed = 0.0f;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? uu3.c(1) : 0;
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    iC += uu3.c(2);
                }
                long j = this.time;
                if (j != 0) {
                    iC += uu3.h(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    iC += uu3.c(4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    iC += uu3.e(5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    iC += uu3.e(6);
                }
                return Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f) ? uu3.e(7) + iC : iC;
            }

            @Override // defpackage.sia
            public LocationInfo mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 9) {
                        this.latitude = su3Var.h();
                    } else if (iS == 17) {
                        this.longitude = su3Var.h();
                    } else if (iS == 24) {
                        this.time = su3Var.q();
                    } else if (iS == 33) {
                        this.altitude = su3Var.h();
                    } else if (iS == 45) {
                        this.accuracy = su3Var.i();
                    } else if (iS == 53) {
                        this.bearing = su3Var.i();
                    } else if (iS == 61) {
                        this.speed = su3Var.i();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                    uu3Var.t(1, this.latitude);
                }
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    uu3Var.t(2, this.longitude);
                }
                long j = this.time;
                if (j != 0) {
                    uu3Var.x(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    uu3Var.t(4, this.altitude);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    uu3Var.v(5, this.accuracy);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    uu3Var.v(6, this.bearing);
                }
                if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                    uu3Var.v(7, this.speed);
                }
            }

            public static LocationInfo parseFrom(su3 su3Var) throws IOException {
                return new LocationInfo().mergeFrom(su3Var);
            }
        }

        public static Attaches parseFrom(su3 su3Var) throws IOException {
            return new Attaches().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Chat extends sia {
        public static final int ACTIVE = 0;
        public static final int BLOCKED = 7;
        public static final int CHANGE_PARTICIPANT = 2;
        public static final int CHANNEL = 2;
        public static final int CHAT = 1;
        public static final int CLOSED = 5;
        public static final int COMMENTS = 4;
        public static final int DIALOG = 0;
        public static final int GROUP_CHAT = 3;
        public static final int HIDDEN = 6;
        public static final int ICON = 1;
        public static final int LEAVING = 2;
        public static final int LED = 2;
        public static final int LEFT = 1;
        public static final int PIN_MESSAGE = 3;
        public static final int PRIVATE = 1;
        public static final int PUBLIC = 0;
        public static final int REMOVED = 3;
        public static final int REMOVING = 4;
        public static final int SOUND = 0;
        public static final int TITLE = 0;
        public static final int VIBRATION = 1;
        private static volatile Chat[] _emptyArray;
        public int accessType;
        public Map<Long, AdminParticipant> adminParticipants;
        public long[] admins;
        public String baseIconUrl;
        public String baseRawIconUrl;
        public int blockedParticipantsCount;
        public BotsInfo botsInfo;
        public ChannelInfo channelInfo;
        public long[] chatFoldersIds;
        public ChatOptions chatOptions;
        public ChatReactionsSettings chatReactionsSettings;
        public ChatSettings chatSettings;
        public ChatSubject chatSubject;
        public Chunk[] chunk;
        public long cid;
        public int commentsBlacklistCount;
        public long created;
        public Chunk[] delayedChunk;
        public String description;
        public byte[] draft;
        public long draftUpdateTime;
        public long draftUpdateTimeForSyncLogic;
        public long firstMessageId;
        public int flagsSettings;
        public GroupChatInfo groupChatInfo;
        public boolean hidePinnedMessage;
        public long invitedBy;
        public long joinRequestTime;
        public long joinTime;
        public long lastDelayedLoadTime;
        public long lastDelayedUpdateTime;
        public long lastEventTime;
        public long lastFireDelayedErrorTime;
        public long lastMentionMessageId;
        public long lastMessageId;
        public long lastOpenNewMessages;
        public int lastOpenPositionOffset;
        public long lastOpenPositionTime;
        public long lastOpenReadMark;
        public PushMessage lastPushMessage;
        public long lastReactedMessageId;
        public String lastReaction;
        public long lastSearchClickTime;
        public long lastWriteTime;
        public String link;
        public Map<Long, Long> liveLocationMessageIds;
        public LiveStream liveStream;
        public long liveStreamUpdateTime;
        public int[] localChanges;
        public boolean markedAsUnread;
        public ChatMedia mediaAll;
        public ChatMedia mediaAudio;
        public ChatMedia mediaAudioVideoMsg;
        public ChatMedia mediaFiles;
        public ChatMedia mediaLocations;
        public ChatMedia mediaMusic;
        public ChatMedia mediaPhotoVideo;
        public ChatMedia mediaShare;
        public int messagesTtlSec;
        public long modified;
        public int newMessages;
        public long owner;
        public int participantSettings;
        public Map<Long, Long> participants;
        public int participantsCount;
        public int pendingJoinRequestsCount;
        public long pinnedMessageId;
        public int restrictions;
        public Section[] sections;
        public long serverId;
        public int status;
        public String[] stickersOrder;
        public long stickersSyncTime;
        public String title;
        public int type;
        public long unbindOkPanelCloseTime;
        public boolean unreadPin;
        public boolean unreadReply;
        public VideoConversation videoConversation;

        public Chat() {
            clear();
        }

        public static Chat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Chat[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Chat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Chat) sia.mergeFrom(new Chat(), bArr);
        }

        public Chat clear() {
            this.serverId = 0L;
            this.type = 0;
            this.status = 0;
            this.owner = 0L;
            this.participants = null;
            this.created = 0L;
            this.title = "";
            this.lastMessageId = 0L;
            this.lastEventTime = 0L;
            this.cid = 0L;
            this.newMessages = 0;
            this.chunk = Chunk.emptyArray();
            this.chatSettings = null;
            this.mediaAll = null;
            this.firstMessageId = 0L;
            this.sections = Section.emptyArray();
            this.stickersOrder = sb8.h;
            this.stickersSyncTime = 0L;
            this.localChanges = sb8.e;
            this.channelInfo = null;
            this.accessType = 0;
            this.link = "";
            this.chatSubject = null;
            this.restrictions = 0;
            this.groupChatInfo = null;
            this.participantsCount = 0;
            this.description = "";
            long[] jArr = sb8.f;
            this.admins = jArr;
            this.blockedParticipantsCount = 0;
            this.chatOptions = null;
            this.mediaMusic = null;
            this.mediaAudio = null;
            this.pinnedMessageId = 0L;
            this.hidePinnedMessage = false;
            this.unreadReply = false;
            this.unreadPin = false;
            this.joinTime = 0L;
            this.messagesTtlSec = 0;
            this.adminParticipants = null;
            this.baseIconUrl = "";
            this.baseRawIconUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.flagsSettings = 0;
            this.videoConversation = null;
            this.lastOpenPositionTime = 0L;
            this.lastOpenPositionOffset = 0;
            this.lastOpenReadMark = 0L;
            this.lastWriteTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastOpenNewMessages = 0L;
            this.mediaPhotoVideo = null;
            this.mediaShare = null;
            this.mediaFiles = null;
            this.botsInfo = null;
            this.mediaLocations = null;
            this.modified = 0L;
            this.draft = sb8.i;
            this.draftUpdateTime = 0L;
            this.liveLocationMessageIds = null;
            this.lastMentionMessageId = 0L;
            this.chatFoldersIds = jArr;
            this.draftUpdateTimeForSyncLogic = 0L;
            this.markedAsUnread = false;
            this.lastPushMessage = null;
            this.lastReactedMessageId = 0L;
            this.lastReaction = "";
            this.lastFireDelayedErrorTime = 0L;
            this.lastDelayedUpdateTime = 0L;
            this.delayedChunk = Chunk.emptyArray();
            this.mediaAudioVideoMsg = null;
            this.chatReactionsSettings = null;
            this.participantSettings = 0;
            this.lastDelayedLoadTime = 0L;
            this.invitedBy = 0L;
            this.joinRequestTime = 0L;
            this.pendingJoinRequestsCount = 0;
            this.liveStreamUpdateTime = 0L;
            this.liveStream = null;
            this.commentsBlacklistCount = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            int i2 = this.type;
            if (i2 != 0) {
                iH += uu3.f(2, i2);
            }
            int i3 = this.status;
            if (i3 != 0) {
                iH += uu3.f(3, i3);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                iH += uu3.h(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                iH += ck8.a(map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                iH += uu3.h(6, j3);
            }
            if (!this.title.equals("")) {
                iH += uu3.l(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                iH += uu3.h(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                iH += uu3.h(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                iH += uu3.h(12, j6);
            }
            int i4 = this.newMessages;
            if (i4 != 0) {
                iH += uu3.f(13, i4);
            }
            Chunk[] chunkArr = this.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        iH = uu3.i(14, chunk) + iH;
                    }
                    i5++;
                }
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                iH += uu3.i(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                iH += uu3.i(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                iH += uu3.h(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        iH = uu3.i(19, section) + iH;
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                int iJ = 0;
                int i8 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        i8++;
                        int iQ = uu3.q(str);
                        iJ += uu3.j(iQ) + iQ;
                    }
                    i7++;
                }
                iH = iH + iJ + (i8 * 2);
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                iH += uu3.h(21, j8);
            }
            int[] iArr2 = this.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                int i9 = 0;
                int iG = 0;
                while (true) {
                    iArr = this.localChanges;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    iG += uu3.g(iArr[i9]);
                    i9++;
                }
                iH = iH + iG + (iArr.length * 2);
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                iH += uu3.i(23, channelInfo);
            }
            int i10 = this.accessType;
            if (i10 != 0) {
                iH += uu3.f(24, i10);
            }
            if (!this.link.equals("")) {
                iH += uu3.l(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                iH += uu3.i(26, chatSubject);
            }
            int i11 = this.restrictions;
            if (i11 != 0) {
                iH += uu3.f(27, i11);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                iH += uu3.i(28, groupChatInfo);
            }
            int i12 = this.participantsCount;
            if (i12 != 0) {
                iH += uu3.f(29, i12);
            }
            if (!this.description.equals("")) {
                iH += uu3.l(30, this.description);
            }
            long[] jArr3 = this.admins;
            if (jArr3 != null && jArr3.length > 0) {
                int i13 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.admins;
                    if (i13 >= jArr2.length) {
                        break;
                    }
                    iK += uu3.k(jArr2[i13]);
                    i13++;
                }
                iH = iH + iK + (jArr2.length * 2);
            }
            int i14 = this.blockedParticipantsCount;
            if (i14 != 0) {
                iH += uu3.f(32, i14);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                iH += uu3.i(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                iH += uu3.i(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                iH += uu3.i(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                iH += uu3.h(36, j9);
            }
            if (this.hidePinnedMessage) {
                iH += uu3.a(37);
            }
            if (this.unreadReply) {
                iH += uu3.a(38);
            }
            if (this.unreadPin) {
                iH += uu3.a(39);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                iH += uu3.h(40, j10);
            }
            int i15 = this.messagesTtlSec;
            if (i15 != 0) {
                iH += uu3.f(42, i15);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                iH += ck8.a(map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                iH += uu3.l(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                iH += uu3.l(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                iH += uu3.h(46, j11);
            }
            int i16 = this.flagsSettings;
            if (i16 != 0) {
                iH += uu3.f(47, i16);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                iH += uu3.i(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                iH += uu3.h(49, j12);
            }
            int i17 = this.lastOpenPositionOffset;
            if (i17 != 0) {
                iH += uu3.f(50, i17);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                iH += uu3.h(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                iH += uu3.h(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                iH += uu3.h(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                iH += uu3.h(54, j16);
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                iH += uu3.i(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                iH += uu3.i(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                iH += uu3.i(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                iH += uu3.i(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                iH += uu3.i(60, chatMedia7);
            }
            long j17 = this.modified;
            if (j17 != 0) {
                iH += uu3.h(62, j17);
            }
            if (!Arrays.equals(this.draft, sb8.i)) {
                iH += uu3.b(64, this.draft);
            }
            long j18 = this.draftUpdateTime;
            if (j18 != 0) {
                iH += uu3.h(65, j18);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                iH += ck8.a(map3, 67, 3, 3);
            }
            long j19 = this.lastMentionMessageId;
            if (j19 != 0) {
                iH += uu3.h(68, j19);
            }
            long[] jArr4 = this.chatFoldersIds;
            if (jArr4 != null && jArr4.length > 0) {
                int i18 = 0;
                int iK2 = 0;
                while (true) {
                    jArr = this.chatFoldersIds;
                    if (i18 >= jArr.length) {
                        break;
                    }
                    iK2 += uu3.k(jArr[i18]);
                    i18++;
                }
                iH = iH + iK2 + (jArr.length * 2);
            }
            long j20 = this.draftUpdateTimeForSyncLogic;
            if (j20 != 0) {
                iH += uu3.h(70, j20);
            }
            if (this.markedAsUnread) {
                iH += uu3.a(71);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                iH += uu3.i(72, pushMessage);
            }
            long j21 = this.lastReactedMessageId;
            if (j21 != 0) {
                iH += uu3.h(73, j21);
            }
            if (!this.lastReaction.equals("")) {
                iH += uu3.l(74, this.lastReaction);
            }
            long j22 = this.lastFireDelayedErrorTime;
            if (j22 != 0) {
                iH += uu3.h(75, j22);
            }
            long j23 = this.lastDelayedUpdateTime;
            if (j23 != 0) {
                iH += uu3.h(76, j23);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr4[i];
                    if (chunk2 != null) {
                        iH = uu3.i(77, chunk2) + iH;
                    }
                    i++;
                }
            }
            ChatMedia chatMedia8 = this.mediaAudioVideoMsg;
            if (chatMedia8 != null) {
                iH += uu3.i(78, chatMedia8);
            }
            ChatReactionsSettings chatReactionsSettings = this.chatReactionsSettings;
            if (chatReactionsSettings != null) {
                iH += uu3.i(79, chatReactionsSettings);
            }
            int i19 = this.participantSettings;
            if (i19 != 0) {
                iH += uu3.f(80, i19);
            }
            long j24 = this.lastDelayedLoadTime;
            if (j24 != 0) {
                iH += uu3.h(81, j24);
            }
            long j25 = this.invitedBy;
            if (j25 != 0) {
                iH += uu3.h(82, j25);
            }
            long j26 = this.joinRequestTime;
            if (j26 != 0) {
                iH += uu3.h(83, j26);
            }
            int i20 = this.pendingJoinRequestsCount;
            if (i20 != 0) {
                iH += uu3.f(84, i20);
            }
            long j27 = this.liveStreamUpdateTime;
            if (j27 != 0) {
                iH += uu3.h(85, j27);
            }
            LiveStream liveStream = this.liveStream;
            if (liveStream != null) {
                iH += uu3.i(86, liveStream);
            }
            int i21 = this.commentsBlacklistCount;
            return i21 != 0 ? uu3.f(87, i21) + iH : iH;
        }

        @Override // defpackage.sia
        public Chat mergeFrom(su3 su3Var) throws IOException {
            su3 su3Var2;
            em9 em9Var = cqk.c;
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        su3Var2 = su3Var;
                        this.serverId = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 16:
                        su3Var2 = su3Var;
                        int iP = su3Var2.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                            this.type = iP;
                            continue;
                        }
                        su3Var = su3Var2;
                        break;
                    case 24:
                        su3Var2 = su3Var;
                        int iP2 = su3Var2.p();
                        switch (iP2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.status = iP2;
                                continue;
                        }
                        su3Var = su3Var2;
                        break;
                    case 32:
                        su3Var2 = su3Var;
                        this.owner = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 42:
                        su3Var2 = su3Var;
                        this.participants = ck8.b(su3Var2, this.participants, em9Var, 3, 3, null, 8, 16);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 48:
                        su3Var2 = su3Var;
                        this.created = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 58:
                        su3Var2 = su3Var;
                        this.title = su3Var2.r();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 80:
                        su3Var2 = su3Var;
                        this.lastMessageId = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 88:
                        su3Var2 = su3Var;
                        this.lastEventTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 96:
                        su3Var2 = su3Var;
                        this.cid = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                        su3Var2 = su3Var;
                        this.newMessages = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 114:
                        su3Var2 = su3Var;
                        int I = sb8.I(su3Var2, 114);
                        Chunk[] chunkArr = this.chunk;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = I + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            su3Var2.j(chunk);
                            su3Var2.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        su3Var2.j(chunk2);
                        this.chunk = chunkArr2;
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 130:
                        su3Var2 = su3Var;
                        if (this.chatSettings == null) {
                            this.chatSettings = new ChatSettings();
                        }
                        su3Var2.j(this.chatSettings);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 138:
                        su3Var2 = su3Var;
                        if (this.mediaAll == null) {
                            this.mediaAll = new ChatMedia();
                        }
                        su3Var2.j(this.mediaAll);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 144:
                        su3Var2 = su3Var;
                        this.firstMessageId = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 154:
                        su3Var2 = su3Var;
                        int I2 = sb8.I(su3Var2, 154);
                        Section[] sectionArr = this.sections;
                        int length2 = sectionArr == null ? 0 : sectionArr.length;
                        int i2 = I2 + length2;
                        Section[] sectionArr2 = new Section[i2];
                        if (length2 != 0) {
                            System.arraycopy(sectionArr, 0, sectionArr2, 0, length2);
                        }
                        while (length2 < i2 - 1) {
                            Section section = new Section();
                            sectionArr2[length2] = section;
                            su3Var2.j(section);
                            su3Var2.s();
                            length2++;
                        }
                        Section section2 = new Section();
                        sectionArr2[length2] = section2;
                        su3Var2.j(section2);
                        this.sections = sectionArr2;
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 162:
                        su3Var2 = su3Var;
                        int I3 = sb8.I(su3Var2, 162);
                        String[] strArr = this.stickersOrder;
                        int length3 = strArr == null ? 0 : strArr.length;
                        int i3 = I3 + length3;
                        String[] strArr2 = new String[i3];
                        if (length3 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length3);
                        }
                        while (length3 < i3 - 1) {
                            strArr2[length3] = su3Var2.r();
                            su3Var2.s();
                            length3++;
                        }
                        strArr2[length3] = su3Var2.r();
                        this.stickersOrder = strArr2;
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 168:
                        su3Var2 = su3Var;
                        this.stickersSyncTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 176:
                        su3Var2 = su3Var;
                        int I4 = sb8.I(su3Var2, 176);
                        int[] iArr = this.localChanges;
                        int length4 = iArr == null ? 0 : iArr.length;
                        int i4 = I4 + length4;
                        int[] iArr2 = new int[i4];
                        if (length4 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length4);
                        }
                        while (length4 < i4 - 1) {
                            iArr2[length4] = su3Var2.p();
                            su3Var2.s();
                            length4++;
                        }
                        iArr2[length4] = su3Var2.p();
                        this.localChanges = iArr2;
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 178:
                        su3Var2 = su3Var;
                        int iE = su3Var2.e(su3Var2.p());
                        int iC = su3Var2.c();
                        int i5 = 0;
                        while (su3Var2.b() > 0) {
                            su3Var2.p();
                            i5++;
                        }
                        su3Var2.t(iC);
                        int[] iArr3 = this.localChanges;
                        int length5 = iArr3 == null ? 0 : iArr3.length;
                        int i6 = i5 + length5;
                        int[] iArr4 = new int[i6];
                        if (length5 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length5);
                        }
                        while (length5 < i6) {
                            iArr4[length5] = su3Var2.p();
                            length5++;
                        }
                        this.localChanges = iArr4;
                        su3Var2.d(iE);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 186:
                        su3Var2 = su3Var;
                        if (this.channelInfo == null) {
                            this.channelInfo = new ChannelInfo();
                        }
                        su3Var2.j(this.channelInfo);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 192:
                        su3Var2 = su3Var;
                        int iP3 = su3Var2.p();
                        if (iP3 == 0 || iP3 == 1) {
                            this.accessType = iP3;
                            continue;
                        }
                        su3Var = su3Var2;
                        break;
                    case 202:
                        su3Var2 = su3Var;
                        this.link = su3Var2.r();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 210:
                        su3Var2 = su3Var;
                        if (this.chatSubject == null) {
                            this.chatSubject = new ChatSubject();
                        }
                        su3Var2.j(this.chatSubject);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 216:
                        su3Var2 = su3Var;
                        this.restrictions = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 226:
                        su3Var2 = su3Var;
                        if (this.groupChatInfo == null) {
                            this.groupChatInfo = new GroupChatInfo();
                        }
                        su3Var2.j(this.groupChatInfo);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 232:
                        su3Var2 = su3Var;
                        this.participantsCount = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 242:
                        su3Var2 = su3Var;
                        this.description = su3Var2.r();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 248:
                        su3Var2 = su3Var;
                        int I5 = sb8.I(su3Var2, 248);
                        long[] jArr = this.admins;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i7 = I5 + length6;
                        long[] jArr2 = new long[i7];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i7 - 1) {
                            jArr2[length6] = su3Var2.q();
                            su3Var2.s();
                            length6++;
                        }
                        jArr2[length6] = su3Var2.q();
                        this.admins = jArr2;
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 250:
                        su3Var2 = su3Var;
                        int iE2 = su3Var2.e(su3Var2.p());
                        int iC2 = su3Var2.c();
                        int i8 = 0;
                        while (su3Var2.b() > 0) {
                            su3Var2.q();
                            i8++;
                        }
                        su3Var2.t(iC2);
                        long[] jArr3 = this.admins;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i9 = i8 + length7;
                        long[] jArr4 = new long[i9];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i9) {
                            jArr4[length7] = su3Var2.q();
                            length7++;
                        }
                        this.admins = jArr4;
                        su3Var2.d(iE2);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case np0.n /* 256 */:
                        su3Var2 = su3Var;
                        this.blockedParticipantsCount = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 266:
                        su3Var2 = su3Var;
                        if (this.chatOptions == null) {
                            this.chatOptions = new ChatOptions();
                        }
                        su3Var2.j(this.chatOptions);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 274:
                        su3Var2 = su3Var;
                        if (this.mediaMusic == null) {
                            this.mediaMusic = new ChatMedia();
                        }
                        su3Var2.j(this.mediaMusic);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 282:
                        su3Var2 = su3Var;
                        if (this.mediaAudio == null) {
                            this.mediaAudio = new ChatMedia();
                        }
                        su3Var2.j(this.mediaAudio);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 288:
                        su3Var2 = su3Var;
                        this.pinnedMessageId = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 296:
                        su3Var2 = su3Var;
                        this.hidePinnedMessage = su3Var2.f();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case HttpStatus.SC_NOT_MODIFIED /* 304 */:
                        su3Var2 = su3Var;
                        this.unreadReply = su3Var2.f();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 312:
                        su3Var2 = su3Var;
                        this.unreadPin = su3Var2.f();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 320:
                        su3Var2 = su3Var;
                        this.joinTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 336:
                        su3Var2 = su3Var;
                        this.messagesTtlSec = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 346:
                        su3Var2 = su3Var;
                        this.adminParticipants = ck8.b(su3Var2, this.adminParticipants, em9Var, 3, 11, new AdminParticipant(), 8, 18);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 354:
                        su3Var2 = su3Var;
                        this.baseIconUrl = su3Var2.r();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 362:
                        su3Var2 = su3Var;
                        this.baseRawIconUrl = su3Var2.r();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 368:
                        su3Var2 = su3Var;
                        this.unbindOkPanelCloseTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 376:
                        su3Var2 = su3Var;
                        this.flagsSettings = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 386:
                        su3Var2 = su3Var;
                        if (this.videoConversation == null) {
                            this.videoConversation = new VideoConversation();
                        }
                        su3Var2.j(this.videoConversation);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 392:
                        su3Var2 = su3Var;
                        this.lastOpenPositionTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case HttpStatus.SC_BAD_REQUEST /* 400 */:
                        su3Var2 = su3Var;
                        this.lastOpenPositionOffset = su3Var2.p();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                        su3Var2 = su3Var;
                        this.lastOpenReadMark = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                        su3Var2 = su3Var;
                        this.lastWriteTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case HttpStatus.SC_FAILED_DEPENDENCY /* 424 */:
                        su3Var2 = su3Var;
                        this.lastSearchClickTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 432:
                        su3Var2 = su3Var;
                        this.lastOpenNewMessages = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 450:
                        su3Var2 = su3Var;
                        if (this.mediaPhotoVideo == null) {
                            this.mediaPhotoVideo = new ChatMedia();
                        }
                        su3Var2.j(this.mediaPhotoVideo);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 458:
                        su3Var2 = su3Var;
                        if (this.mediaShare == null) {
                            this.mediaShare = new ChatMedia();
                        }
                        su3Var2.j(this.mediaShare);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 466:
                        su3Var2 = su3Var;
                        if (this.mediaFiles == null) {
                            this.mediaFiles = new ChatMedia();
                        }
                        su3Var2.j(this.mediaFiles);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 474:
                        su3Var2 = su3Var;
                        if (this.botsInfo == null) {
                            this.botsInfo = new BotsInfo();
                        }
                        su3Var2.j(this.botsInfo);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 482:
                        su3Var2 = su3Var;
                        if (this.mediaLocations == null) {
                            this.mediaLocations = new ChatMedia();
                        }
                        su3Var2.j(this.mediaLocations);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 496:
                        su3Var2 = su3Var;
                        this.modified = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 514:
                        su3Var2 = su3Var;
                        this.draft = su3Var2.g();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 520:
                        su3Var2 = su3Var;
                        this.draftUpdateTime = su3Var2.q();
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 538:
                        su3Var2 = su3Var;
                        this.liveLocationMessageIds = ck8.b(su3Var2, this.liveLocationMessageIds, em9Var, 3, 3, null, 8, 16);
                        continue;
                        su3Var = su3Var2;
                        break;
                    case 544:
                        this.lastMentionMessageId = su3Var.q();
                        break;
                    case 552:
                        int I6 = sb8.I(su3Var, 552);
                        long[] jArr5 = this.chatFoldersIds;
                        int length8 = jArr5 == null ? 0 : jArr5.length;
                        int i10 = I6 + length8;
                        long[] jArr6 = new long[i10];
                        if (length8 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length8);
                        }
                        while (length8 < i10 - 1) {
                            jArr6[length8] = su3Var.q();
                            su3Var.s();
                            length8++;
                        }
                        jArr6[length8] = su3Var.q();
                        this.chatFoldersIds = jArr6;
                        break;
                    case 554:
                        int iE3 = su3Var.e(su3Var.p());
                        int iC3 = su3Var.c();
                        int i11 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i11++;
                        }
                        su3Var.t(iC3);
                        long[] jArr7 = this.chatFoldersIds;
                        int length9 = jArr7 == null ? 0 : jArr7.length;
                        int i12 = i11 + length9;
                        long[] jArr8 = new long[i12];
                        if (length9 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length9);
                        }
                        while (length9 < i12) {
                            jArr8[length9] = su3Var.q();
                            length9++;
                        }
                        this.chatFoldersIds = jArr8;
                        su3Var.d(iE3);
                        break;
                    case 560:
                        this.draftUpdateTimeForSyncLogic = su3Var.q();
                        break;
                    case 568:
                        this.markedAsUnread = su3Var.f();
                        break;
                    case 578:
                        if (this.lastPushMessage == null) {
                            this.lastPushMessage = new PushMessage();
                        }
                        su3Var.j(this.lastPushMessage);
                        break;
                    case 584:
                        this.lastReactedMessageId = su3Var.q();
                        break;
                    case 594:
                        this.lastReaction = su3Var.r();
                        break;
                    case 600:
                        this.lastFireDelayedErrorTime = su3Var.q();
                        break;
                    case 608:
                        this.lastDelayedUpdateTime = su3Var.q();
                        break;
                    case 618:
                        int I7 = sb8.I(su3Var, 618);
                        Chunk[] chunkArr3 = this.delayedChunk;
                        int length10 = chunkArr3 == null ? 0 : chunkArr3.length;
                        int i13 = I7 + length10;
                        Chunk[] chunkArr4 = new Chunk[i13];
                        if (length10 != 0) {
                            System.arraycopy(chunkArr3, 0, chunkArr4, 0, length10);
                        }
                        while (length10 < i13 - 1) {
                            Chunk chunk3 = new Chunk();
                            chunkArr4[length10] = chunk3;
                            su3Var.j(chunk3);
                            su3Var.s();
                            length10++;
                        }
                        Chunk chunk4 = new Chunk();
                        chunkArr4[length10] = chunk4;
                        su3Var.j(chunk4);
                        this.delayedChunk = chunkArr4;
                        break;
                    case 626:
                        if (this.mediaAudioVideoMsg == null) {
                            this.mediaAudioVideoMsg = new ChatMedia();
                        }
                        su3Var.j(this.mediaAudioVideoMsg);
                        break;
                    case 634:
                        if (this.chatReactionsSettings == null) {
                            this.chatReactionsSettings = new ChatReactionsSettings();
                        }
                        su3Var.j(this.chatReactionsSettings);
                        break;
                    case 640:
                        this.participantSettings = su3Var.p();
                        break;
                    case 648:
                        this.lastDelayedLoadTime = su3Var.q();
                        break;
                    case 656:
                        this.invitedBy = su3Var.q();
                        break;
                    case 664:
                        this.joinRequestTime = su3Var.q();
                        break;
                    case 672:
                        this.pendingJoinRequestsCount = su3Var.p();
                        break;
                    case 680:
                        this.liveStreamUpdateTime = su3Var.q();
                        break;
                    case 690:
                        if (this.liveStream == null) {
                            this.liveStream = new LiveStream();
                        }
                        su3Var.j(this.liveStream);
                        break;
                    case 696:
                        this.commentsBlacklistCount = su3Var.p();
                        break;
                    default:
                        if (!su3Var.u(iS)) {
                        }
                        break;
                }
                su3Var2 = su3Var;
                su3Var = su3Var2;
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            int i = this.type;
            if (i != 0) {
                uu3Var.w(2, i);
            }
            int i2 = this.status;
            if (i2 != 0) {
                uu3Var.w(3, i2);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                uu3Var.x(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                ck8.d(uu3Var, map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                uu3Var.x(6, j3);
            }
            if (!this.title.equals("")) {
                uu3Var.E(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                uu3Var.x(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                uu3Var.x(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                uu3Var.x(12, j6);
            }
            int i3 = this.newMessages;
            if (i3 != 0) {
                uu3Var.w(13, i3);
            }
            Chunk[] chunkArr = this.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        uu3Var.y(14, chunk);
                    }
                    i5++;
                }
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                uu3Var.y(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                uu3Var.y(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                uu3Var.x(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        uu3Var.y(19, section);
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        uu3Var.E(20, str);
                    }
                    i7++;
                }
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                uu3Var.x(21, j8);
            }
            int[] iArr = this.localChanges;
            if (iArr != null && iArr.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.localChanges;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    uu3Var.w(22, iArr2[i8]);
                    i8++;
                }
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                uu3Var.y(23, channelInfo);
            }
            int i9 = this.accessType;
            if (i9 != 0) {
                uu3Var.w(24, i9);
            }
            if (!this.link.equals("")) {
                uu3Var.E(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                uu3Var.y(26, chatSubject);
            }
            int i10 = this.restrictions;
            if (i10 != 0) {
                uu3Var.w(27, i10);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                uu3Var.y(28, groupChatInfo);
            }
            int i11 = this.participantsCount;
            if (i11 != 0) {
                uu3Var.w(29, i11);
            }
            if (!this.description.equals("")) {
                uu3Var.E(30, this.description);
            }
            long[] jArr = this.admins;
            if (jArr != null && jArr.length > 0) {
                int i12 = 0;
                while (true) {
                    long[] jArr2 = this.admins;
                    if (i12 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(31, jArr2[i12]);
                    i12++;
                }
            }
            int i13 = this.blockedParticipantsCount;
            if (i13 != 0) {
                uu3Var.w(32, i13);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                uu3Var.y(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                uu3Var.y(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                uu3Var.y(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                uu3Var.x(36, j9);
            }
            boolean z = this.hidePinnedMessage;
            if (z) {
                uu3Var.r(37, z);
            }
            boolean z2 = this.unreadReply;
            if (z2) {
                uu3Var.r(38, z2);
            }
            boolean z3 = this.unreadPin;
            if (z3) {
                uu3Var.r(39, z3);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                uu3Var.x(40, j10);
            }
            int i14 = this.messagesTtlSec;
            if (i14 != 0) {
                uu3Var.w(42, i14);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                ck8.d(uu3Var, map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                uu3Var.E(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                uu3Var.E(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                uu3Var.x(46, j11);
            }
            int i15 = this.flagsSettings;
            if (i15 != 0) {
                uu3Var.w(47, i15);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                uu3Var.y(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                uu3Var.x(49, j12);
            }
            int i16 = this.lastOpenPositionOffset;
            if (i16 != 0) {
                uu3Var.w(50, i16);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                uu3Var.x(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                uu3Var.x(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                uu3Var.x(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                uu3Var.x(54, j16);
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                uu3Var.y(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                uu3Var.y(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                uu3Var.y(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                uu3Var.y(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                uu3Var.y(60, chatMedia7);
            }
            long j17 = this.modified;
            if (j17 != 0) {
                uu3Var.x(62, j17);
            }
            if (!Arrays.equals(this.draft, sb8.i)) {
                uu3Var.s(64, this.draft);
            }
            long j18 = this.draftUpdateTime;
            if (j18 != 0) {
                uu3Var.x(65, j18);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                ck8.d(uu3Var, map3, 67, 3, 3);
            }
            long j19 = this.lastMentionMessageId;
            if (j19 != 0) {
                uu3Var.x(68, j19);
            }
            long[] jArr3 = this.chatFoldersIds;
            if (jArr3 != null && jArr3.length > 0) {
                int i17 = 0;
                while (true) {
                    long[] jArr4 = this.chatFoldersIds;
                    if (i17 >= jArr4.length) {
                        break;
                    }
                    uu3Var.x(69, jArr4[i17]);
                    i17++;
                }
            }
            long j20 = this.draftUpdateTimeForSyncLogic;
            if (j20 != 0) {
                uu3Var.x(70, j20);
            }
            boolean z4 = this.markedAsUnread;
            if (z4) {
                uu3Var.r(71, z4);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                uu3Var.y(72, pushMessage);
            }
            long j21 = this.lastReactedMessageId;
            if (j21 != 0) {
                uu3Var.x(73, j21);
            }
            if (!this.lastReaction.equals("")) {
                uu3Var.E(74, this.lastReaction);
            }
            long j22 = this.lastFireDelayedErrorTime;
            if (j22 != 0) {
                uu3Var.x(75, j22);
            }
            long j23 = this.lastDelayedUpdateTime;
            if (j23 != 0) {
                uu3Var.x(76, j23);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i4 >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr4[i4];
                    if (chunk2 != null) {
                        uu3Var.y(77, chunk2);
                    }
                    i4++;
                }
            }
            ChatMedia chatMedia8 = this.mediaAudioVideoMsg;
            if (chatMedia8 != null) {
                uu3Var.y(78, chatMedia8);
            }
            ChatReactionsSettings chatReactionsSettings = this.chatReactionsSettings;
            if (chatReactionsSettings != null) {
                uu3Var.y(79, chatReactionsSettings);
            }
            int i18 = this.participantSettings;
            if (i18 != 0) {
                uu3Var.w(80, i18);
            }
            long j24 = this.lastDelayedLoadTime;
            if (j24 != 0) {
                uu3Var.x(81, j24);
            }
            long j25 = this.invitedBy;
            if (j25 != 0) {
                uu3Var.x(82, j25);
            }
            long j26 = this.joinRequestTime;
            if (j26 != 0) {
                uu3Var.x(83, j26);
            }
            int i19 = this.pendingJoinRequestsCount;
            if (i19 != 0) {
                uu3Var.w(84, i19);
            }
            long j27 = this.liveStreamUpdateTime;
            if (j27 != 0) {
                uu3Var.x(85, j27);
            }
            LiveStream liveStream = this.liveStream;
            if (liveStream != null) {
                uu3Var.y(86, liveStream);
            }
            int i20 = this.commentsBlacklistCount;
            if (i20 != 0) {
                uu3Var.w(87, i20);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class GroupChatInfo extends sia {
            public static final int ALL = 2;
            public static final int DISABLED = 0;
            public static final int MEMBERS = 1;
            private static volatile GroupChatInfo[] _emptyArray;
            public String baseIconUrl;
            public long groupId;
            public GroupOptions groupOptions;
            public boolean isAnswered;
            public boolean isCustomTitle;
            public boolean isImportant;
            public boolean isMember;
            public boolean isModerator;
            public int messagingPermissions;
            public String name;

            public GroupChatInfo() {
                clear();
            }

            public static GroupChatInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new GroupChatInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static GroupChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (GroupChatInfo) sia.mergeFrom(new GroupChatInfo(), bArr);
            }

            public GroupChatInfo clear() {
                this.groupId = 0L;
                this.isAnswered = false;
                this.isModerator = false;
                this.isImportant = false;
                this.name = "";
                this.baseIconUrl = "";
                this.isCustomTitle = false;
                this.isMember = false;
                this.messagingPermissions = 0;
                this.groupOptions = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long j = this.groupId;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                if (this.isAnswered) {
                    iH += uu3.a(2);
                }
                if (this.isModerator) {
                    iH += uu3.a(3);
                }
                if (this.isImportant) {
                    iH += uu3.a(4);
                }
                if (!this.name.equals("")) {
                    iH += uu3.l(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    iH += uu3.l(6, this.baseIconUrl);
                }
                if (this.isCustomTitle) {
                    iH += uu3.a(7);
                }
                if (this.isMember) {
                    iH += uu3.a(8);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    iH += uu3.f(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                return groupOptions != null ? uu3.i(10, groupOptions) + iH : iH;
            }

            @Override // defpackage.sia
            public GroupChatInfo mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            this.groupId = su3Var.q();
                            break;
                        case 16:
                            this.isAnswered = su3Var.f();
                            break;
                        case 24:
                            this.isModerator = su3Var.f();
                            break;
                        case 32:
                            this.isImportant = su3Var.f();
                            break;
                        case 42:
                            this.name = su3Var.r();
                            break;
                        case 50:
                            this.baseIconUrl = su3Var.r();
                            break;
                        case 56:
                            this.isCustomTitle = su3Var.f();
                            break;
                        case 64:
                            this.isMember = su3Var.f();
                            break;
                        case 72:
                            int iP = su3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2) {
                                this.messagingPermissions = iP;
                            }
                            break;
                        case 82:
                            if (this.groupOptions == null) {
                                this.groupOptions = new GroupOptions();
                            }
                            su3Var.j(this.groupOptions);
                            break;
                        default:
                            if (!su3Var.u(iS)) {
                            }
                            break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.groupId;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                boolean z = this.isAnswered;
                if (z) {
                    uu3Var.r(2, z);
                }
                boolean z2 = this.isModerator;
                if (z2) {
                    uu3Var.r(3, z2);
                }
                boolean z3 = this.isImportant;
                if (z3) {
                    uu3Var.r(4, z3);
                }
                if (!this.name.equals("")) {
                    uu3Var.E(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    uu3Var.E(6, this.baseIconUrl);
                }
                boolean z4 = this.isCustomTitle;
                if (z4) {
                    uu3Var.r(7, z4);
                }
                boolean z5 = this.isMember;
                if (z5) {
                    uu3Var.r(8, z5);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    uu3Var.w(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                if (groupOptions != null) {
                    uu3Var.y(10, groupOptions);
                }
            }

            public static final class GroupOptions extends sia {
                private static volatile GroupOptions[] _emptyArray;
                public boolean groupPremium;

                public GroupOptions() {
                    clear();
                }

                public static GroupOptions[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (ck8.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new GroupOptions[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static GroupOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (GroupOptions) sia.mergeFrom(new GroupOptions(), bArr);
                }

                public GroupOptions clear() {
                    this.groupPremium = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.sia
                public int computeSerializedSize() {
                    if (this.groupPremium) {
                        return uu3.a(1);
                    }
                    return 0;
                }

                @Override // defpackage.sia
                public GroupOptions mergeFrom(su3 su3Var) throws IOException {
                    while (true) {
                        int iS = su3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.groupPremium = su3Var.f();
                        } else if (!su3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // defpackage.sia
                public void writeTo(uu3 uu3Var) throws IOException {
                    boolean z = this.groupPremium;
                    if (z) {
                        uu3Var.r(1, z);
                    }
                }

                public static GroupOptions parseFrom(su3 su3Var) throws IOException {
                    return new GroupOptions().mergeFrom(su3Var);
                }
            }

            public static GroupChatInfo parseFrom(su3 su3Var) throws IOException {
                return new GroupChatInfo().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class AdminParticipant extends sia {
            private static volatile AdminParticipant[] _emptyArray;
            public String alias;
            public long id;
            public long inviterId;
            public int permissions;

            public AdminParticipant() {
                clear();
            }

            public static AdminParticipant[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new AdminParticipant[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static AdminParticipant parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (AdminParticipant) sia.mergeFrom(new AdminParticipant(), bArr);
            }

            public AdminParticipant clear() {
                this.id = 0L;
                this.permissions = 0;
                this.inviterId = 0L;
                this.alias = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                int i = this.permissions;
                if (i != 0) {
                    iH += uu3.f(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    iH += uu3.h(3, j2);
                }
                return !this.alias.equals("") ? uu3.l(4, this.alias) + iH : iH;
            }

            @Override // defpackage.sia
            public AdminParticipant mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.id = su3Var.q();
                    } else if (iS == 16) {
                        this.permissions = su3Var.p();
                    } else if (iS == 24) {
                        this.inviterId = su3Var.q();
                    } else if (iS == 34) {
                        this.alias = su3Var.r();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                int i = this.permissions;
                if (i != 0) {
                    uu3Var.w(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    uu3Var.x(3, j2);
                }
                if (this.alias.equals("")) {
                    return;
                }
                uu3Var.E(4, this.alias);
            }

            public static AdminParticipant parseFrom(su3 su3Var) throws IOException {
                return new AdminParticipant().mergeFrom(su3Var);
            }
        }

        public static final class BotsInfo extends sia {
            private static volatile BotsInfo[] _emptyArray;
            public boolean hasBots;
            public boolean suspendedBot;

            public BotsInfo() {
                clear();
            }

            public static BotsInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new BotsInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static BotsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (BotsInfo) sia.mergeFrom(new BotsInfo(), bArr);
            }

            public BotsInfo clear() {
                this.hasBots = false;
                this.suspendedBot = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int iA = this.hasBots ? uu3.a(1) : 0;
                return this.suspendedBot ? uu3.a(2) + iA : iA;
            }

            @Override // defpackage.sia
            public BotsInfo mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.hasBots = su3Var.f();
                    } else if (iS == 16) {
                        this.suspendedBot = su3Var.f();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                boolean z = this.hasBots;
                if (z) {
                    uu3Var.r(1, z);
                }
                boolean z2 = this.suspendedBot;
                if (z2) {
                    uu3Var.r(2, z2);
                }
            }

            public static BotsInfo parseFrom(su3 su3Var) throws IOException {
                return new BotsInfo().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class ChannelInfo extends sia {
            private static volatile ChannelInfo[] _emptyArray;
            public long[] admins;
            public String description;
            public int membersCount;
            public boolean signAdmin;

            public ChannelInfo() {
                clear();
            }

            public static ChannelInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChannelInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChannelInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChannelInfo) sia.mergeFrom(new ChannelInfo(), bArr);
            }

            public ChannelInfo clear() {
                this.membersCount = 0;
                this.description = "";
                this.admins = sb8.f;
                this.signAdmin = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long[] jArr;
                int i = this.membersCount;
                int i2 = 0;
                int iF = i != 0 ? uu3.f(1, i) : 0;
                if (!this.description.equals("")) {
                    iF += uu3.l(2, this.description);
                }
                long[] jArr2 = this.admins;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.admins;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        iK += uu3.k(jArr[i2]);
                        i2++;
                    }
                    iF = iF + iK + jArr.length;
                }
                return this.signAdmin ? uu3.a(4) + iF : iF;
            }

            @Override // defpackage.sia
            public ChannelInfo mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.membersCount = su3Var.p();
                    } else if (iS == 18) {
                        this.description = su3Var.r();
                    } else if (iS == 24) {
                        int I = sb8.I(su3Var, 24);
                        long[] jArr = this.admins;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.admins = jArr2;
                    } else if (iS == 26) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.admins;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.admins = jArr4;
                        su3Var.d(iE);
                    } else if (iS == 32) {
                        this.signAdmin = su3Var.f();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                int i = this.membersCount;
                if (i != 0) {
                    uu3Var.w(1, i);
                }
                if (!this.description.equals("")) {
                    uu3Var.E(2, this.description);
                }
                long[] jArr = this.admins;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.admins;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        uu3Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                boolean z = this.signAdmin;
                if (z) {
                    uu3Var.r(4, z);
                }
            }

            public static ChannelInfo parseFrom(su3 su3Var) throws IOException {
                return new ChannelInfo().mergeFrom(su3Var);
            }
        }

        public static final class ChatMedia extends sia {
            private static volatile ChatMedia[] _emptyArray;
            public Chunk chunk;
            public Chunk[] chunks;
            public long firstMessageId;
            public long lastMessageId;
            public int totalCount;

            public ChatMedia() {
                clear();
            }

            public static ChatMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatMedia[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatMedia) sia.mergeFrom(new ChatMedia(), bArr);
            }

            public ChatMedia clear() {
                this.chunk = null;
                this.totalCount = 0;
                this.firstMessageId = 0L;
                this.lastMessageId = 0L;
                this.chunks = Chunk.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                Chunk chunk = this.chunk;
                int i = 0;
                int i2 = chunk != null ? uu3.i(1, chunk) : 0;
                int i3 = this.totalCount;
                if (i3 != 0) {
                    i2 += uu3.f(2, i3);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    i2 += uu3.h(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    i2 += uu3.h(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    while (true) {
                        Chunk[] chunkArr2 = this.chunks;
                        if (i >= chunkArr2.length) {
                            break;
                        }
                        Chunk chunk2 = chunkArr2[i];
                        if (chunk2 != null) {
                            i2 = uu3.i(5, chunk2) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.sia
            public ChatMedia mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        if (this.chunk == null) {
                            this.chunk = new Chunk();
                        }
                        su3Var.j(this.chunk);
                    } else if (iS == 16) {
                        this.totalCount = su3Var.p();
                    } else if (iS == 24) {
                        this.firstMessageId = su3Var.q();
                    } else if (iS == 32) {
                        this.lastMessageId = su3Var.q();
                    } else if (iS == 42) {
                        int I = sb8.I(su3Var, 42);
                        Chunk[] chunkArr = this.chunks;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = I + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            su3Var.j(chunk);
                            su3Var.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        su3Var.j(chunk2);
                        this.chunks = chunkArr2;
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                Chunk chunk = this.chunk;
                if (chunk != null) {
                    uu3Var.y(1, chunk);
                }
                int i = this.totalCount;
                if (i != 0) {
                    uu3Var.w(2, i);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    uu3Var.x(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    uu3Var.x(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr == null || chunkArr.length <= 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunks;
                    if (i2 >= chunkArr2.length) {
                        return;
                    }
                    Chunk chunk2 = chunkArr2[i2];
                    if (chunk2 != null) {
                        uu3Var.y(5, chunk2);
                    }
                    i2++;
                }
            }

            public static ChatMedia parseFrom(su3 su3Var) throws IOException {
                return new ChatMedia().mergeFrom(su3Var);
            }
        }

        public static final class ChatOptions extends sia {
            private static volatile ChatOptions[] _emptyArray;
            public boolean aPlusChannel;
            public boolean allCanPinMessage;
            public boolean comments;
            public boolean commentsDisabled;
            public boolean confirmBeforeSend;
            public boolean contentLevelChat;
            public boolean disableForward;
            public boolean joinRequest;
            public boolean membersCanSeePrivateLink;
            public boolean official;
            public boolean onlyAdminCanAddMember;
            public boolean onlyAdminCanCall;
            public boolean onlyOwnerCanChangeIconTitle;
            public boolean sentByPhone;
            public boolean serviceChat;
            public boolean signAdmin;

            public ChatOptions() {
                clear();
            }

            public static ChatOptions[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatOptions[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatOptions) sia.mergeFrom(new ChatOptions(), bArr);
            }

            public ChatOptions clear() {
                this.signAdmin = false;
                this.onlyOwnerCanChangeIconTitle = false;
                this.official = false;
                this.allCanPinMessage = false;
                this.onlyAdminCanAddMember = false;
                this.onlyAdminCanCall = false;
                this.sentByPhone = false;
                this.serviceChat = false;
                this.membersCanSeePrivateLink = false;
                this.contentLevelChat = false;
                this.aPlusChannel = false;
                this.joinRequest = false;
                this.comments = false;
                this.commentsDisabled = false;
                this.confirmBeforeSend = false;
                this.disableForward = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int iA = this.signAdmin ? uu3.a(1) : 0;
                if (this.onlyOwnerCanChangeIconTitle) {
                    iA += uu3.a(2);
                }
                if (this.official) {
                    iA += uu3.a(3);
                }
                if (this.allCanPinMessage) {
                    iA += uu3.a(4);
                }
                if (this.onlyAdminCanAddMember) {
                    iA += uu3.a(5);
                }
                if (this.onlyAdminCanCall) {
                    iA += uu3.a(7);
                }
                if (this.sentByPhone) {
                    iA += uu3.a(8);
                }
                if (this.serviceChat) {
                    iA += uu3.a(9);
                }
                if (this.membersCanSeePrivateLink) {
                    iA += uu3.a(10);
                }
                if (this.contentLevelChat) {
                    iA += uu3.a(11);
                }
                if (this.aPlusChannel) {
                    iA += uu3.a(12);
                }
                if (this.joinRequest) {
                    iA += uu3.a(13);
                }
                if (this.comments) {
                    iA += uu3.a(14);
                }
                if (this.commentsDisabled) {
                    iA += uu3.a(15);
                }
                if (this.confirmBeforeSend) {
                    iA += uu3.a(16);
                }
                return this.disableForward ? uu3.a(17) + iA : iA;
            }

            @Override // defpackage.sia
            public ChatOptions mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            this.signAdmin = su3Var.f();
                            break;
                        case 16:
                            this.onlyOwnerCanChangeIconTitle = su3Var.f();
                            break;
                        case 24:
                            this.official = su3Var.f();
                            break;
                        case 32:
                            this.allCanPinMessage = su3Var.f();
                            break;
                        case 40:
                            this.onlyAdminCanAddMember = su3Var.f();
                            break;
                        case 56:
                            this.onlyAdminCanCall = su3Var.f();
                            break;
                        case 64:
                            this.sentByPhone = su3Var.f();
                            break;
                        case 72:
                            this.serviceChat = su3Var.f();
                            break;
                        case 80:
                            this.membersCanSeePrivateLink = su3Var.f();
                            break;
                        case 88:
                            this.contentLevelChat = su3Var.f();
                            break;
                        case 96:
                            this.aPlusChannel = su3Var.f();
                            break;
                        case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                            this.joinRequest = su3Var.f();
                            break;
                        case 112:
                            this.comments = su3Var.f();
                            break;
                        case 120:
                            this.commentsDisabled = su3Var.f();
                            break;
                        case np0.m /* 128 */:
                            this.confirmBeforeSend = su3Var.f();
                            break;
                        case 136:
                            this.disableForward = su3Var.f();
                            break;
                        default:
                            if (!su3Var.u(iS)) {
                            }
                            break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                boolean z = this.signAdmin;
                if (z) {
                    uu3Var.r(1, z);
                }
                boolean z2 = this.onlyOwnerCanChangeIconTitle;
                if (z2) {
                    uu3Var.r(2, z2);
                }
                boolean z3 = this.official;
                if (z3) {
                    uu3Var.r(3, z3);
                }
                boolean z4 = this.allCanPinMessage;
                if (z4) {
                    uu3Var.r(4, z4);
                }
                boolean z5 = this.onlyAdminCanAddMember;
                if (z5) {
                    uu3Var.r(5, z5);
                }
                boolean z6 = this.onlyAdminCanCall;
                if (z6) {
                    uu3Var.r(7, z6);
                }
                boolean z7 = this.sentByPhone;
                if (z7) {
                    uu3Var.r(8, z7);
                }
                boolean z8 = this.serviceChat;
                if (z8) {
                    uu3Var.r(9, z8);
                }
                boolean z9 = this.membersCanSeePrivateLink;
                if (z9) {
                    uu3Var.r(10, z9);
                }
                boolean z10 = this.contentLevelChat;
                if (z10) {
                    uu3Var.r(11, z10);
                }
                boolean z11 = this.aPlusChannel;
                if (z11) {
                    uu3Var.r(12, z11);
                }
                boolean z12 = this.joinRequest;
                if (z12) {
                    uu3Var.r(13, z12);
                }
                boolean z13 = this.comments;
                if (z13) {
                    uu3Var.r(14, z13);
                }
                boolean z14 = this.commentsDisabled;
                if (z14) {
                    uu3Var.r(15, z14);
                }
                boolean z15 = this.confirmBeforeSend;
                if (z15) {
                    uu3Var.r(16, z15);
                }
                boolean z16 = this.disableForward;
                if (z16) {
                    uu3Var.r(17, z16);
                }
            }

            public static ChatOptions parseFrom(su3 su3Var) throws IOException {
                return new ChatOptions().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class ChatReactionsSettings extends sia {
            private static volatile ChatReactionsSettings[] _emptyArray;
            public int count;
            public boolean included;
            public boolean isActive;
            public boolean isFull;
            public String[] reactionIds;
            public long updateTime;

            public ChatReactionsSettings() {
                clear();
            }

            public static ChatReactionsSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatReactionsSettings[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatReactionsSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatReactionsSettings) sia.mergeFrom(new ChatReactionsSettings(), bArr);
            }

            public ChatReactionsSettings clear() {
                this.isActive = false;
                this.count = 0;
                this.updateTime = 0L;
                this.included = false;
                this.reactionIds = sb8.h;
                this.isFull = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int i = 0;
                int iA = this.isActive ? uu3.a(1) : 0;
                int i2 = this.count;
                if (i2 != 0) {
                    iA += uu3.f(2, i2);
                }
                long j = this.updateTime;
                if (j != 0) {
                    iA += uu3.h(3, j);
                }
                if (this.included) {
                    iA += uu3.a(4);
                }
                String[] strArr = this.reactionIds;
                if (strArr != null && strArr.length > 0) {
                    int iJ = 0;
                    int i3 = 0;
                    while (true) {
                        String[] strArr2 = this.reactionIds;
                        if (i >= strArr2.length) {
                            break;
                        }
                        String str = strArr2[i];
                        if (str != null) {
                            i3++;
                            int iQ = uu3.q(str);
                            iJ = uu3.j(iQ) + iQ + iJ;
                        }
                        i++;
                    }
                    iA = iA + iJ + i3;
                }
                return this.isFull ? uu3.a(6) + iA : iA;
            }

            @Override // defpackage.sia
            public ChatReactionsSettings mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.isActive = su3Var.f();
                    } else if (iS == 16) {
                        this.count = su3Var.p();
                    } else if (iS == 24) {
                        this.updateTime = su3Var.q();
                    } else if (iS == 32) {
                        this.included = su3Var.f();
                    } else if (iS == 42) {
                        int I = sb8.I(su3Var, 42);
                        String[] strArr = this.reactionIds;
                        int length = strArr == null ? 0 : strArr.length;
                        int i = I + length;
                        String[] strArr2 = new String[i];
                        if (length != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length);
                        }
                        while (length < i - 1) {
                            strArr2[length] = su3Var.r();
                            su3Var.s();
                            length++;
                        }
                        strArr2[length] = su3Var.r();
                        this.reactionIds = strArr2;
                    } else if (iS == 48) {
                        this.isFull = su3Var.f();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                boolean z = this.isActive;
                if (z) {
                    uu3Var.r(1, z);
                }
                int i = this.count;
                if (i != 0) {
                    uu3Var.w(2, i);
                }
                long j = this.updateTime;
                if (j != 0) {
                    uu3Var.x(3, j);
                }
                boolean z2 = this.included;
                if (z2) {
                    uu3Var.r(4, z2);
                }
                String[] strArr = this.reactionIds;
                if (strArr != null && strArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr2 = this.reactionIds;
                        if (i2 >= strArr2.length) {
                            break;
                        }
                        String str = strArr2[i2];
                        if (str != null) {
                            uu3Var.E(5, str);
                        }
                        i2++;
                    }
                }
                boolean z3 = this.isFull;
                if (z3) {
                    uu3Var.r(6, z3);
                }
            }

            public static ChatReactionsSettings parseFrom(su3 su3Var) throws IOException {
                return new ChatReactionsSettings().mergeFrom(su3Var);
            }
        }

        public static final class ChatSettings extends sia {
            private static volatile ChatSettings[] _emptyArray;
            public long dontDisturbUntil;
            public long favoriteIndex;
            public boolean hideLiveLocationPanel;
            public long hideLiveLocationPanelBeforeTime;
            public long hideMyLiveLocationPanelBeforeTime;
            public long lastNotifMark;
            public long lastNotifMessageId;
            public int[] options;

            public ChatSettings() {
                clear();
            }

            public static ChatSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSettings[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSettings) sia.mergeFrom(new ChatSettings(), bArr);
            }

            public ChatSettings clear() {
                this.dontDisturbUntil = 0L;
                this.options = sb8.e;
                this.lastNotifMark = 0L;
                this.favoriteIndex = 0L;
                this.hideLiveLocationPanel = false;
                this.hideMyLiveLocationPanelBeforeTime = 0L;
                this.hideLiveLocationPanelBeforeTime = 0L;
                this.lastNotifMessageId = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int[] iArr;
                long j = this.dontDisturbUntil;
                int i = 0;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                int[] iArr2 = this.options;
                if (iArr2 != null && iArr2.length > 0) {
                    int iG = 0;
                    while (true) {
                        iArr = this.options;
                        if (i >= iArr.length) {
                            break;
                        }
                        iG += uu3.g(iArr[i]);
                        i++;
                    }
                    iH = iH + iG + iArr.length;
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    iH += uu3.h(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    iH += uu3.h(4, j3);
                }
                if (this.hideLiveLocationPanel) {
                    iH += uu3.a(6);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    iH += uu3.h(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    iH += uu3.h(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                return j6 != 0 ? uu3.h(9, j6) + iH : iH;
            }

            @Override // defpackage.sia
            public ChatSettings mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS != 8) {
                        if (iS != 16) {
                            if (iS != 18) {
                                if (iS != 24) {
                                    if (iS != 32) {
                                        if (iS != 48) {
                                            if (iS != 56) {
                                                if (iS != 64) {
                                                    if (iS != 72) {
                                                        if (!su3Var.u(iS)) {
                                                            break;
                                                        }
                                                    } else {
                                                        this.lastNotifMessageId = su3Var.q();
                                                    }
                                                } else {
                                                    this.hideLiveLocationPanelBeforeTime = su3Var.q();
                                                }
                                            } else {
                                                this.hideMyLiveLocationPanelBeforeTime = su3Var.q();
                                            }
                                        } else {
                                            this.hideLiveLocationPanel = su3Var.f();
                                        }
                                    } else {
                                        this.favoriteIndex = su3Var.q();
                                    }
                                } else {
                                    this.lastNotifMark = su3Var.q();
                                }
                            } else {
                                int iE = su3Var.e(su3Var.p());
                                int iC = su3Var.c();
                                int i = 0;
                                while (su3Var.b() > 0) {
                                    int iP = su3Var.p();
                                    if (iP == 0 || iP == 1 || iP == 2) {
                                        i++;
                                    }
                                }
                                if (i != 0) {
                                    su3Var.t(iC);
                                    int[] iArr = this.options;
                                    int length = iArr == null ? 0 : iArr.length;
                                    int[] iArr2 = new int[i + length];
                                    if (length != 0) {
                                        System.arraycopy(iArr, 0, iArr2, 0, length);
                                    }
                                    while (su3Var.b() > 0) {
                                        int iP2 = su3Var.p();
                                        if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                                            iArr2[length] = iP2;
                                            length++;
                                        }
                                    }
                                    this.options = iArr2;
                                }
                                su3Var.d(iE);
                            }
                        } else {
                            int I = sb8.I(su3Var, 16);
                            int[] iArr3 = new int[I];
                            int i2 = 0;
                            for (int i3 = 0; i3 < I; i3++) {
                                if (i3 != 0) {
                                    su3Var.s();
                                }
                                int iP3 = su3Var.p();
                                if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                                    iArr3[i2] = iP3;
                                    i2++;
                                }
                            }
                            if (i2 != 0) {
                                int[] iArr4 = this.options;
                                int length2 = iArr4 == null ? 0 : iArr4.length;
                                if (length2 == 0 && i2 == I) {
                                    this.options = iArr3;
                                } else {
                                    int[] iArr5 = new int[length2 + i2];
                                    if (length2 != 0) {
                                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                    }
                                    System.arraycopy(iArr3, 0, iArr5, length2, i2);
                                    this.options = iArr5;
                                }
                            }
                        }
                    } else {
                        this.dontDisturbUntil = su3Var.q();
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.dontDisturbUntil;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                int[] iArr = this.options;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.options;
                        if (i >= iArr2.length) {
                            break;
                        }
                        uu3Var.w(2, iArr2[i]);
                        i++;
                    }
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    uu3Var.x(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    uu3Var.x(4, j3);
                }
                boolean z = this.hideLiveLocationPanel;
                if (z) {
                    uu3Var.r(6, z);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    uu3Var.x(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    uu3Var.x(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                if (j6 != 0) {
                    uu3Var.x(9, j6);
                }
            }

            public static ChatSettings parseFrom(su3 su3Var) throws IOException {
                return new ChatSettings().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class ChatSubject extends sia {
            private static volatile ChatSubject[] _emptyArray;
            public long[] organizationIds;

            public ChatSubject() {
                clear();
            }

            public static ChatSubject[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSubject[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSubject parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSubject) sia.mergeFrom(new ChatSubject(), bArr);
            }

            public ChatSubject clear() {
                this.organizationIds = sb8.f;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long[] jArr = this.organizationIds;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += uu3.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.sia
            public ChatSubject mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        int I = sb8.I(su3Var, 8);
                        long[] jArr = this.organizationIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.organizationIds = jArr2;
                    } else if (iS == 10) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.organizationIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.organizationIds = jArr4;
                        su3Var.d(iE);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long[] jArr = this.organizationIds;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return;
                    }
                    uu3Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static ChatSubject parseFrom(su3 su3Var) throws IOException {
                return new ChatSubject().mergeFrom(su3Var);
            }
        }

        public static final class Chunk extends sia {
            private static volatile Chunk[] _emptyArray;
            public long endTime;
            public long startTime;

            public Chunk() {
                clear();
            }

            public static Chunk[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Chunk[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Chunk) sia.mergeFrom(new Chunk(), bArr);
            }

            public Chunk clear() {
                this.startTime = 0L;
                this.endTime = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long j = this.startTime;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                long j2 = this.endTime;
                return j2 != 0 ? uu3.h(2, j2) + iH : iH;
            }

            @Override // defpackage.sia
            public Chunk mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.startTime = su3Var.q();
                    } else if (iS == 16) {
                        this.endTime = su3Var.q();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.startTime;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                long j2 = this.endTime;
                if (j2 != 0) {
                    uu3Var.x(2, j2);
                }
            }

            public static Chunk parseFrom(su3 su3Var) throws IOException {
                return new Chunk().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class LiveStream extends sia {
            private static volatile LiveStream[] _emptyArray;
            public Attaches.Attach media;
            public long updateTime;

            public LiveStream() {
                clear();
            }

            public static LiveStream[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LiveStream[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LiveStream parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LiveStream) sia.mergeFrom(new LiveStream(), bArr);
            }

            public LiveStream clear() {
                this.updateTime = 0L;
                this.media = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long j = this.updateTime;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                Attaches.Attach attach = this.media;
                return attach != null ? uu3.i(2, attach) + iH : iH;
            }

            @Override // defpackage.sia
            public LiveStream mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.updateTime = su3Var.q();
                    } else if (iS == 18) {
                        if (this.media == null) {
                            this.media = new Attaches.Attach();
                        }
                        su3Var.j(this.media);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.updateTime;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                Attaches.Attach attach = this.media;
                if (attach != null) {
                    uu3Var.y(2, attach);
                }
            }

            public static LiveStream parseFrom(su3 su3Var) throws IOException {
                return new LiveStream().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class PushMessage extends sia {
            private static volatile PushMessage[] _emptyArray;
            public long id;
            public String text;
            public long time;

            public PushMessage() {
                clear();
            }

            public static PushMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new PushMessage[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (PushMessage) sia.mergeFrom(new PushMessage(), bArr);
            }

            public PushMessage clear() {
                this.id = 0L;
                this.time = 0L;
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? uu3.h(1, j) : 0;
                long j2 = this.time;
                if (j2 != 0) {
                    iH += uu3.h(2, j2);
                }
                return !this.text.equals("") ? uu3.l(3, this.text) + iH : iH;
            }

            @Override // defpackage.sia
            public PushMessage mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.id = su3Var.q();
                    } else if (iS == 16) {
                        this.time = su3Var.q();
                    } else if (iS == 26) {
                        this.text = su3Var.r();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    uu3Var.x(1, j);
                }
                long j2 = this.time;
                if (j2 != 0) {
                    uu3Var.x(2, j2);
                }
                if (this.text.equals("")) {
                    return;
                }
                uu3Var.E(3, this.text);
            }

            public static PushMessage parseFrom(su3 su3Var) throws IOException {
                return new PushMessage().mergeFrom(su3Var);
            }
        }

        public static final class Section extends sia {
            private static volatile Section[] _emptyArray;
            public boolean collapsed;
            public String id;
            public long marker;
            public long[] stickerSets;
            public long[] stickers;
            public String title;
            public int totalCount;

            public Section() {
                clear();
            }

            public static Section[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Section[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Section) sia.mergeFrom(new Section(), bArr);
            }

            public Section clear() {
                this.id = "";
                this.title = "";
                long[] jArr = sb8.f;
                this.stickers = jArr;
                this.marker = 0L;
                this.collapsed = false;
                this.stickerSets = jArr;
                this.totalCount = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long[] jArr;
                long[] jArr2;
                int i = 0;
                int iL = !this.id.equals("") ? uu3.l(1, this.id) : 0;
                if (!this.title.equals("")) {
                    iL += uu3.l(2, this.title);
                }
                long[] jArr3 = this.stickers;
                if (jArr3 != null && jArr3.length > 0) {
                    int i2 = 0;
                    int iK = 0;
                    while (true) {
                        jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        iK += uu3.k(jArr2[i2]);
                        i2++;
                    }
                    iL = iL + iK + jArr2.length;
                }
                long j = this.marker;
                if (j != 0) {
                    iL += uu3.h(4, j);
                }
                if (this.collapsed) {
                    iL += uu3.a(5);
                }
                long[] jArr4 = this.stickerSets;
                if (jArr4 != null && jArr4.length > 0) {
                    int iK2 = 0;
                    while (true) {
                        jArr = this.stickerSets;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK2 += uu3.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK2 + jArr.length;
                }
                int i3 = this.totalCount;
                return i3 != 0 ? uu3.f(7, i3) + iL : iL;
            }

            @Override // defpackage.sia
            public Section mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.id = su3Var.r();
                    } else if (iS == 18) {
                        this.title = su3Var.r();
                    } else if (iS == 24) {
                        int I = sb8.I(su3Var, 24);
                        long[] jArr = this.stickers;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.stickers = jArr2;
                    } else if (iS == 26) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.stickers;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.stickers = jArr4;
                        su3Var.d(iE);
                    } else if (iS == 32) {
                        this.marker = su3Var.q();
                    } else if (iS == 40) {
                        this.collapsed = su3Var.f();
                    } else if (iS == 48) {
                        int I2 = sb8.I(su3Var, 48);
                        long[] jArr5 = this.stickerSets;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = I2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = su3Var.q();
                            su3Var.s();
                            length3++;
                        }
                        jArr6[length3] = su3Var.q();
                        this.stickerSets = jArr6;
                    } else if (iS == 50) {
                        int iE2 = su3Var.e(su3Var.p());
                        int iC2 = su3Var.c();
                        int i5 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i5++;
                        }
                        su3Var.t(iC2);
                        long[] jArr7 = this.stickerSets;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = su3Var.q();
                            length4++;
                        }
                        this.stickerSets = jArr8;
                        su3Var.d(iE2);
                    } else if (iS == 56) {
                        this.totalCount = su3Var.p();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (!this.id.equals("")) {
                    uu3Var.E(1, this.id);
                }
                if (!this.title.equals("")) {
                    uu3Var.E(2, this.title);
                }
                long[] jArr = this.stickers;
                int i = 0;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        uu3Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                long j = this.marker;
                if (j != 0) {
                    uu3Var.x(4, j);
                }
                boolean z = this.collapsed;
                if (z) {
                    uu3Var.r(5, z);
                }
                long[] jArr3 = this.stickerSets;
                if (jArr3 != null && jArr3.length > 0) {
                    while (true) {
                        long[] jArr4 = this.stickerSets;
                        if (i >= jArr4.length) {
                            break;
                        }
                        uu3Var.x(6, jArr4[i]);
                        i++;
                    }
                }
                int i3 = this.totalCount;
                if (i3 != 0) {
                    uu3Var.w(7, i3);
                }
            }

            public static Section parseFrom(su3 su3Var) throws IOException {
                return new Section().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class VideoConversation extends sia {
            public static final int BY_LINK = 1;
            public static final int FROM_CHAT = 2;
            public static final int UNKNOWN = 0;
            private static volatile VideoConversation[] _emptyArray;
            public int approxParticipantCount;
            public String conversationId;
            public String joinLink;
            public String mediaCallType;
            public long[] previewParticipantIds;
            public long startedAt;
            public int type;

            public VideoConversation() {
                clear();
            }

            public static VideoConversation[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new VideoConversation[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static VideoConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (VideoConversation) sia.mergeFrom(new VideoConversation(), bArr);
            }

            public VideoConversation clear() {
                this.conversationId = "";
                this.startedAt = 0L;
                this.joinLink = "";
                this.approxParticipantCount = 0;
                this.previewParticipantIds = sb8.f;
                this.type = 0;
                this.mediaCallType = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long[] jArr;
                int i = 0;
                int iL = !this.conversationId.equals("") ? uu3.l(1, this.conversationId) : 0;
                long j = this.startedAt;
                if (j != 0) {
                    iL += uu3.h(2, j);
                }
                if (!this.joinLink.equals("")) {
                    iL += uu3.l(3, this.joinLink);
                }
                int i2 = this.approxParticipantCount;
                if (i2 != 0) {
                    iL += uu3.f(4, i2);
                }
                long[] jArr2 = this.previewParticipantIds;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.previewParticipantIds;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK += uu3.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK + jArr.length;
                }
                int i3 = this.type;
                if (i3 != 0) {
                    iL += uu3.f(6, i3);
                }
                return !this.mediaCallType.equals("") ? uu3.l(7, this.mediaCallType) + iL : iL;
            }

            @Override // defpackage.sia
            public VideoConversation mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.conversationId = su3Var.r();
                    } else if (iS == 16) {
                        this.startedAt = su3Var.q();
                    } else if (iS == 26) {
                        this.joinLink = su3Var.r();
                    } else if (iS == 32) {
                        this.approxParticipantCount = su3Var.p();
                    } else if (iS == 40) {
                        int I = sb8.I(su3Var, 40);
                        long[] jArr = this.previewParticipantIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.previewParticipantIds = jArr2;
                    } else if (iS == 42) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.previewParticipantIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.previewParticipantIds = jArr4;
                        su3Var.d(iE);
                    } else if (iS == 48) {
                        int iP = su3Var.p();
                        if (iP == 0 || iP == 1 || iP == 2) {
                            this.type = iP;
                        }
                    } else if (iS == 58) {
                        this.mediaCallType = su3Var.r();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (!this.conversationId.equals("")) {
                    uu3Var.E(1, this.conversationId);
                }
                long j = this.startedAt;
                if (j != 0) {
                    uu3Var.x(2, j);
                }
                if (!this.joinLink.equals("")) {
                    uu3Var.E(3, this.joinLink);
                }
                int i = this.approxParticipantCount;
                if (i != 0) {
                    uu3Var.w(4, i);
                }
                long[] jArr = this.previewParticipantIds;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.previewParticipantIds;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        uu3Var.x(5, jArr2[i2]);
                        i2++;
                    }
                }
                int i3 = this.type;
                if (i3 != 0) {
                    uu3Var.w(6, i3);
                }
                if (this.mediaCallType.equals("")) {
                    return;
                }
                uu3Var.E(7, this.mediaCallType);
            }

            public static VideoConversation parseFrom(su3 su3Var) throws IOException {
                return new VideoConversation().mergeFrom(su3Var);
            }
        }

        public static Chat parseFrom(su3 su3Var) throws IOException {
            return new Chat().mergeFrom(su3Var);
        }
    }

    public static final class CallHistoryState extends sia {
        private static volatile CallHistoryState[] _emptyArray;
        public long backwardMarker;
        public Chat.Chunk chunk;
        public long forwardMarker;
        public boolean hasNext;
        public boolean hasPrev;
        public Map<Long, MissedMessagesItem> missedMessagesIds;

        public CallHistoryState() {
            clear();
        }

        public static CallHistoryState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryState[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CallHistoryState) sia.mergeFrom(new CallHistoryState(), bArr);
        }

        public CallHistoryState clear() {
            this.chunk = null;
            this.forwardMarker = 0L;
            this.backwardMarker = 0L;
            this.hasNext = false;
            this.hasPrev = false;
            this.missedMessagesIds = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            Chat.Chunk chunk = this.chunk;
            int i = chunk != null ? uu3.i(1, chunk) : 0;
            long j = this.forwardMarker;
            if (j != 0) {
                i += uu3.h(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                i += uu3.h(3, j2);
            }
            if (this.hasNext) {
                i += uu3.a(4);
            }
            if (this.hasPrev) {
                i += uu3.a(5);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            return map != null ? ck8.a(map, 6, 3, 11) + i : i;
        }

        @Override // defpackage.sia
        public CallHistoryState mergeFrom(su3 su3Var) throws IOException {
            su3 su3Var2;
            em9 em9Var = cqk.c;
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    su3Var2 = su3Var;
                    if (this.chunk == null) {
                        this.chunk = new Chat.Chunk();
                    }
                    su3Var2.j(this.chunk);
                } else if (iS == 16) {
                    su3Var2 = su3Var;
                    this.forwardMarker = su3Var2.q();
                } else if (iS == 24) {
                    su3Var2 = su3Var;
                    this.backwardMarker = su3Var2.q();
                } else if (iS == 32) {
                    su3Var2 = su3Var;
                    this.hasNext = su3Var2.f();
                } else if (iS == 40) {
                    su3Var2 = su3Var;
                    this.hasPrev = su3Var2.f();
                } else if (iS == 50) {
                    su3Var2 = su3Var;
                    this.missedMessagesIds = ck8.b(su3Var2, this.missedMessagesIds, em9Var, 3, 11, new MissedMessagesItem(), 8, 18);
                } else {
                    if (!su3Var.u(iS)) {
                        break;
                    }
                    su3Var2 = su3Var;
                }
                su3Var = su3Var2;
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            Chat.Chunk chunk = this.chunk;
            if (chunk != null) {
                uu3Var.y(1, chunk);
            }
            long j = this.forwardMarker;
            if (j != 0) {
                uu3Var.x(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                uu3Var.x(3, j2);
            }
            boolean z = this.hasNext;
            if (z) {
                uu3Var.r(4, z);
            }
            boolean z2 = this.hasPrev;
            if (z2) {
                uu3Var.r(5, z2);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            if (map != null) {
                ck8.d(uu3Var, map, 6, 3, 11);
            }
        }

        public static final class MissedMessagesItem extends sia {
            private static volatile MissedMessagesItem[] _emptyArray;
            public long[] ids;

            public MissedMessagesItem() {
                clear();
            }

            public static MissedMessagesItem[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MissedMessagesItem[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MissedMessagesItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MissedMessagesItem) sia.mergeFrom(new MissedMessagesItem(), bArr);
            }

            public MissedMessagesItem clear() {
                this.ids = sb8.f;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                long[] jArr = this.ids;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += uu3.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.sia
            public MissedMessagesItem mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        int I = sb8.I(su3Var, 8);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.ids = jArr2;
                    } else if (iS == 10) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        su3Var.d(iE);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                long[] jArr = this.ids;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return;
                    }
                    uu3Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static MissedMessagesItem parseFrom(su3 su3Var) throws IOException {
                return new MissedMessagesItem().mergeFrom(su3Var);
            }
        }

        public static CallHistoryState parseFrom(su3 su3Var) throws IOException {
            return new CallHistoryState().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Contact extends sia {
        public static final int AccountStatus_ACTIVE = 0;
        public static final int AccountStatus_BLOCKED = 1;
        public static final int AccountStatus_DELETED = 2;
        public static final int BLOCKED = 1;
        public static final int BOT = 1;
        public static final int EXTERNAL = 1;
        public static final int FEMALE = 2;
        public static final int HAS_WEBAPP = 3;
        public static final int IS_NULL = 0;
        public static final int MALE = 1;
        public static final int NO_FORWARD = 5;
        public static final int OFFICIAL = 0;
        public static final int PortalStatus_BLOCKED = 0;
        public static final int PortalStatus_REMOVED = 1;
        public static final int REMOVED = 2;
        public static final int RESTRICTED = 4;
        public static final int SERVICE_ACCOUNT = 2;
        public static final int UNKNOWN = 0;
        public static final int USER_LIST = 0;
        private static volatile Contact[] _emptyArray;
        public int accountStatus;
        public String baseRawUrl;
        public String baseUrl;
        public String birthday;
        public String country;
        public String description;
        public String deviceAvatarUrl;
        public String deviceName;
        public int flags;
        public int gender;
        public long lastSearchClickTime;
        public long lastShowingUnknownContactBar;
        public long lastSyncTime;
        public long lastUpdateTime;
        public String link;
        public MenuButton menuButton;
        public ContactName[] names;
        public int[] options;
        public long[] organizationIds;
        public long photoId;
        public int[] profileOptions;
        public long registrationTime;
        public long serverId;
        public long serverPhone;
        public int settings;
        public StartMessage startMessage;
        public int status;
        public int type;
        public long unbindOkPanelCloseTime;

        public Contact() {
            clear();
        }

        public static Contact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Contact[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Contact) sia.mergeFrom(new Contact(), bArr);
        }

        public Contact clear() {
            this.serverId = 0L;
            this.deviceAvatarUrl = "";
            this.deviceName = "";
            this.lastUpdateTime = 0L;
            this.serverPhone = 0L;
            this.status = 0;
            this.type = 0;
            this.gender = 0;
            this.settings = 0;
            this.names = ContactName.emptyArray();
            int[] iArr = sb8.e;
            this.options = iArr;
            this.description = "";
            this.link = "";
            this.birthday = "";
            this.photoId = 0L;
            this.baseUrl = "";
            this.baseRawUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastSyncTime = 0L;
            this.lastShowingUnknownContactBar = 0L;
            this.menuButton = null;
            this.profileOptions = iArr;
            this.startMessage = null;
            this.country = "";
            this.organizationIds = sb8.f;
            this.registrationTime = 0L;
            this.accountStatus = 0;
            this.flags = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long[] jArr;
            int[] iArr;
            int[] iArr2;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.deviceAvatarUrl.equals("")) {
                iH += uu3.l(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                iH += uu3.l(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                iH += uu3.h(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                iH += uu3.h(9, j3);
            }
            int i2 = this.status;
            if (i2 != 0) {
                iH += uu3.f(10, i2);
            }
            int i3 = this.type;
            if (i3 != 0) {
                iH += uu3.f(11, i3);
            }
            int i4 = this.gender;
            if (i4 != 0) {
                iH += uu3.f(12, i4);
            }
            int i5 = this.settings;
            if (i5 != 0) {
                iH += uu3.f(13, i5);
            }
            ContactName[] contactNameArr = this.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        iH = uu3.i(14, contactName) + iH;
                    }
                    i6++;
                }
            }
            int[] iArr3 = this.options;
            if (iArr3 != null && iArr3.length > 0) {
                int i7 = 0;
                int iG = 0;
                while (true) {
                    iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    iG += uu3.g(iArr2[i7]);
                    i7++;
                }
                iH = iH + iG + iArr2.length;
            }
            if (!this.description.equals("")) {
                iH += uu3.l(16, this.description);
            }
            if (!this.link.equals("")) {
                iH += uu3.l(17, this.link);
            }
            if (!this.birthday.equals("")) {
                iH += uu3.l(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                iH += uu3.h(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                iH += uu3.l(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                iH += uu3.l(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                iH += uu3.h(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                iH += uu3.h(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                iH += uu3.h(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                iH += uu3.h(25, j8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                iH += uu3.i(28, menuButton);
            }
            int[] iArr4 = this.profileOptions;
            if (iArr4 != null && iArr4.length > 0) {
                int i8 = 0;
                int iG2 = 0;
                while (true) {
                    iArr = this.profileOptions;
                    if (i8 >= iArr.length) {
                        break;
                    }
                    iG2 += uu3.g(iArr[i8]);
                    i8++;
                }
                iH = iH + iG2 + (iArr.length * 2);
            }
            StartMessage startMessage = this.startMessage;
            if (startMessage != null) {
                iH += uu3.i(30, startMessage);
            }
            if (!this.country.equals("")) {
                iH += uu3.l(31, this.country);
            }
            long[] jArr2 = this.organizationIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.organizationIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += uu3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + (jArr.length * 2);
            }
            long j9 = this.registrationTime;
            if (j9 != 0) {
                iH += uu3.h(33, j9);
            }
            int i9 = this.accountStatus;
            if (i9 != 0) {
                iH += uu3.f(34, i9);
            }
            int i10 = this.flags;
            return i10 != 0 ? uu3.f(36, i10) + iH : iH;
        }

        @Override // defpackage.sia
        public Contact mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.serverId = su3Var.q();
                        break;
                    case 34:
                        this.deviceAvatarUrl = su3Var.r();
                        break;
                    case 50:
                        this.deviceName = su3Var.r();
                        break;
                    case 64:
                        this.lastUpdateTime = su3Var.q();
                        break;
                    case 72:
                        this.serverPhone = su3Var.q();
                        break;
                    case 80:
                        int iP = su3Var.p();
                        if (iP == 0 || iP == 1 || iP == 2) {
                            this.status = iP;
                        }
                        break;
                    case 88:
                        int iP2 = su3Var.p();
                        if (iP2 == 0 || iP2 == 1) {
                            this.type = iP2;
                        }
                        break;
                    case 96:
                        int iP3 = su3Var.p();
                        if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                            this.gender = iP3;
                        }
                        break;
                    case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                        this.settings = su3Var.p();
                        break;
                    case 114:
                        int I = sb8.I(su3Var, 114);
                        ContactName[] contactNameArr = this.names;
                        int length = contactNameArr == null ? 0 : contactNameArr.length;
                        int i = I + length;
                        ContactName[] contactNameArr2 = new ContactName[i];
                        if (length != 0) {
                            System.arraycopy(contactNameArr, 0, contactNameArr2, 0, length);
                        }
                        while (length < i - 1) {
                            ContactName contactName = new ContactName();
                            contactNameArr2[length] = contactName;
                            su3Var.j(contactName);
                            su3Var.s();
                            length++;
                        }
                        ContactName contactName2 = new ContactName();
                        contactNameArr2[length] = contactName2;
                        su3Var.j(contactName2);
                        this.names = contactNameArr2;
                        break;
                    case 120:
                        int I2 = sb8.I(su3Var, 120);
                        int[] iArr = new int[I2];
                        int i2 = 0;
                        for (int i3 = 0; i3 < I2; i3++) {
                            if (i3 != 0) {
                                su3Var.s();
                            }
                            int iP4 = su3Var.p();
                            if (iP4 == 0 || iP4 == 1 || iP4 == 2 || iP4 == 3 || iP4 == 4 || iP4 == 5) {
                                iArr[i2] = iP4;
                                i2++;
                            }
                        }
                        if (i2 != 0) {
                            int[] iArr2 = this.options;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 == 0 && i2 == I2) {
                                this.options = iArr;
                            } else {
                                int[] iArr3 = new int[length2 + i2];
                                if (length2 != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i2);
                                this.options = iArr3;
                            }
                        }
                        break;
                    case 122:
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i4 = 0;
                        while (su3Var.b() > 0) {
                            int iP5 = su3Var.p();
                            if (iP5 == 0 || iP5 == 1 || iP5 == 2 || iP5 == 3 || iP5 == 4 || iP5 == 5) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            su3Var.t(iC);
                            int[] iArr4 = this.options;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i4 + length3];
                            if (length3 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length3);
                            }
                            while (su3Var.b() > 0) {
                                int iP6 = su3Var.p();
                                if (iP6 == 0 || iP6 == 1 || iP6 == 2 || iP6 == 3 || iP6 == 4 || iP6 == 5) {
                                    iArr5[length3] = iP6;
                                    length3++;
                                }
                            }
                            this.options = iArr5;
                        }
                        su3Var.d(iE);
                        break;
                    case 130:
                        this.description = su3Var.r();
                        break;
                    case 138:
                        this.link = su3Var.r();
                        break;
                    case 146:
                        this.birthday = su3Var.r();
                        break;
                    case 152:
                        this.photoId = su3Var.q();
                        break;
                    case 162:
                        this.baseUrl = su3Var.r();
                        break;
                    case 170:
                        this.baseRawUrl = su3Var.r();
                        break;
                    case 176:
                        this.unbindOkPanelCloseTime = su3Var.q();
                        break;
                    case 184:
                        this.lastSearchClickTime = su3Var.q();
                        break;
                    case 192:
                        this.lastSyncTime = su3Var.q();
                        break;
                    case 200:
                        this.lastShowingUnknownContactBar = su3Var.q();
                        break;
                    case 226:
                        if (this.menuButton == null) {
                            this.menuButton = new MenuButton();
                        }
                        su3Var.j(this.menuButton);
                        break;
                    case 232:
                        int I3 = sb8.I(su3Var, 232);
                        int[] iArr6 = this.profileOptions;
                        int length4 = iArr6 == null ? 0 : iArr6.length;
                        int i5 = I3 + length4;
                        int[] iArr7 = new int[i5];
                        if (length4 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            iArr7[length4] = su3Var.p();
                            su3Var.s();
                            length4++;
                        }
                        iArr7[length4] = su3Var.p();
                        this.profileOptions = iArr7;
                        break;
                    case 234:
                        int iE2 = su3Var.e(su3Var.p());
                        int iC2 = su3Var.c();
                        int i6 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.p();
                            i6++;
                        }
                        su3Var.t(iC2);
                        int[] iArr8 = this.profileOptions;
                        int length5 = iArr8 == null ? 0 : iArr8.length;
                        int i7 = i6 + length5;
                        int[] iArr9 = new int[i7];
                        if (length5 != 0) {
                            System.arraycopy(iArr8, 0, iArr9, 0, length5);
                        }
                        while (length5 < i7) {
                            iArr9[length5] = su3Var.p();
                            length5++;
                        }
                        this.profileOptions = iArr9;
                        su3Var.d(iE2);
                        break;
                    case 242:
                        if (this.startMessage == null) {
                            this.startMessage = new StartMessage();
                        }
                        su3Var.j(this.startMessage);
                        break;
                    case 250:
                        this.country = su3Var.r();
                        break;
                    case np0.n /* 256 */:
                        int I4 = sb8.I(su3Var, np0.n);
                        long[] jArr = this.organizationIds;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i8 = I4 + length6;
                        long[] jArr2 = new long[i8];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i8 - 1) {
                            jArr2[length6] = su3Var.q();
                            su3Var.s();
                            length6++;
                        }
                        jArr2[length6] = su3Var.q();
                        this.organizationIds = jArr2;
                        break;
                    case 258:
                        int iE3 = su3Var.e(su3Var.p());
                        int iC3 = su3Var.c();
                        int i9 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i9++;
                        }
                        su3Var.t(iC3);
                        long[] jArr3 = this.organizationIds;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i10 = i9 + length7;
                        long[] jArr4 = new long[i10];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i10) {
                            jArr4[length7] = su3Var.q();
                            length7++;
                        }
                        this.organizationIds = jArr4;
                        su3Var.d(iE3);
                        break;
                    case 264:
                        this.registrationTime = su3Var.q();
                        break;
                    case 272:
                        int iP7 = su3Var.p();
                        if (iP7 == 0 || iP7 == 1 || iP7 == 2) {
                            this.accountStatus = iP7;
                        }
                        break;
                    case 288:
                        this.flags = su3Var.p();
                        break;
                    default:
                        if (su3Var.u(iS)) {
                        }
                        break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.deviceAvatarUrl.equals("")) {
                uu3Var.E(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                uu3Var.E(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                uu3Var.x(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                uu3Var.x(9, j3);
            }
            int i = this.status;
            if (i != 0) {
                uu3Var.w(10, i);
            }
            int i2 = this.type;
            if (i2 != 0) {
                uu3Var.w(11, i2);
            }
            int i3 = this.gender;
            if (i3 != 0) {
                uu3Var.w(12, i3);
            }
            int i4 = this.settings;
            if (i4 != 0) {
                uu3Var.w(13, i4);
            }
            ContactName[] contactNameArr = this.names;
            int i5 = 0;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        uu3Var.y(14, contactName);
                    }
                    i6++;
                }
            }
            int[] iArr = this.options;
            if (iArr != null && iArr.length > 0) {
                int i7 = 0;
                while (true) {
                    int[] iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    uu3Var.w(15, iArr2[i7]);
                    i7++;
                }
            }
            if (!this.description.equals("")) {
                uu3Var.E(16, this.description);
            }
            if (!this.link.equals("")) {
                uu3Var.E(17, this.link);
            }
            if (!this.birthday.equals("")) {
                uu3Var.E(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                uu3Var.x(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                uu3Var.E(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                uu3Var.E(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                uu3Var.x(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                uu3Var.x(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                uu3Var.x(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                uu3Var.x(25, j8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                uu3Var.y(28, menuButton);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 != null && iArr3.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr4 = this.profileOptions;
                    if (i8 >= iArr4.length) {
                        break;
                    }
                    uu3Var.w(29, iArr4[i8]);
                    i8++;
                }
            }
            StartMessage startMessage = this.startMessage;
            if (startMessage != null) {
                uu3Var.y(30, startMessage);
            }
            if (!this.country.equals("")) {
                uu3Var.E(31, this.country);
            }
            long[] jArr = this.organizationIds;
            if (jArr != null && jArr.length > 0) {
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i5 >= jArr2.length) {
                        break;
                    }
                    uu3Var.x(32, jArr2[i5]);
                    i5++;
                }
            }
            long j9 = this.registrationTime;
            if (j9 != 0) {
                uu3Var.x(33, j9);
            }
            int i9 = this.accountStatus;
            if (i9 != 0) {
                uu3Var.w(34, i9);
            }
            int i10 = this.flags;
            if (i10 != 0) {
                uu3Var.w(36, i10);
            }
        }

        public static final class ContactName extends sia {
            public static final int CUSTOM = 1;
            public static final int DEVICE = 2;
            public static final int ONEME = 3;
            public static final int UNKNOWN = 0;
            private static volatile ContactName[] _emptyArray;
            public String lastName;
            public String name;
            public int type;

            public ContactName() {
                clear();
            }

            public static ContactName[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ContactName[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ContactName parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ContactName) sia.mergeFrom(new ContactName(), bArr);
            }

            public ContactName clear() {
                this.name = "";
                this.type = 0;
                this.lastName = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int iL = !this.name.equals("") ? uu3.l(1, this.name) : 0;
                int i = this.type;
                if (i != 0) {
                    iL += uu3.f(2, i);
                }
                return !this.lastName.equals("") ? uu3.l(3, this.lastName) + iL : iL;
            }

            @Override // defpackage.sia
            public ContactName mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.name = su3Var.r();
                    } else if (iS == 16) {
                        int iP = su3Var.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                            this.type = iP;
                        }
                    } else if (iS == 26) {
                        this.lastName = su3Var.r();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (!this.name.equals("")) {
                    uu3Var.E(1, this.name);
                }
                int i = this.type;
                if (i != 0) {
                    uu3Var.w(2, i);
                }
                if (this.lastName.equals("")) {
                    return;
                }
                uu3Var.E(3, this.lastName);
            }

            public static ContactName parseFrom(su3 su3Var) throws IOException {
                return new ContactName().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class MenuButton extends sia {
            private static volatile MenuButton[] _emptyArray;
            public String text;

            public MenuButton() {
                clear();
            }

            public static MenuButton[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MenuButton[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MenuButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MenuButton) sia.mergeFrom(new MenuButton(), bArr);
            }

            public MenuButton clear() {
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                if (this.text.equals("")) {
                    return 0;
                }
                return uu3.l(1, this.text);
            }

            @Override // defpackage.sia
            public MenuButton mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.text = su3Var.r();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (this.text.equals("")) {
                    return;
                }
                uu3Var.E(1, this.text);
            }

            public static MenuButton parseFrom(su3 su3Var) throws IOException {
                return new MenuButton().mergeFrom(su3Var);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class StartMessage extends sia {
            private static volatile StartMessage[] _emptyArray;
            public MessageElement[] elements;
            public Attaches.Attach media;
            public String text;

            public StartMessage() {
                clear();
            }

            public static StartMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new StartMessage[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static StartMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (StartMessage) sia.mergeFrom(new StartMessage(), bArr);
            }

            public StartMessage clear() {
                this.media = null;
                this.text = "";
                this.elements = MessageElement.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                Attaches.Attach attach = this.media;
                int i = 0;
                int i2 = attach != null ? uu3.i(1, attach) : 0;
                if (!this.text.equals("")) {
                    i2 += uu3.l(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr != null && messageElementArr.length > 0) {
                    while (true) {
                        MessageElement[] messageElementArr2 = this.elements;
                        if (i >= messageElementArr2.length) {
                            break;
                        }
                        MessageElement messageElement = messageElementArr2[i];
                        if (messageElement != null) {
                            i2 = uu3.i(3, messageElement) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.sia
            public StartMessage mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        if (this.media == null) {
                            this.media = new Attaches.Attach();
                        }
                        su3Var.j(this.media);
                    } else if (iS == 18) {
                        this.text = su3Var.r();
                    } else if (iS == 26) {
                        int I = sb8.I(su3Var, 26);
                        MessageElement[] messageElementArr = this.elements;
                        int length = messageElementArr == null ? 0 : messageElementArr.length;
                        int i = I + length;
                        MessageElement[] messageElementArr2 = new MessageElement[i];
                        if (length != 0) {
                            System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                        }
                        while (length < i - 1) {
                            MessageElement messageElement = new MessageElement();
                            messageElementArr2[length] = messageElement;
                            su3Var.j(messageElement);
                            su3Var.s();
                            length++;
                        }
                        MessageElement messageElement2 = new MessageElement();
                        messageElementArr2[length] = messageElement2;
                        su3Var.j(messageElement2);
                        this.elements = messageElementArr2;
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                Attaches.Attach attach = this.media;
                if (attach != null) {
                    uu3Var.y(1, attach);
                }
                if (!this.text.equals("")) {
                    uu3Var.E(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr == null || messageElementArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    MessageElement[] messageElementArr2 = this.elements;
                    if (i >= messageElementArr2.length) {
                        return;
                    }
                    MessageElement messageElement = messageElementArr2[i];
                    if (messageElement != null) {
                        uu3Var.y(3, messageElement);
                    }
                    i++;
                }
            }

            public static StartMessage parseFrom(su3 su3Var) throws IOException {
                return new StartMessage().mergeFrom(su3Var);
            }
        }

        public static Contact parseFrom(su3 su3Var) throws IOException {
            return new Contact().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MessageElement extends sia {
        public static final int ANIMOJI = 10;
        public static final int CODE = 9;
        public static final int EMPHASIZED = 4;
        public static final int GROUP_MENTION = 1;
        public static final int HEADING = 8;
        public static final int LINK = 5;
        public static final int MONOSPACED = 3;
        public static final int QUOTE = 11;
        public static final int STRIKETHROUGH = 6;
        public static final int STRONG = 2;
        public static final int UNDERLINE = 7;
        public static final int USER_MENTION = 0;
        private static volatile MessageElement[] _emptyArray;
        public long entityId;
        public String entityName;
        public int from;
        public int length;
        public LinkAttributes linkAttributes;
        public int type;

        public MessageElement() {
            clear();
        }

        public static MessageElement[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElement[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElement parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElement) sia.mergeFrom(new MessageElement(), bArr);
        }

        public MessageElement clear() {
            this.entityId = 0L;
            this.entityName = "";
            this.type = 0;
            this.from = 0;
            this.length = 0;
            this.linkAttributes = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.entityId;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.entityName.equals("")) {
                iH += uu3.l(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                iH += uu3.f(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                iH += uu3.f(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                iH += uu3.f(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            return linkAttributes != null ? uu3.i(6, linkAttributes) + iH : iH;
        }

        @Override // defpackage.sia
        public MessageElement mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS != 0) {
                    if (iS == 8) {
                        this.entityId = su3Var.q();
                    } else if (iS == 18) {
                        this.entityName = su3Var.r();
                    } else if (iS == 24) {
                        int iP = su3Var.p();
                        switch (iP) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                this.type = iP;
                                break;
                        }
                    } else if (iS == 32) {
                        this.from = su3Var.p();
                    } else if (iS == 40) {
                        this.length = su3Var.p();
                    } else if (iS == 50) {
                        if (this.linkAttributes == null) {
                            this.linkAttributes = new LinkAttributes();
                        }
                        su3Var.j(this.linkAttributes);
                    } else if (!su3Var.u(iS)) {
                    }
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.entityId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.entityName.equals("")) {
                uu3Var.E(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                uu3Var.w(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                uu3Var.w(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                uu3Var.w(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            if (linkAttributes != null) {
                uu3Var.y(6, linkAttributes);
            }
        }

        public static final class LinkAttributes extends sia {
            private static volatile LinkAttributes[] _emptyArray;
            public long checkResultMask;
            public boolean hasResultMask;
            public String url;

            public LinkAttributes() {
                clear();
            }

            public static LinkAttributes[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (ck8.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LinkAttributes[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LinkAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LinkAttributes) sia.mergeFrom(new LinkAttributes(), bArr);
            }

            public LinkAttributes clear() {
                this.url = "";
                this.hasResultMask = false;
                this.checkResultMask = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.sia
            public int computeSerializedSize() {
                int iL = !this.url.equals("") ? uu3.l(1, this.url) : 0;
                if (this.hasResultMask) {
                    iL += uu3.a(2);
                }
                long j = this.checkResultMask;
                return j != 0 ? uu3.h(3, j) + iL : iL;
            }

            @Override // defpackage.sia
            public LinkAttributes mergeFrom(su3 su3Var) throws IOException {
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.url = su3Var.r();
                    } else if (iS == 16) {
                        this.hasResultMask = su3Var.f();
                    } else if (iS == 24) {
                        this.checkResultMask = su3Var.q();
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }

            @Override // defpackage.sia
            public void writeTo(uu3 uu3Var) throws IOException {
                if (!this.url.equals("")) {
                    uu3Var.E(1, this.url);
                }
                boolean z = this.hasResultMask;
                if (z) {
                    uu3Var.r(2, z);
                }
                long j = this.checkResultMask;
                if (j != 0) {
                    uu3Var.x(3, j);
                }
            }

            public static LinkAttributes parseFrom(su3 su3Var) throws IOException {
                return new LinkAttributes().mergeFrom(su3Var);
            }
        }

        public static MessageElement parseFrom(su3 su3Var) throws IOException {
            return new MessageElement().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LogEvent extends sia {
        private static volatile LogEvent[] _emptyArray;
        public String event;
        public byte[] params;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public LogEvent() {
            clear();
        }

        public static LogEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LogEvent[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LogEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LogEvent) sia.mergeFrom(new LogEvent(), bArr);
        }

        public LogEvent clear() {
            this.time = 0L;
            this.type = "";
            this.event = "";
            this.params = sb8.i;
            this.userId = 0L;
            this.sessionId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.time;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            if (!this.type.equals("")) {
                iH += uu3.l(2, this.type);
            }
            if (!this.event.equals("")) {
                iH += uu3.l(3, this.event);
            }
            if (!Arrays.equals(this.params, sb8.i)) {
                iH += uu3.b(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                iH += uu3.h(5, j2);
            }
            long j3 = this.sessionId;
            return j3 != 0 ? uu3.h(6, j3) + iH : iH;
        }

        @Override // defpackage.sia
        public LogEvent mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.time = su3Var.q();
                } else if (iS == 18) {
                    this.type = su3Var.r();
                } else if (iS == 26) {
                    this.event = su3Var.r();
                } else if (iS == 34) {
                    this.params = su3Var.g();
                } else if (iS == 40) {
                    this.userId = su3Var.q();
                } else if (iS == 48) {
                    this.sessionId = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.time;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            if (!this.type.equals("")) {
                uu3Var.E(2, this.type);
            }
            if (!this.event.equals("")) {
                uu3Var.E(3, this.event);
            }
            if (!Arrays.equals(this.params, sb8.i)) {
                uu3Var.s(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                uu3Var.x(5, j2);
            }
            long j3 = this.sessionId;
            if (j3 != 0) {
                uu3Var.x(6, j3);
            }
        }

        public static LogEvent parseFrom(su3 su3Var) throws IOException {
            return new LogEvent().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MessageElements extends sia {
        private static volatile MessageElements[] _emptyArray;
        public MessageElement[] elements;

        public MessageElements() {
            clear();
        }

        public static MessageElements[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElements[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElements parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElements) sia.mergeFrom(new MessageElements(), bArr);
        }

        public MessageElements clear() {
            this.elements = MessageElement.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            MessageElement[] messageElementArr = this.elements;
            int i = 0;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return i2;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    i2 = uu3.i(1, messageElement) + i2;
                }
                i++;
            }
        }

        @Override // defpackage.sia
        public MessageElements mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int I = sb8.I(su3Var, 10);
                    MessageElement[] messageElementArr = this.elements;
                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                    int i = I + length;
                    MessageElement[] messageElementArr2 = new MessageElement[i];
                    if (length != 0) {
                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageElement messageElement = new MessageElement();
                        messageElementArr2[length] = messageElement;
                        su3Var.j(messageElement);
                        su3Var.s();
                        length++;
                    }
                    MessageElement messageElement2 = new MessageElement();
                    messageElementArr2[length] = messageElement2;
                    su3Var.j(messageElement2);
                    this.elements = messageElementArr2;
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            MessageElement[] messageElementArr = this.elements;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    uu3Var.y(1, messageElement);
                }
                i++;
            }
        }

        public static MessageElements parseFrom(su3 su3Var) throws IOException {
            return new MessageElements().mergeFrom(su3Var);
        }
    }

    public static final class MessageReactionWithCount extends sia {
        private static volatile MessageReactionWithCount[] _emptyArray;
        public int count;
        public ReactionData reaction;

        public MessageReactionWithCount() {
            clear();
        }

        public static MessageReactionWithCount[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactionWithCount[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactionWithCount parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactionWithCount) sia.mergeFrom(new MessageReactionWithCount(), bArr);
        }

        public MessageReactionWithCount clear() {
            this.reaction = null;
            this.count = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            ReactionData reactionData = this.reaction;
            int i = reactionData != null ? uu3.i(1, reactionData) : 0;
            int i2 = this.count;
            return i2 != 0 ? uu3.f(2, i2) + i : i;
        }

        @Override // defpackage.sia
        public MessageReactionWithCount mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    if (this.reaction == null) {
                        this.reaction = new ReactionData();
                    }
                    su3Var.j(this.reaction);
                } else if (iS == 16) {
                    this.count = su3Var.p();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            ReactionData reactionData = this.reaction;
            if (reactionData != null) {
                uu3Var.y(1, reactionData);
            }
            int i = this.count;
            if (i != 0) {
                uu3Var.w(2, i);
            }
        }

        public static MessageReactionWithCount parseFrom(su3 su3Var) throws IOException {
            return new MessageReactionWithCount().mergeFrom(su3Var);
        }
    }

    public static final class MessageReactions extends sia {
        private static volatile MessageReactions[] _emptyArray;
        public MessageReactionWithCount[] reactions;
        public int totalCount;
        public ReactionData yourReaction;

        public MessageReactions() {
            clear();
        }

        public static MessageReactions[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactions[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactions) sia.mergeFrom(new MessageReactions(), bArr);
        }

        public MessageReactions clear() {
            this.reactions = MessageReactionWithCount.emptyArray();
            this.totalCount = 0;
            this.yourReaction = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            int iF = 0;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (iF >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[iF];
                    if (messageReactionWithCount != null) {
                        i = uu3.i(1, messageReactionWithCount) + i;
                    }
                    iF++;
                }
                iF = i;
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                iF += uu3.f(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            return reactionData != null ? uu3.i(3, reactionData) + iF : iF;
        }

        @Override // defpackage.sia
        public MessageReactions mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int I = sb8.I(su3Var, 10);
                    MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
                    int length = messageReactionWithCountArr == null ? 0 : messageReactionWithCountArr.length;
                    int i = I + length;
                    MessageReactionWithCount[] messageReactionWithCountArr2 = new MessageReactionWithCount[i];
                    if (length != 0) {
                        System.arraycopy(messageReactionWithCountArr, 0, messageReactionWithCountArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageReactionWithCount messageReactionWithCount = new MessageReactionWithCount();
                        messageReactionWithCountArr2[length] = messageReactionWithCount;
                        su3Var.j(messageReactionWithCount);
                        su3Var.s();
                        length++;
                    }
                    MessageReactionWithCount messageReactionWithCount2 = new MessageReactionWithCount();
                    messageReactionWithCountArr2[length] = messageReactionWithCount2;
                    su3Var.j(messageReactionWithCount2);
                    this.reactions = messageReactionWithCountArr2;
                } else if (iS == 16) {
                    this.totalCount = su3Var.p();
                } else if (iS == 26) {
                    if (this.yourReaction == null) {
                        this.yourReaction = new ReactionData();
                    }
                    su3Var.j(this.yourReaction);
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (i >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[i];
                    if (messageReactionWithCount != null) {
                        uu3Var.y(1, messageReactionWithCount);
                    }
                    i++;
                }
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                uu3Var.w(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            if (reactionData != null) {
                uu3Var.y(3, reactionData);
            }
        }

        public static MessageReactions parseFrom(su3 su3Var) throws IOException {
            return new MessageReactions().mergeFrom(su3Var);
        }
    }

    public static final class ReactionData extends sia {
        public static final int EMOJI = 0;
        public static final int STICKER = 1;
        private static volatile ReactionData[] _emptyArray;
        public String reaction;
        public int type;

        public ReactionData() {
            clear();
        }

        public static ReactionData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ReactionData[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ReactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ReactionData) sia.mergeFrom(new ReactionData(), bArr);
        }

        public ReactionData clear() {
            this.type = 0;
            this.reaction = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            int i = this.type;
            int iF = i != 0 ? uu3.f(1, i) : 0;
            return !this.reaction.equals("") ? uu3.l(2, this.reaction) + iF : iF;
        }

        @Override // defpackage.sia
        public ReactionData mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    int iP = su3Var.p();
                    if (iP == 0 || iP == 1) {
                        this.type = iP;
                    }
                } else if (iS == 18) {
                    this.reaction = su3Var.r();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            int i = this.type;
            if (i != 0) {
                uu3Var.w(1, i);
            }
            if (this.reaction.equals("")) {
                return;
            }
            uu3Var.E(2, this.reaction);
        }

        public static ReactionData parseFrom(su3 su3Var) throws IOException {
            return new ReactionData().mergeFrom(su3Var);
        }
    }

    public static final class RestrictionsInfo extends sia {
        private static volatile RestrictionsInfo[] _emptyArray;
        public long expiration;

        public RestrictionsInfo() {
            clear();
        }

        public static RestrictionsInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RestrictionsInfo[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static RestrictionsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RestrictionsInfo) sia.mergeFrom(new RestrictionsInfo(), bArr);
        }

        public RestrictionsInfo clear() {
            this.expiration = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.expiration;
            if (j != 0) {
                return uu3.h(1, j);
            }
            return 0;
        }

        @Override // defpackage.sia
        public RestrictionsInfo mergeFrom(su3 su3Var) throws IOException {
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.expiration = su3Var.q();
                } else if (!su3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.expiration;
            if (j != 0) {
                uu3Var.x(1, j);
            }
        }

        public static RestrictionsInfo parseFrom(su3 su3Var) throws IOException {
            return new RestrictionsInfo().mergeFrom(su3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SelfProfile extends sia {
        private static volatile SelfProfile[] _emptyArray;
        public int[] profileOptions;
        public Map<Integer, RestrictionsInfo> restrictions;
        public long serverId;

        public SelfProfile() {
            clear();
        }

        public static SelfProfile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (ck8.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SelfProfile[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static SelfProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SelfProfile) sia.mergeFrom(new SelfProfile(), bArr);
        }

        public SelfProfile clear() {
            this.serverId = 0L;
            this.restrictions = null;
            this.profileOptions = sb8.e;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.sia
        public int computeSerializedSize() {
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? uu3.h(1, j) : 0;
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                iH += ck8.a(map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return iH;
            }
            int iG = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return iH + iG + iArr2.length;
                }
                iG += uu3.g(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.sia
        public SelfProfile mergeFrom(su3 su3Var) throws IOException {
            su3 su3Var2;
            em9 em9Var = cqk.c;
            while (true) {
                int iS = su3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    su3Var2 = su3Var;
                    this.serverId = su3Var2.q();
                } else if (iS != 18) {
                    if (iS == 24) {
                        int I = sb8.I(su3Var, 24);
                        int[] iArr = this.profileOptions;
                        int length = iArr == null ? 0 : iArr.length;
                        int i = I + length;
                        int[] iArr2 = new int[i];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i - 1) {
                            iArr2[length] = su3Var.p();
                            su3Var.s();
                            length++;
                        }
                        iArr2[length] = su3Var.p();
                        this.profileOptions = iArr2;
                    } else if (iS == 26) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.p();
                            i2++;
                        }
                        su3Var.t(iC);
                        int[] iArr3 = this.profileOptions;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i3 = i2 + length2;
                        int[] iArr4 = new int[i3];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            iArr4[length2] = su3Var.p();
                            length2++;
                        }
                        this.profileOptions = iArr4;
                        su3Var.d(iE);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                    su3Var2 = su3Var;
                } else {
                    su3Var2 = su3Var;
                    this.restrictions = ck8.b(su3Var2, this.restrictions, em9Var, 5, 11, new RestrictionsInfo(), 8, 18);
                }
                su3Var = su3Var2;
            }
            return this;
        }

        @Override // defpackage.sia
        public void writeTo(uu3 uu3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                uu3Var.x(1, j);
            }
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                ck8.d(uu3Var, map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return;
                }
                uu3Var.w(3, iArr2[i]);
                i++;
            }
        }

        public static SelfProfile parseFrom(su3 su3Var) throws IOException {
            return new SelfProfile().mergeFrom(su3Var);
        }
    }
}
