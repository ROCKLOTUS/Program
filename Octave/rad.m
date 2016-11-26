## Copyright (C) 2016 ROCK
## 
## This program is free software; you can redistribute it and/or modify it
## under the terms of the GNU General Public License as published by
## the Free Software Foundation; either version 3 of the License, or
## (at your option) any later version.
## 
## This program is distributed in the hope that it will be useful,
## but WITHOUT ANY WARRANTY; without even the implied warranty of
## MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
## GNU General Public License for more details.
## 
## You should have received a copy of the GNU General Public License
## along with this program.  If not, see <http://www.gnu.org/licenses/>.

## -*- texinfo -*- 
## @deftypefn {Function File} {@var{retval} =} rad (@var{input1}, @var{input2})
##
## @seealso{}
## @end deftypefn

## Author: ROCK <rock@rock-Satellite-L800>
## Created: 2016-11-25

function [retval] = rad (degree)
#this function is used to convert degree to rad 
#usage:
#       rad(45)
#       45*pi/180;
    retval = degree*pi/180;

endfunction
