function H = houseHolder(u)
% H = houseHolder(u) is used to solve for the houseHolder matrix
%example : u is a vector
%           u = [1,2,3];
%           H = E - 2*u*u'
%           H = [-1,-4,-6;-4,-7,-12;-6,-12,-17];

%examimine the arguments
    [m,n] = size(u);
    if m ~= 1 && n == 1
        H = eye(m) - 2*u*u';
    elseif m == 1 && n ~= 1
        H = eye(n) - 2*u'*u;
    else 
        disp("Error!")
    end
end
