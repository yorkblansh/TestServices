package com.walhalla.testservices

object Constants {

    const val PACKAGE_NAME = "com.walhalla.testservices"
    const val EXTRA_STARTED_FROM_NOTIFICATION: String = "$PACKAGE_NAME.started_from_notification"


    var type: SourceType = SourceType.INTERNAL //SourceType.FIRESTORE;

    enum class SourceType {
        INTERNAL, FIRESTORE, FIREBASE
    }

    interface ACTION {
        companion object {
            const val MAIN_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.main"
            const val INIT_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.init"
            const val PREV_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.prev"


            const val PLAY_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.playlist"
            const val NEXT_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.next"

            const val STARTFOREGROUND_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.startforeground"
            const val STOPFOREGROUND_ACTION: String = "$PACKAGE_NAME.foregroundservice.action.stopforeground"
        }
    }

    interface NOTIFICATION_ID {
        companion object {
            const val FOREGROUND_SERVICE: Int = 101
        }
    }

    interface EXTRA {
        companion object {
            const val PLAY_EXTRA: String = "key_current_song_123"
            const val ITEM_KEY: String = "key_sound_list_123"
        }
    }
}