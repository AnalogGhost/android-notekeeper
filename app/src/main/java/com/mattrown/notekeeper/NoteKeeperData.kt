package com.mattrown.notekeeper

class CourseInfo(val courseId: String, val title: String)

class NoteInfo(var course: CourseInfo, var Title: String, var text: String)