package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.work.WorkRequest;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mea {
    public static final ThreadLocal x = ThreadLocal.withInitial(new kn(5));
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ifh f;
    public final ifh g;
    public final ifh h;
    public final ifh i;
    public final ifh j;
    public final ifh k;
    public final ifh l;
    public final ifh m;
    public final ifh n;
    public final ifh o;
    public final ifh p;
    public final ifh q;
    public final ifh r;
    public final ifh s;
    public final ifh t;
    public final ifh u;
    public final ifh v;
    public final ifh w;

    public mea(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        final int i = 9;
        this.f = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                mea meaVar = this.b;
                switch (i2) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i2 = 0;
        this.g = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                mea meaVar = this.b;
                switch (i3) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i3 = 1;
        this.h = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                mea meaVar = this.b;
                switch (i4) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i4 = 2;
        this.i = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                mea meaVar = this.b;
                switch (i5) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i5 = 3;
        this.j = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                mea meaVar = this.b;
                switch (i6) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i6 = 4;
        this.k = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                mea meaVar = this.b;
                switch (i7) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i7 = 5;
        this.l = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                mea meaVar = this.b;
                switch (i8) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i8 = 6;
        this.m = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                mea meaVar = this.b;
                switch (i9) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i9 = 7;
        this.n = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                mea meaVar = this.b;
                switch (i10) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i10 = 8;
        this.o = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i11 = i10;
                mea meaVar = this.b;
                switch (i11) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i11 = 10;
        this.p = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i12 = i11;
                mea meaVar = this.b;
                switch (i12) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i12 = 11;
        this.q = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i13 = i12;
                mea meaVar = this.b;
                switch (i13) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i13 = 12;
        this.r = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i14 = i13;
                mea meaVar = this.b;
                switch (i14) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i14 = 13;
        this.s = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i15 = i14;
                mea meaVar = this.b;
                switch (i15) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i15 = 14;
        this.t = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i16 = i15;
                mea meaVar = this.b;
                switch (i16) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i16 = 15;
        this.u = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i17 = i16;
                mea meaVar = this.b;
                switch (i17) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i17 = 16;
        this.v = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i18 = i17;
                mea meaVar = this.b;
                switch (i18) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
        final int i18 = 17;
        this.w = new ifh(new af7(this) { // from class: jea
            public final /* synthetic */ mea b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i19 = i18;
                mea meaVar = this.b;
                switch (i19) {
                    case 0:
                        return meaVar.a.getString(R.string.message_link_reply_location);
                    case 1:
                        return meaVar.a.getString(R.string.message_link_reply_audio);
                    case 2:
                        return meaVar.a.getString(R.string.message_link_reply_audio_call);
                    case 3:
                        return meaVar.a.getString(R.string.message_link_reply_video_call);
                    case 4:
                        return meaVar.a.getString(R.string.message_link_forwarded);
                    case 5:
                        return meaVar.a.getString(R.string.messages_list_message_content_level_chat_reply_text);
                    case 6:
                        Drawable drawable = meaVar.a.getDrawable(R.drawable.icon_geolocation_fill_mini);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Drawable drawable2 = meaVar.a.getDrawable(R.drawable.icon_microphone_fill);
                        if (drawable2 != null) {
                            return drawable2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Drawable drawable3 = meaVar.a.getDrawable(R.drawable.icon_file_fill);
                        if (drawable3 != null) {
                            return drawable3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        return zo5.o(meaVar.a.getString(R.string.message_link_reply_contact), ":");
                    case 10:
                        Drawable drawable4 = meaVar.a.getDrawable(R.drawable.icon_phone_book_fill);
                        if (drawable4 != null) {
                            return drawable4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Drawable drawable5 = meaVar.a.getDrawable(R.drawable.icon_poll_fill);
                        if (drawable5 != null) {
                            return drawable5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Drawable drawable6 = meaVar.a.getDrawable(R.drawable.icon_call_outgoing_fill);
                        if (drawable6 != null) {
                            return drawable6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Drawable drawable7 = meaVar.a.getDrawable(R.drawable.icon_call_incoming_fill);
                        if (drawable7 != null) {
                            return drawable7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 14:
                        Drawable drawable8 = meaVar.a.getDrawable(R.drawable.icon_call_missed_fill);
                        if (drawable8 != null) {
                            return drawable8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Drawable drawable9 = meaVar.a.getDrawable(R.drawable.icon_video_call_outgoing_fill);
                        if (drawable9 != null) {
                            return drawable9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 16:
                        Drawable drawable10 = meaVar.a.getDrawable(R.drawable.icon_video_call_incoming_fill);
                        if (drawable10 != null) {
                            return drawable10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        return meaVar.a.getDrawable(R.drawable.icon_video_call_missed_fill).mutate();
                }
            }
        });
    }

    public final Layout a(u40 u40Var, boolean z, int i) {
        return ky8.a(h(), zo5.o((String) this.k.getValue(), ":"), i().a(q9i.v.h()), b(u40Var, ((vxb) g()).d(z, true), i), 1, false, null, 0.0f, false, 496);
    }

    public final int b(u40 u40Var, int i, int i2) {
        int iK;
        int iC;
        int iK2;
        t50 t50Var = u40Var.b;
        if (!(t50Var instanceof plg)) {
            if (t50Var instanceof y90) {
                iC = (int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), ((Number) ((vxb) g()).c.getValue()).intValue(), tqk.b(1000.0f, 30000.0f, oc9.x(((y90) t50Var).k, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
                iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
            } else {
                iK = t50Var instanceof oxi ? gm0.K(228.0f * yl5.d().getDisplayMetrics().density) : ((vxb) g()).e(i2);
            }
            return iK - i;
        }
        iC = prl.a(((plg) t50Var).a, ((vxb) g()).e(i2), 0, 0, -1).getWidth();
        iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        iK = iC - (iK2 * 2);
        return iK - i;
    }

    public final Layout c(CharSequence charSequence, u40 u40Var, boolean z, boolean z2, boolean z3, boolean z4, int i, Long l) {
        int iD = ((vxb) g()).d(z4, false);
        if (z) {
            iD = zo5.b(36.0f, yl5.d().getDisplayMetrics().density, iD);
        }
        int iB = b(u40Var, iD, i);
        if (!z2) {
            return ky8.a(h(), charSequence, i().a(q9i.w.h()), iB, 1, false, null, 0.0f, false, 496);
        }
        return oc9.h(this.a, h(), charSequence, iB, i().a(q9i.w.h()), new kea(z3, l, 1));
    }

    public final Layout d(String str, u40 u40Var, boolean z, int i, Drawable drawable) {
        CharSequence spannedString = str;
        if (drawable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            sb8.c(spannableStringBuilder, "\u200b", new lea(drawable));
            sb8.c(spannableStringBuilder, "\u200b", new tdg(gm0.K(2.0f * yl5.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((CharSequence) str);
            spannedString = new SpannedString(spannableStringBuilder);
        }
        return ky8.a(h(), spannedString, i().a(q9i.t.h()), b(u40Var, ((vxb) g()).d(z, false), i), 1, false, null, 0.0f, false, 496);
    }

    public final Layout e(CharSequence charSequence, u40 u40Var, boolean z, int i) {
        ky8 ky8VarH = h();
        if (charSequence == null) {
            charSequence = "";
        }
        return ky8.a(ky8VarH, charSequence, i().a(q9i.t.h()), b(u40Var, ((vxb) g()).d(z, false), i), 1, false, null, 0.0f, false, 496);
    }

    public final Layout f(int i, String str) {
        if (str.length() == 0) {
            str = this.a.getString(R.string.message_empty_transcription);
        }
        return ky8.a(h(), str, i().a(q9i.z.h()), ((vxb) g()).e(i), Integer.MAX_VALUE, false, null, 0.0f, false, 496);
    }

    public final a31 g() {
        return (a31) this.c.getValue();
    }

    public final ky8 h() {
        return (ky8) this.b.getValue();
    }

    public final knh i() {
        return (knh) this.e.getValue();
    }
}
