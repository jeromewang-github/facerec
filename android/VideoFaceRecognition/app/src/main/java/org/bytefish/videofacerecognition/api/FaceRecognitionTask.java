/**
 * Copyright (c) 2014, Philipp Wagner <bytefish(at)gmx(dot)de>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted 
 * provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of 
 * conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of 
 * conditions and the following disclaimer in the documentation and/or other materials provided 
 * with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS 
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY 
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.bytefish.videofacerecognition.api;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.AsyncTask;
/**
 *
 * Performs the FaceDetection part in Background, because it might be a long running Task.
 * This implementation is problematic, because orientation changes (which are not  unlikely)
 * might kill the poor AsyncTask.
 */
public class FaceRecognitionTask extends AsyncTask<Void, String, String> {

    private Bitmap mImage;
    private Camera.Face mFace;

    public FaceRecognitionTask(Bitmap image, Camera.Face face) {
        mImage = image;
        mFace = face;
    }

    @Override
    protected String doInBackground(Void... params) {
        return new String();
    }

    @Override
    protected void onPostExecute(String result) {
        // ...
    }
}
