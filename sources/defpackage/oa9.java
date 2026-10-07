package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class oa9 extends ya9 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa9(Executor executor, qg7 qg7Var, Object obj, int i) {
        super(executor, qg7Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.ya9
    public final p76 d(v78 v78Var) throws IOException {
        p76 p76VarC;
        InputStream inputStreamCreateInputStream;
        int i = this.c;
        int length = -1;
        Object obj = this.d;
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        switch (i) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) obj;
                Uri uri = v78Var.b;
                Uri uri2 = rki.a;
                if (uri.getPath() == null || !"content".equals(rki.b(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(rki.a.getPath())) {
                    String string = uri.toString();
                    if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                            if (parcelFileDescriptorOpenFileDescriptor == null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            p76VarC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                            parcelFileDescriptorOpenFileDescriptor.close();
                            if (p76VarC != null) {
                                return p76VarC;
                            }
                        } catch (FileNotFoundException unused) {
                            p76VarC = null;
                        }
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        return c(inputStreamOpenInputStream, -1);
                    }
                    ore.k("Required value was null.");
                    return null;
                }
                if (uri.toString().endsWith("/photo")) {
                    inputStreamCreateInputStream = contentResolver.openInputStream(uri);
                } else if (uri.toString().endsWith("/display_photo")) {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                    } catch (IOException unused2) {
                        qr7.k(zo5.l(uri, "Contact photo does not exist: "));
                        return null;
                    }
                } else {
                    InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                    if (inputStreamOpenContactPhotoInputStream == null) {
                        qr7.k(zo5.l(uri, "Contact photo does not exist: "));
                        return null;
                    }
                    inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                }
                if (inputStreamCreateInputStream != null) {
                    return c(inputStreamCreateInputStream, -1);
                }
                ore.k("Required value was null.");
                return null;
            case 1:
                InputStream inputStreamOpenInputStream2 = ((ContentResolver) obj).openInputStream(v78Var.b);
                if (inputStreamOpenInputStream2 != null) {
                    return c(inputStreamOpenInputStream2, -1);
                }
                ore.k("ContentResolver returned null InputStream");
                return null;
            default:
                AssetManager assetManager = (AssetManager) obj;
                Uri uri3 = v78Var.b;
                InputStream inputStreamOpen = assetManager.open(uri3.getPath().substring(1), 2);
                try {
                    assetFileDescriptorOpenFd = assetManager.openFd(uri3.getPath().substring(1));
                    length = (int) assetFileDescriptorOpenFd.getLength();
                } catch (IOException unused3) {
                    if (assetFileDescriptorOpenFd != null) {
                    }
                    return c(inputStreamOpen, length);
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                            break;
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                try {
                    assetFileDescriptorOpenFd.close();
                    break;
                } catch (IOException unused5) {
                }
                return c(inputStreamOpen, length);
        }
    }

    @Override // defpackage.ya9
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            case 1:
                return "QualifiedResourceFetchProducer";
            default:
                return "LocalAssetFetchProducer";
        }
    }
}
